import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on ");
		System.out.println("10 13 2000 => " + weekday(mm,dd,yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";
		
		
		// bunch of calculations go here
		//Find the number of years since 1900, and put it into a variable called yy. Simply subtract 1900 from the year to get this. 
		yy=yyyy-1900;
		//Divide the number of years since 1900 by 4. Put the quotient in a variable called total. 
		total=yy/4;
		//Also add the number of years since 1900 to total. 
		total+=yy;
		//Add the day of the month to total. 
		total+=dd;
		//Using the function month_offset() you wrote, find the "month offset" and add it to total. 
		total+=month_offset(mm);
		//If the year is a leap year and if the month you are working with is either January or February, then subtract 1 from the total
		if (is_leap(yyyy) && mm<=2 && mm>=1)
		{
			total-=1;
		}
		

		date = weekdayName(total%7) + "," + month_name(mm) + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	public static String month_name( int month )
	{
		String result;
		switch  (month)
		{
		case 1: result="January";
				break;
		case 2:	result="Feburary";
				break;
		case 3: result="March";
				break;
		case 4:	result="April";
				break;
		case 5:	result="May";
				break;
		case 6:	result="June";
				break;
		case 7:	result="July";
				break;
		case 8:	result="August";
				break;
		case 9:	result="September";
				break;
		case 10:	result="Octobor";
				break;
		case 11:	result="November";
				break;
		case 12:	result="December";
				break;
		default: result="Wrong Input!";
		}
		
		return result;
	}
	
	public static String weekdayName( int day )
	{
		String result;
		switch  (day)
		{
		case 0: result="Saturday";
				break;
		case 1: result="Sunday";
				break;
		case 2: result="Monday";
				break;
		case 3:	result="Tuesday";
				break;
		case 4: result="Wednesday";
				break;
		case 5:	result="Thursday";
				break;
		case 6:	result="Friday";
				break;
		default: result="Wrong Input!";
		}
		
		return result;
	}
	public static int month_offset( int month )
	{
		int result;
		switch  (month)
		{
		case 1: result=1;
				break;
		case 2:	result=4;
				break;
		case 3: result=4;
				break;
		case 4:	result=0;
				break;
		case 5:	result=2;
				break;
		case 6:	result=5;
				break;
		case 7:	result=0;
				break;
		case 8:	result=3;
				break;
		case 9:	result=6;
				break;
		case 10:	result=1;
				break;
		case 11:	result=4;
				break;
		case 12:	result=6;
				break;
		default: result=-1;
		}
		
		return result;
	}
	
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
