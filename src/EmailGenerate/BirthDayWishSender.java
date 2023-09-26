package EmailGenerate;

import BirthDayFinder.EmailSendCheck;
import EmailSend.EmailContent;

import java.util.List;

import static BirthDayFinder.EmailSendCheck.*;

public class BirthDayWishSender extends EmailSender{
    private List<EmailContent> emailList;

    public BirthDayWishSender(EmailGenerator EmailType) {
        super(EmailType);
         emailList = (List<EmailContent>) EmailType.Do();
         emailList = EmailSendCheck.checked(emailList);
    }
    public void handle(){
        handle(emailList);
    }

}
