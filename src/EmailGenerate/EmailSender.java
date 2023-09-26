package EmailGenerate;

import EmailSend.EmailContent;
import EmailSend.SendEmailTLS;
import ObjectSerialization.SaveObjects;

import java.util.List;

public abstract class EmailSender {

    private EmailGenerator EmailType;

    public EmailSender(EmailGenerator EmailType){
        this.EmailType = EmailType;
    }

    public abstract void handle();

    protected void handle(EmailContent email){
        SaveObjects.Do(email);
        SendEmailTLS.sendMail(email);
    }

    protected void handle(List<EmailContent> list){
        for(EmailContent email: list){
            SaveObjects.Do(email);
            SendEmailTLS.sendMail(email);
        }
    }


}
