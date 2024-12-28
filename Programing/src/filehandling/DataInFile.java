package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class DataInFile {

	
	//Writing data into the file.....
	public static void Datainfile(String filepath) throws IOException
	{
		
		FileWriter filewriter=new FileWriter(filepath);
		filewriter.write("Welcome to file page......");	
		filewriter.close();
		
		
	}
	
	
	public static void main(String[] args) throws IOException
	{
		String str="C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile1.txt";
		Datainfile(str);
		
		
	}
	
}
