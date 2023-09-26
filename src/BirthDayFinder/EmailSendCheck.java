package BirthDayFinder;

import EmailSend.EmailContent;
import ObjectSerialization.TakeObjects;
import Recipients.WishRecipient;

import java.util.ArrayList;
import java.util.List;

public abstract class EmailSendCheck implements List<EmailContent> {

    public EmailSendCheck(List<EmailContent> emailList) {
    }

    public static List<EmailContent> checked(List<EmailContent> PendingEmailList){
        List<EmailContent> ReturnEmailList =new ArrayList<EmailContent>();
        Boolean isSent;
        var SentEmailList = TakeObjects.deserialize();
        for(EmailContent pendingEmail: PendingEmailList){
            isSent = false;
            for(EmailContent sentEmail : SentEmailList ){
                if(pendingEmail.equals(sentEmail)){
                    isSent = true;
                    break;
                }
            }
            if (!isSent) {
                ReturnEmailList.add(pendingEmail);
            }
        }
        return ReturnEmailList;
    }
}
