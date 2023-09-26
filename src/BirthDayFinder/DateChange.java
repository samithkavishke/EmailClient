package BirthDayFinder;

import java.util.List;

public class DateChange {
    public static String removeYear(String yyMMdd){
        List<String> stringList = List.of(yyMMdd.split("/"));
        return stringList.get(1)+'/'+stringList.get(2);
    }
}
