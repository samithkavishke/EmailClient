// your index number

//import libraries

import BirthDayFinder.BirthDayClientDetails;
import EmailGenerate.BirthDayWishSender;
import EmailGenerate.BirthdayWishGenerator;
import EmailGenerate.CustomEmailGenerator;
import EmailGenerate.CustomEmailSender;
import EmailSend.ClientData;
import EmailSend.ShowEmails;
import FileHandling.AddToClients;
import FileHandling.ReadFile;
import FileHandling.WriteFile;
import ObjectSerialization.TakeObjects;

import java.util.Scanner;

public class Email_Client {

    public static void main(String[] args) {


        ReadFile.Do();
        Boolean condition = true;

        while(condition) {

            var Handler1 = new BirthDayWishSender(new BirthdayWishGenerator());
            Handler1.handle();


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter option type: \n"
                    + "1 - Adding a new recipient\n"
                    + "2 - Sending an email\n"
                    + "3 - Printing out all the recipients who have birthdays\n"
                    + "4 - Printing out details of all the emails sent\n"
                    + "5 - Printing out the number of recipient objects in the application");


            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Type(Official,Office_friend,Personal): name,email,position");
                    scanner.nextLine();
                    String detail = scanner.nextLine();
                    AddToClients.Do(detail);
                    WriteFile.Do(detail);
                    // input format - Official: nimal,nimal@gmail.com,ceo
                    // Use a single input to get all the details of a recipient
                    // code to add a new recipient
                    // store details in clientList.txt file
                    // Hint: use methods for reading and writing files
                    break;
                case 2:
                    System.out.println("input format - email, subject, content");
                    scanner.nextLine();
                    String emailContent = scanner.nextLine();
                    var Handler = new CustomEmailSender(new CustomEmailGenerator(emailContent));
//                    var Handler1 = new BirthDayWishSender(new BirthdayWishGenerator(emailContent));
//                    Handler1.handle();
                    Handler.handle();
//                CustomEmailGenerator.send(emailContent);
//                List<String> StringList = List.of(emailContent.split(","));

                    // input format - email, subject, content
                    // code to send an email
                    break;
                case 3:
                    // need to change
                    System.out.println("ex: 2018/09/17");
                    scanner.nextLine();
                    String RecipientInputDate = scanner.nextLine();
                    var obj = new BirthDayClientDetails();
                    obj.get(RecipientInputDate);


                    // input format - yyyy/MM/dd (ex: 2018/09/17)
                    // code to print recipients who have birthdays on the given date
                    break;
                case 4:
                    System.out.println("ex: 2018/09/17");
                    scanner.nextLine();
                    String EmailInputDate = scanner.nextLine();
                    ShowEmails.get(EmailInputDate);

//                    TakeObjects.deserialize();
                    // input format - yyyy/MM/dd (ex: 2018/09/17)
                    // code to print the details of all the emails sent on the input date
                    break;
                case 5:
                    System.out.println(ClientData.getCount());
                    ClientData.getClientDataList();
                    // code to print the number of recipient objects in the application
                    break;
                case -1:
                    condition =false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
        // start email client
        // code to create objects for each recipient in clientList.txt
        // use necessary variables, methods and classes

    }
}

// create more classes needed for the implementation (remove the  public access modifier from classes when you submit your code)