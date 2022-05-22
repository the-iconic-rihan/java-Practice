package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    //    the throws handle's the exception that creates during the file creation
    public static void main(String[] args) throws IOException {
//        code to create new file
        File myFile = new File("practice.txt");
       /* myFile.createNewFile();
//        code to write txt file By writing the and creating the object of fileWriter n .
        FileWriter fileWriter = new FileWriter("practice.txt");
//        the write method of fileWriter is used to enter the string  number or character in file
        fileWriter.write("This is a new file created using java file  handling");*/
      /*  Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();*/
        if (myFile.delete()) {
            System.out.println("I have deleted the practice.txt");
        }
        else{
            System.out.println("Some error occur while deleting a file.");
        }
    }
}
