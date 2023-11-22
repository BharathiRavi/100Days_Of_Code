/**
 * Datesort
 */
import java.util.ArrayList;
public class Datesort {

    public static void main(String[] args) {
        String[] date={"12/10/1999","4/2/2000"};
        ArrayList<DateClass> dates=new ArrayList<>();
        for(int i=0;i<date.length;i++){
            System.out.println(date[i]);
            // Date valid=new Date(date[i]);
            // System.out.println(valid);
            // dates.add(valid);
            dates.add(new DateClass(date[i]));
        }
        
        dates.sort(null);
        System.out.println(dates);

    }
}
