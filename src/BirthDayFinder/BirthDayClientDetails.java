package BirthDayFinder;

import Recipients.WishRecipient;

import java.util.Date;
import java.util.List;

public class BirthDayClientDetails {
    private List<WishRecipient> WishList ;

    public void  get(String Date){
        String NextDate = DateChange.removeYear(Date);
        WishList = WhoHasBirthDays.find(NextDate);

        for(WishRecipient wishRecipient: WishList){
            wishRecipient.show();
            System.out.println("\n");
        }
    }
}
