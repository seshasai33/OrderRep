
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Age {

	public static void main(String[] args) throws ParseException{
		Calendar todayCalendar=Calendar.getInstance();
		Calendar dobCalendar=Calendar.getInstance();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date dob=df.parse("04/05/1995");
		dobCalendar.setTime(dob);
		int years=todayCalendar.get(Calendar.YEAR)-dobCalendar.get(Calendar.YEAR);
		int months=todayCalendar.get(Calendar.MONTH)-dobCalendar.get(Calendar.MONTH);
		if(todayCalendar.get(Calendar.DAY_OF_YEAR)>dobCalendar.get(Calendar.DAY_OF_YEAR)) {
			System.out.println(years);
		}
		else if(todayCalendar.get(Calendar.DAY_OF_YEAR)<dobCalendar.get(Calendar.DAY_OF_YEAR)) {
			System.out.println(years=years-1);
		}
		else {
			System.out.println("Its your birthday");
		}
		if(todayCalendar.get(Calendar.MONTH)>dobCalendar.get(Calendar.MONTH)) {
			
			System.out.println(months);
		}
		else if(todayCalendar.get(Calendar.MONTH)<dobCalendar.get(Calendar.MONTH)) {
			System.out.println(12+months);
		}
		else {
			System.out.println("Birthday month");
		}
	}
}
