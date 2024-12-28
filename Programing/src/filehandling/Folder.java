package filehandling;

import java.io.File;

public class Folder {

	
	public static void CreateFolder(String folderpath)
	{
		File folder=new File(folderpath);
		
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println(" Folder is created.....");
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		String str="C:\\Users\\srika\\OneDrive\\Documents\\sri";
		CreateFolder(str);
		
		
	}
	
	
	
}
