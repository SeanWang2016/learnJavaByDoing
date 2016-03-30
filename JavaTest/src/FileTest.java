import java.util.List;
import java.io.*;
import java.awt.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.*;


public class FileTest {
	private static Scanner scanner;
	static BufferedReader br = null;
	static void openFile1() throws IOException
	{
		//Path filePath = Paths.get("NewText.txt");
		File filePath = new File("NewText.txt");
		scanner = new Scanner(filePath);
		List<Integer> integerList = new ArrayList<Integer>();
		while (scanner.hasNext()) {
		    if (scanner.hasNextInt()) {
		        integerList.add(scanner.nextInt());
		    } else {
		        scanner.next();
		    }
		}
		Iterator<Integer> listItor=integerList.listIterator();
		while (listItor.hasNext())
		{
			System.out.println(listItor.next());
		}
	}
	static void openFileCharByChar(String fileName)
	{
		try {
			br = new BufferedReader(new FileReader(fileName));
			int nextByte;
			int counter = 0;
			while ((nextByte = br.read()) != -1)
			{
				char ch = (char) nextByte;
				if (++counter%3 ==0)
				{
					System.out.print(String.valueOf(ch));
				}
			}
			
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	static void openFileInString()
	{
		
		  try{

			    br = new BufferedReader(new FileReader("NewText.txt"));
			    String strLine;
			    //Read File Line By Line
			    while ((strLine = br.readLine()) != null)   {
			      // Print the content on the console
			      System.out.println (strLine);
			    }
			    //Close the input stream
			    br.close();
			    }catch (Exception e){//Catch exception if any
			      System.err.println("Error: " + e.getMessage());
			    }finally{
			    	try{
			    		if (br != null) {
			    			br.close();
			    		}
			    				
			    	}catch(IOException e)
			    	{
			    		
			    	}
			     
			    }
	}
	static void writeToNewFile(String [] texts)
	{
		Charset charset = Charset.forName("US-ASCII");
		//String s = "This is a test";
		Path file= Paths.get("letter.txt");
		if (texts != null)
		{
			try (BufferedWriter writer = Files.newBufferedWriter(file, charset))
			{
				
				for (String word:texts)
				{
					writer.write(word, 0, word.length());
					writer.newLine();
					
				}
				writer.close();
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
		}
	}
	static String[] getInput()
	{
		String [] lines = new String[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("You got a high score\n");
		System.out.println("Please enter your score:");
		lines[0]="Score: "+ sc.nextLine();
		System.out.println("Please enter your name:");
		lines[1]="Name: "+ sc.nextLine();
		System.out.println("Data stored into score.txt");
		sc.close();
		return lines;
	}
	public static void main(String[] args) throws IOException{
		//openFile1();
		//openFileInString();
		openFileCharByChar("puzzle.txt");
		//writeToNewFile(getInput());
		
	}
}