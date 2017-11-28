
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Age {

	public static void main(String[] args) throws ParseException{
		Calendar todayCalendar=Calendar.getInstance();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Calendar dobCalendar=Calendar.getInstance();
		Date dob=df.parse("04/05/1995");
		dobCalendar.setTime(dob);
		int years=todayCalendar.get(Calendar.YEAR)-dobCalendar.get(Calendar.YEAR);
		if(todayCalendar.get(Calendar.DAY_OF_YEAR)>dobCalendar.get(Calendar.DAY_OF_YEAR)) {
			System.out.println(years+"Years");
		}
		else if(todayCalendar.get(Calendar.DAY_OF_YEAR)<dobCalendar.get(Calendar.DAY_OF_YEAR)) {
			System.out.println(--years+"Years");
		}
		else {
			System.out.println("Its your birthday");
		}
		if(todayCalendar.get(Calendar.MONTH)>dobCalendar.get(Calendar.MONTH)) {
			int months=todayCalendar.get(Calendar.MONTH)-dobCalendar.get(Calendar.MONTH);
			System.out.println(months+"Months");
		}
		else if(todayCalendar.get(Calendar.MONTH)<dobCalendar.get(Calendar.MONTH)) {
			int months=todayCalendar.get(Calendar.MONTH)-dobCalendar.get(Calendar.MONTH);
			System.out.println(12+months+"months");
		}
		else {
			System.out.println("0 months");
		}
	}
}
