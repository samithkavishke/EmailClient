package EmailSend;

import ObjectSerialization.TakeObjects;

import java.util.List;

public class ShowEmails {
    public static void get(String Date){
        List<EmailContent> sentEmails = TakeObjects.deserialize();
        for(EmailContent email: sentEmails){
            if(Date.equals(email.getEmailDate())) {
                email.show();
                System.out.println("\n");
            }
        }
    }
}
