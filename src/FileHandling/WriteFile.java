package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void Do(String clientDetails) {
        File file = new File("src/FileHandling/Recipients.txt");
//        File file = new File("append.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);

            if (file.exists()){
                fr.write('\n');
            }
            fr.write(clientDetails);

            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}