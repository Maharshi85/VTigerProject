package COM.CRM.VTiger.GenericUtilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
/**
 * Here we fetch the random number.
 * @author Maharshi
 * @return
 */
	public int randomNumber()
	{
		//int x=(int)Math.random()*1000;
		//return x;
		Random r=new Random();
		return r.nextInt(1000);
	}
/**
 * Here we fetch the date and time because while taking a screenshot at what time we take that 
 * Screenshot we get to know.
 * @author Maharshi
 * @return
 */
	public String getDate()
	{
		Date d=new Date();
		String date=d.toString();
		return date;
	}
	public String modifyDate()
	{
//		Calendar c=Calendar.getInstance();
//		Date d=c.getTime();
//		SimpleDateFormat s=new SimpleDateFormat("MM_dd_yyyy");
//		String s1=s.format(d);
//		return s1;
		Date d=new Date();
		String []s=d.toString().split(" ");
		String date=s[2];
		String month=s[1];
		String time=s[3].replace(":","_");
		String current=date+" "+month+" "+time;
		return current;
	}
}
