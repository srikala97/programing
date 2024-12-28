package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void Readdatafile(String filepath) throws FileNotFoundException
	{
		File file=new File(filepath);
		Scanner obj=new Scanner(file);
		
		while(obj.hasNextLine())
		{
			String line=obj.nextLine();
			System.out.println(line);
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		String str="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile1.txt";
		Readdatafile(str);

		
	}
	
	
}
