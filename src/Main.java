import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void main(String[] args) {
// FileReader with BufferReader
        String filePath = "file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line=reader.readLine()) !=null){
                System.out.println(line);
            }
        }
        // buffer reader doesn't work alone
//        it require u to pass a file reader obj to it

        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Done!");
        }


    }
}


