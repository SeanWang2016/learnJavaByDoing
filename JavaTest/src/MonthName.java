public class MonthName
{
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
	

	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
}
