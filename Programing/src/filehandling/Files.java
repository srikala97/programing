package filehandling;

import java.io.File;
import java.io.IOException;

public class Files {

	
	//creating a file in folder
	public static void FileCreation(String filepath) throws IOException
	{
		File file=new File(filepath);
		if(file.createNewFile())
		{
			System.out.println(" New file is created..."+file.getName());
		}
		else
		{
			System.out.println(" File is already exists....");
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{
		String filepath="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile1";
		FileCreation(filepath);
		
		
	}
	
	
	
}
