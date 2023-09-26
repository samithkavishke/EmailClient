package Recipients;

import EmailSend.ClientData;
import EmailSend.EmailContent;

public class PersonalRecipient extends WishRecipient {
//    sunil,<nick-name>,sunil@gmail.com,2000/10/10

    private final String recipientType;

    private String nickName;

    public PersonalRecipient(String[] dataList) {

        super(dataList[0],
                dataList[2],
                dataList[3]);

        nickName = dataList[1];
        recipientType = "Personal";

//        ClientData.setWishData(this);
        Save();
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public EmailContent sendBirthDayWish() {

        var content = new EmailContent(emailAddress,
            "Wish you a Happy Birthday and hugs and love on your birthday",
            "BirthDay Wish",
            "Dear " + name + ',');

        return content;

    }

    @Override
    public void show() {
        System.out.println("Name :"+name);
        System.out.println("EmailAddress :"+emailAddress);
        System.out.println("Nick Name :"+nickName);
        System.out.println("BirthDate :"+birthDate);
    }
}
