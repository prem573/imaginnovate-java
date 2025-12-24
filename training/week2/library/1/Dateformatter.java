import java.text.DateFormat;
import java.util.Date;
public class Dateformatter{
    public static void main (String [] args){
 Date d = new Date();
    System.out.println(d);
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df);
        System.out.println(df.format(d));
    }
}