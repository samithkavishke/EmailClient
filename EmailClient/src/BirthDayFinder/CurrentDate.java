package BirthDayFinder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static String get(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd");
        String str = formatter.format(date);

        return str;
    }

    public static String getWithYear(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String str1 = formatter.format(date);

        return str1;
    }
}