package EmailSend;

import ObjectSerialization.SaveObjects;
import Recipients.WishRecipient;
import Recipients.Recipient;

import java.util.ArrayList;
import java.util.List;

public class ClientData {
    private static List<Recipient> ClientDataList =new ArrayList<>();
    private static List<WishRecipient> WishDataList = new ArrayList<>();

    public static List<Recipient>  getClientDataList() {
        for(Recipient recep : ClientDataList){
            recep.show();
            System.out.println("\n");
        }
        return ClientDataList;
    }

    public static void setClientData(Recipient person) {
        ClientDataList.add(person);
    }

    public static List<WishRecipient> getWishDataList() {
        return WishDataList;
    }
    public static void setWishData(WishRecipient client){
        WishDataList.add(client);
        }

    public static int getCount(){
        return ClientDataList.size();
    }

    }

