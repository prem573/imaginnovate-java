import java.util.Calendar;
public class Calendarr{
    public static void main (String [] args){
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time: " + cal.getTime());
        int year = cal.get(Calendar.YEAR);
int month = cal.get(Calendar.MONTH);   // 0 = January
int day = cal.get(Calendar.DAY_OF_MONTH);

System.out.println(year);
System.out.println(month);
System.out.println(day);

    }
}