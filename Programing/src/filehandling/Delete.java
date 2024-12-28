package filehandling;

import java.io.File;

public class Delete {

	
	public static void DeleteFolder(String folderpath)
	{
		File folder=new File(folderpath);
		if(folder.exists())
		{
			for(File file:folder.listFiles())
			{
				file.delete();
			}
			
			
			
			folder.delete();
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		String str2="C:\\Users\\srika\\OneDrive\\Documents\\sri1";
		DeleteFolder(str2);
		
		
	}
	
	
	
}
