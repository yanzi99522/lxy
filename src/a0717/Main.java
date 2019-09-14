package a0717;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String >friends=new ArrayList<>();
        friends.add("amy");
        friends.add("bob");
        friends.add("ca");
        System.out.println(friends);
        for (String  name:friends){
            System.out.println(name);
        }

        LocalDate date=LocalDate.now();
        System.out.println(date);
        DayOfWeek week=date.getDayOfWeek();
        System.out.println(week);
        int v=week.getValue();
        System.out.println(v);
        System.out.println(Math.PI);
    }
}
