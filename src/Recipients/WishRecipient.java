package Recipients;

import BirthDayFinder.DateChange;
import EmailSend.ClientData;
import EmailSend.EmailContent;
import ObjectSerialization.SaveObjects;

public abstract class WishRecipient  extends Recipient{
    protected String birthDate;
    protected String emailAddress;
    protected String name;

    protected WishRecipient(String name,String emailAddress,String birthDate) {
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.name = name;
    }

    protected void Save(){
        super.Save();
        ClientData.setWishData(this);
    }

    public String getBirthDate() {
        String neededDate =DateChange.removeYear(birthDate);
        return neededDate;
    }

    public abstract EmailContent sendBirthDayWish();

}
