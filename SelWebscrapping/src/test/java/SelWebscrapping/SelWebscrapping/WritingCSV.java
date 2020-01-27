package SelWebscrapping.SelWebscrapping;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class WritingCSV {

	// Commented below is not necessary right now
	/*public void fileCreate(){
		String newFilePath = "D://Dineshkumar//03_Documents//WebScrappingPOC//Scrap.csv";
		File newFile = new File(newFilePath);
		try {
			FileWriter writer = new FileWriter(newFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	//creating a CSV file and Writing the String array list in it
	public void fileWrite(List<String[]> data){
		String newFilePath = "D://Dineshkumar//03_Documents//WebScrappingPOC//NewsScrap.csv";
		try {
			File newFile = new File(newFilePath);
			FileWriter writer = new FileWriter(newFile);
			CSVWriter csvOutput = new CSVWriter(writer);
			csvOutput.writeAll(data);
	        csvOutput.close();
		} catch (Exception e) {
			System.out.println("FileWriteException"+e);
		}
	}
}
