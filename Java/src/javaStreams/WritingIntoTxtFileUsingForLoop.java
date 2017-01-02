package javaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoTxtFileUsingForLoop {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File("H:\\Documents\\myTxtFile.txt");
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//Writing into file
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=3; j++)
			{
				int num = (int) (Math.random()*10);
				writer.write(num+ "\t");
			}
			writer.newLine();
		}
		
		//close the stream
		writer.close();
		
		System.out.println("File created");
		
	}

}
