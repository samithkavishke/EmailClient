package EmailGenerate;

import BirthDayFinder.CurrentDate;
import BirthDayFinder.WhoHasBirthDays;
import EmailSend.EmailContent;
import Recipients.WishRecipient;

import java.util.ArrayList;
import java.util.List;

public class BirthdayWishGenerator extends EmailGenerator{

    private List<EmailContent> emailList = new ArrayList<>();
    private String inputDate;

    public BirthdayWishGenerator(){
        this.inputDate= CurrentDate.get();
    }

    public List<EmailContent> Do(){
        List<WishRecipient> list =WhoHasBirthDays.find(inputDate);
        for(WishRecipient wishRecepient :list){
            emailList.add(wishRecepient.sendBirthDayWish());
        }

        return emailList;
    }

}
