package javaStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		
		File f = new File("H:\\Documents\\myTxtFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//Reading the content in the file
		
		String line = null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		
		reader.close();
	}

}
