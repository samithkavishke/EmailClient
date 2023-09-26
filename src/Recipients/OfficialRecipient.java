package Recipients;

import java.util.List;

public class OfficialRecipient extends Recipient{
//    nimal,nimal@gmail.com,ceo

    private final String recipientType;
    private final String name;
    private final String emailAddress;
    private final String position;
    public OfficialRecipient(String[] recipientInput) {

//        List<String> dataList = List.of(recipientInput.split(","));
        name = recipientInput[0];
        emailAddress = recipientInput[1];
        position = recipientInput[2];
        recipientType = "Official";
        Save();
    }

//    public String getPosition() {
//        return position;
//    }

    @Override
    public void show() {
        System.out.println("Name :"+name);
        System.out.println("EmailAddress :"+emailAddress);
        System.out.println("Position :"+position);

    }
}
