import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumSum {
	private static Scanner input;
	public static void main (String [] args) throws FileNotFoundException
	{
		String outputStr = "";
		int sum = 0;
		int num = 0;
		boolean bFirst = true;
		File source = new File("3nums.txt");
		try {
			input = new Scanner(source);
			while(input.hasNext())
			{
				if(input.hasNextInt())
				{
					num = input.nextInt();
					sum += num;
					if (! bFirst)
					{
						if (num>0)
						{
							outputStr = outputStr + " + " + num;
						}else
						{
							outputStr = outputStr + " - " + Math.abs(num);
						}
					}else
					{
						outputStr = Integer.toString(num);
						bFirst = false;
					}
				}
			}
			outputStr += " = " + sum;
			System.out.println(outputStr);
			input.close();
		}catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			input.close();
		}
	}
}