package fileops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileAndWriteFile {
    public static void main(String[] args) throws IOException {
        //Open a file and pass the path - it works as file opener
        File file = new File(System.getProperty("user.dir") + "/src/fileops/sample.txt");

        // Scanner will scan through each lines
        // throws checked exception
        Scanner scanner = new Scanner(file);

        // to get the first line of the text file
        //System.out.println(scanner.nextLine());

        // to print all the lines
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        // writing a new file

        // store the string first of the old file
        String oldFileContents = "";
        while(scanner.hasNextLine()){
            oldFileContents = oldFileContents.concat(scanner.nextLine()+"\n");
        }

        // create object of FileWriter Class and pass that path
        FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "/src/fileops/sample2.txt");
        fileWriter.write(oldFileContents);
        fileWriter.close();
    }
}
