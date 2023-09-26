package EmailSend;

import BirthDayFinder.CurrentDate;

import java.io.Serializable;

public class EmailContent  implements Serializable {

    private String EmailDate;
    private String EmailTo;
    private String EmailFrom = "samithkarunathilake@gmail.com";
    private String EmailBody;
    private String Subject;
    private String Greeting;


    private static final long serialVersionUID = 1591991628746197140L;

    public EmailContent(String emailTo, String emailBody, String subject, String greeting) {
        EmailTo = emailTo;
        EmailBody = emailBody;
        Subject = subject;
        Greeting = greeting;
        EmailDate = CurrentDate.getWithYear();
    }

    public String getGreeting() {
        return Greeting;
    }

    public String getSubject() {
        return Subject;
    }

    public String getEmailBody() {
        return EmailBody;
    }

    public String getEmailFrom() {
        return EmailFrom;
    }

    public String getEmailTo() {
        return EmailTo;
    }

    public String getEmailDate() {
        return EmailDate;
    }
    public boolean equals(EmailContent other){

        if(!EmailTo.equals(other.EmailTo)) return false;
        else if (!EmailBody.equals(other.EmailBody)) return false;
        else if (!Subject.equals(other.Subject)) return false;
        else if (!Greeting.equals(other.Greeting)) return false;
        else if (!EmailDate.equals(other.EmailDate)) return false;
        else return true;
    }

    public void show(){
        System.out.println("Email To:"+EmailTo);
        System.out.println("Current Date:"+EmailDate);
        System.out.println("Subject :"+Subject);
        System.out.println(Greeting);
        System.out.println(EmailBody);
    }


}
