package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AllFile {

	
	public static void CreateFile(String filepath) throws IOException
	{
		File file=new File(filepath);
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		else
		{
			System.out.println(" file already exists....");
		}
	}
	
	public static void Renamefile(String oldfilepath,String newfilepath)
	{
		
		File oldfile=new File(oldfilepath);
		File newfile=new File(newfilepath);

		oldfile.renameTo(newfile);
		
	}
	public static void Datainfile(String filepath) throws IOException
	{
		
		FileWriter filewriter=new FileWriter(filepath);
		filewriter.write(" welcome to file handling page.....");
		filewriter.close();
		
		
	}
	
	public static void ReadFile(String filepath) throws FileNotFoundException
	{
		
		File file=new File(filepath);
		Scanner obj=new Scanner(file);
		while(obj.hasNextLine())
		{
			String line=obj.nextLine();
			System.out.println(line);
			
		}
		
	}
	
	public static void main(String args[]) throws IOException
	{
		String str1="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile.txt";
		String str2="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile1.txt";

		CreateFile(str1);
		Renamefile(str1,str2);
		Datainfile(str2);
		ReadFile(str2);
	}
	
}
