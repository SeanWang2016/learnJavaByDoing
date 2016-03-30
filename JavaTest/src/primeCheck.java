import java.awt.*;
public class primeCheck {

public static void main(String[] args)
{
	for (int i=1; i<=100; i++)
	{
		if (isPrime(i))
		{
			System.out.println(i);
		}
	}
}

public static boolean isPrime(int n )
{
	boolean isPrime=true;
	int tmpNum;
	tmpNum=n;
	if (n>=2) 
	{
		for( int i=2; i <= tmpNum; i++ )	
		{
			if (n%i==0 && i!=n)
			{
				isPrime=false;
				break;
								
			}
			else
			{
				tmpNum=(n+1)/i;				
			}
				
		}
		
	}
	else
	{
		isPrime=false;
	}
	return isPrime;
}
}