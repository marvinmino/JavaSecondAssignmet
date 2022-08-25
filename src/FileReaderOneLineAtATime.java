import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderOneLineAtATime {
    private String _filePath;
    private File _file;
    private Scanner _scanner;

    public FileReaderOneLineAtATime(String filePath) throws FileNotFoundException {
        _filePath = filePath;
        _file = new File(_filePath);

        if(!_file.exists()){
            throw new FileNotFoundException("File not found");
        }

        _scanner = new Scanner(_file);
    }

    boolean HasOtherPerson(){
        if(_scanner.hasNextLine()){
            return true;
        }
        _scanner.close();
        return false;
    }

    Person ReadNextPerson(){
        String data = _scanner.nextLine();
        return new Person(data.split(","));
    }
}