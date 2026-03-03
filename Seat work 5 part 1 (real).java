import java.util.Date;
public class DateDemo {
    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // Display time and date
        String str = String.format("Current Date/Time : %tc", date);
        System.out.println(str);
    }
}
