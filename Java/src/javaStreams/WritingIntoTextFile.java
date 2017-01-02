package javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File("H:\\Documents\\myTxtFile.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//Writing inside the file
		writer.write("chaitanya");
		writer.newLine();
		writer.write("textfile");
		writer.newLine();
		
		//closing stream
		writer.close();
		
		System.out.println("File created...");
		
		
		
		
	}

}
