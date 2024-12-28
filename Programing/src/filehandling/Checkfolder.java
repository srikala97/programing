package filehandling;

import java.io.File;

public class Checkfolder {

	public static boolean Checkfolder(String folderpath)
	{
		File folder=new File(folderpath);
		return (folder.exists());
			
		
	}
	
	public static void main(String[] args)
	{
		String str="C:\\Users\\srika\\OneDrive\\Documents\\sri";
		System.out.println(Checkfolder(str));
		
		
	}
	
	
	
	
	
	
}
