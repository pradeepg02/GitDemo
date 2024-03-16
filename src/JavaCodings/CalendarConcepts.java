package JavaCodings;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarConcepts {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); //likewise we have done for date, we are doing with calendar now
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");//this is used to convert a date in simple format
		System.out.println(sdf.format(cal.getTime())); //calendar instance of getting time
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); 
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.MILLISECOND));
        //Likewise we can use many things. Suggestions will come if we give Calendar.)

	}

}
