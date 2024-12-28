package filehandling;

import java.io.File;

public class DeleteFile {

	public static void FileDelete(String filepath)
	{
		File file=new File(filepath);
		file.delete();
        System.out.println(" File is deleted.....");
		
		
	}
	
	public static void main(String[] args)
	{
		String str2="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile2.txt";
		FileDelete(str2);
		
		
	}
	
	
	
}
