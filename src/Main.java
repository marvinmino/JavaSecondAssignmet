import java.io.FileNotFoundException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        try{
            FileReaderOneLineAtATime reader = new FileReaderOneLineAtATime("C:\\Users\\marvi\\IdeaProjects\\secondAssigment\\src\\file.txt");
            HashSet<String> names = new HashSet<String>();
            HashSet<String> cities = new HashSet<String>();

            while(reader.HasOtherPerson()){
                Person person = reader.ReadNextPerson();
                names.add(person.get_name());
                cities.add(person.get_city());
            }

            System.out.println("The number of distinct names is: " + names.size());
            System.out.println("The number of distinct cities is: " + cities.size());
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (Exception e){
            System.out.printf("There was an error with reading the file");
        }
    }
}
