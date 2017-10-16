package a3;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileHandler {
	
	
	//the Path to text file
		public String txtPath;
		public boolean append_to_file = true;
		//Create file saveFile
		static File saveFile = new File("file.txt");
		//Create File logFile
		static File logFile = new File("log.txt");
		//path to saveFile
		static String path = saveFile.getAbsolutePath();
		//path to logFile
		static String logPath = logFile.getAbsolutePath();
	
	/**
	 * open the File	 *            
	 * @throws IOException   
	 * 	
	 */
	public static void openFile() throws IOException {
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = readLines();
		String[ ] textData = new String[numberOfLines];
		
		int i;
		for (i=0; i < numberOfLines; i++) {
		textData[ i ] = textReader.readLine();
		}
		textReader.close( );
		
		for (String items: textData){
			Image.tagList.add(new Tag(items));
			
		}
	}
	
	/**
	 * helper fucntion for openFiles
	 * Returns the number of lines in File
	 *            
	 * @return numberOfLinrs   
	 * 						The number of Lines in File
	 */
	public static int readLines() throws IOException {
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberOfLines = 0;
		
		while ((aLine = bf.readLine()) != null){
			numberOfLines++;
		}
		bf.close();
		return numberOfLines;
	}

	/**
	 * Make file pop up
	 *            
	 * @throws IOException
	 */
	public static void open(File document) throws IOException {
	    Desktop dt = Desktop.getDesktop();
	    dt.open(document);
	}

}
