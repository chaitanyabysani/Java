package textFilePackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWritingAndReading {

	public static void main(String[] args) throws IOException {
		
		File f = new File("H:\\Documents\\textfile.txt");
		f.createNewFile();
		
		//Writing inside the file
		FileWriter fw = new FileWriter("H:\\Documents\\textfile.txt");
		@SuppressWarnings("resource")
		BufferedWriter filewriter = new BufferedWriter(fw);
		
		filewriter.write("First Line");
		filewriter.newLine();
		filewriter.write("Second Line");
		filewriter.flush();

		//Read from file
		FileReader fr = new FileReader("H:\\Documents\\textfile.txt");
		@SuppressWarnings("resource")
		BufferedReader filereader = new BufferedReader(fr);
		String i="";
		while((i=filereader.readLine())!=null)
		{
			System.out.println(i);
		}
		
	}

}
