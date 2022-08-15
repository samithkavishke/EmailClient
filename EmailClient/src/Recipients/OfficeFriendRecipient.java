package Recipients;

import EmailSend.ClientData;
import EmailSend.EmailContent;

import java.util.List;

public class OfficeFriendRecipient extends WishRecipient {

        //kamal,kamal@gmail.com,clerk,2000/12/12
        private String recipientType;
        private String position;
        public OfficeFriendRecipient(String[] recipientInput){

            super(recipientInput[0],recipientInput[1],recipientInput[3]);
            position = recipientInput[2];
            recipientType = "Office_friend";
            Save();
        }


        public String getPosition() {
                return position;
        }

        @Override
        public EmailContent sendBirthDayWish() {

                var content = new EmailContent(emailAddress,
                        "Wish you a Happy Birthday",
                        "BirthDay Wish",
                        "Dear " + name + ',');
                return content;
        }

        @Override
        public void show() {
                System.out.println("Name :"+name);
                System.out.println("EmailAddress :"+emailAddress);
                System.out.println("Position :"+position);
                System.out.println("BirthDate :"+birthDate);
        }
}
