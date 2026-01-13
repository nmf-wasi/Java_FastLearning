import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static void main(String[] args) {
//  FileWriter
        String filepath="File.txt";
        try(FileWriter fileWriter=new FileWriter(filepath);){
            System.out.println("Openeded the file!");
//            fileWriter.write("I am in!!");
        String content= """
                idk what to write
                i am just passiing time
                """;
        fileWriter.write(content);
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.toString());
            e.fillInStackTrace();
        }
    }
}


