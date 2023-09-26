package FileHandling;

import java.io.*;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    private static String path_name = "src/FileHandling/Recipients.txt";

        public static void Do () {
            File myFile = new File(path_name);
            if(myFile.exists())

            {
            try {
                Scanner myReader = new Scanner(myFile);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    AddToClients.Do(data);
    //                System.out.println(data);
                }

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

}