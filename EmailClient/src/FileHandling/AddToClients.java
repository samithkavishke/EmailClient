package FileHandling;

import EmailSend.ClientData;
import Recipients.OfficeFriendRecipient;
import Recipients.OfficialRecipient;
import Recipients.PersonalRecipient;
import Recipients.Recipient;

import java.util.List;

public class AddToClients {
    public static void Do(String details) {
        Recipient person = getRecipient(details);
//        ClientData.setClientData(person);
    }

     private static Recipient getRecipient(String details) {
        List<String> TypeData = List.of(details.split(" "));
        String RecipientType = TypeData.get(0);
        String[] recipientInput = TypeData.get(1).split(",");

        switch (RecipientType){
            case "Official:" :
                return new OfficialRecipient(recipientInput);
            case "Office_friend:" :
                return new OfficeFriendRecipient(recipientInput);
            case "Personal:" :
                return new PersonalRecipient(recipientInput);


        }

        return null;
    }
}
