package filehandling;

import java.io.File;

public class Allfolder {

	
	
	public static void CreateFolder(String folderpath)
	{
		
		File folder=new File(folderpath);
		if(!folder.exists())
		{
			folder.mkdir();
		}
		
	}
	
	
	public static void Checkfolder(String folderpath)
	{
		File folder=new File(folderpath);
		boolean exist=folder.exists();
		System.out.println(exist);
		
		
	}
	
	
	public static void Rename(String oldpath,String newpath)
	{
		
		File oldfolder=new File(oldpath);
		File newfolder=new File(newpath);
		oldfolder.renameTo(newfolder);
		
	}
	
	public static void Delete(String folderpath)
	{
		File folder=new File(folderpath);
		{
			if(folder.exists())
			{
				for(File file:folder.listFiles())
				{
					file.delete();
				}
			}
			
			folder.delete();
		}
	}
	
	public static void main(String[] args)
	{
		String str1="C:\\Users\\srika\\OneDrive\\Documents\\srikala";
		String str2="C:\\Users\\srika\\OneDrive\\Documents\\srikala1";

		CreateFolder(str1);
		Checkfolder(str1);
		Rename(str1,str2);
		Delete(str2);
		
		
	}
	
	
	
	
}
