package Recipients;

import EmailSend.ClientData;
import FileHandling.AddToClients;

public abstract class Recipient {

    private String name;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    protected void Save(){
        ClientData.setClientData(this);
    }

    public abstract void show();
}
