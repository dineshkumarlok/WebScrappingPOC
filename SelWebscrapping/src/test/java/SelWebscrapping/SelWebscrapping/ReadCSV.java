package SelWebscrapping.SelWebscrapping;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCSV {

	//Read Search input from CSV file and pass it to scraping method in iteration
	//Store all String arrays into List and return it
	CSVReader reader = null;
	public List<String[]> readcsv(){
		
		//List creation and Adding Header
		List<String[]> data = new ArrayList<String[]>(); 
        data.add(new String[] {"Title","BSE","NSE","ISIN","SECTOR","BSElive","NSElive","BSEperviousClose","BSEopenPrice","BSEbidPrice","BSEofferPrice","NSEperviousClose","NSEopenPrice","NSEbidPrice","NSEofferPrice"});
		
        String[] csvData = null;
		SelScrapping selScrap = new SelScrapping();
		try{
			
			//Reading CSV file
			FileReader filereader = new FileReader("D://Dineshkumar//03_Documents//WebScrappingPOC//SearchInput.csv");
			reader = new CSVReader(filereader);
		}catch (Exception e) {
		    e.printStackTrace();
		}

		String[] cell;

		try {
			
			// iterating the Search key and pass it to scraping method by calling it within iteration
			while ((cell=reader.readNext())!=null){
				for(int i=0;i<1;i++){
			        String searchKey=cell[i];
			        
			        //Scraping method is called and returned String array is added to list for each iteration
			        csvData = selScrap.selScrapping(searchKey);
			        data.add(csvData);
			    }
			}
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Returns the List
		return data;
		    
	}
		    
}
	
