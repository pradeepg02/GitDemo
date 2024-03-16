package JavaCodings;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateConcepts {

	public static void main(String[] args) {

		Date d = new Date();
		//System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");//this is used to convert a date in simple format
		System.out.println(sdf.format(d)); //format is used to convert the date from d to this format
	}

}
