package BirthDayFinder;

import EmailSend.ClientData;
import Recipients.WishRecipient;

import java.util.ArrayList;
import java.util.List;

public class WhoHasBirthDays {

    private static List<WishRecipient> SortedList ;
    public static List<WishRecipient>  find(String Date) {
        SortedList = new ArrayList<>();
//        String requiredDate = DateChange.removeYear(Date);
        var wishRecipientList = ClientData.getWishDataList();

        for (WishRecipient wishRecipient : wishRecipientList) {
            String birthdate = wishRecipient.getBirthDate();
            if (birthdate.equals(Date)) {
                SortedList.add(wishRecipient);

            }
        }
        return SortedList;
    }
}
