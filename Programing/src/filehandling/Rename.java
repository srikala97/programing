package filehandling;

import java.io.File;

public class Rename {

	
	public static void RenameFolder(String oldpath,String newpath)
	{
		File Oldfolder=new File(oldpath);
		File Newfolder=new File(newpath);
		
		if(Oldfolder.exists())
		{
			Oldfolder.renameTo(Newfolder);
			System.out.println(" Folder is renamed....");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		String str1="C:\\Users\\srika\\OneDrive\\Documents\\sri";
		String str2="C:\\Users\\srika\\OneDrive\\Documents\\sri1";
		RenameFolder(str1,str2);
		
	}
	
	
	
}
