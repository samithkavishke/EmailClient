package ObjectSerialization;
import EmailSend.EmailContent;

import java.io.*;

//class Demo implements java.io.Serializable
//{
//    public int a;
//    public String b;
//
//    // Default constructor
//    public Demo(int a, String b)
//    {
//        this.a = a;
//        this.b = b;
//    }
//
//}

public class SaveObjects
{
//    public static void main(String[] args) {
////        var email = new EmailContent("samithkarunathilake@gmail.com","samithkkaru@gmail.com","hi","hello","ado");
//        var did = new Demo();
//        Do(did);
//    }
    public static void Do(EmailContent content)
    {

        String filename = "src/ObjectSerialization/file.ser";

        // Serialization
        try
        {
            FileOutputStream file = new FileOutputStream(filename,true);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(content);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }
}
