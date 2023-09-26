package EmailGenerate;

import EmailSend.EmailContent;

import java.util.List;

public class CustomEmailSender extends EmailSender{

    private  EmailContent email;

    public CustomEmailSender(EmailGenerator EmailType) {
        super(EmailType);
        this.email =(EmailContent) EmailType.Do();
    }

    @Override
    public void handle() {
        super.handle(email);
    }
}
