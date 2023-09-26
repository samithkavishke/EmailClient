package ObjectSerialization;

import EmailSend.EmailContent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TakeObjects {
    private static List<EmailContent> DeserializedEmailList = new ArrayList<EmailContent>();
    public static List<EmailContent> deserialize() {

        DeserializedEmailList = new ArrayList<EmailContent>();
//        C:\ENGINEERING\Program Construction\Practise\Project\EmailClient\src\ObjectSerialization\
        String filename = "src/ObjectSerialization/file.ser";
        File myFile = new File(filename);
        if(myFile.exists()){
            try {
    //            File file = new File(filename);
                FileInputStream file = new FileInputStream(filename);

                ObjectInputStream inObj = null;

                while (true) {
                    try {
                        inObj = new ObjectInputStream(file);
                        EmailContent obj = (EmailContent) inObj.readObject();
                        DeserializedEmailList.add(obj);
    //                    obj.show();
    //                    System.out.println(obj.getEmailBody());
                    } catch (EOFException e) {
                        break;
                    }
                }

                inObj.close();
                file.close();

            } catch (FileNotFoundException e) {

                System.out.println("No objects presents");
//                DeserializedEmailList = new ArrayList<>();
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }
        return DeserializedEmailList;
    }
}
