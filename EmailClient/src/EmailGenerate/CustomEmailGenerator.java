package EmailGenerate;

import EmailSend.EmailContent;

import java.util.List;

public class CustomEmailGenerator extends EmailGenerator{

    private String content;
    public CustomEmailGenerator(String content){
        this.content = content;
    }

    public EmailContent Do(){
        List<String> details = List.of(content.split(","));
        String emailTo = details.get(0);
        String subject = details.get(1);
        String emailBody = details.get(2);

//        var emailContent = new EmailContent(String emailTo, String emailFrom, String emailBody, String subject, String greeting)
        return new EmailContent( emailTo, emailBody, subject, "Dear Chandima,");
    }
}
