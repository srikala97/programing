package filehandling;

import java.io.File;

public class Renamefile {

	
	
	public static void FileRename(String oldpath,String newpath)
	{
		File oldfile=new File(oldpath);
		File newfile=new File(newpath);
		oldfile.renameTo(newfile);

		
		
	}
	public static void main(String[] args)
	{
		String str1="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile1.txt";
		String str2="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile2.txt";
		FileRename(str1,str2);
		
	}
	
	
	
}
