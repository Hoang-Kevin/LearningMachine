import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	
	float[][] Datafile = new float[100][3];

	
	CSVReader() throws FileNotFoundException {
		this.Reader();
	}

	void Reader() throws FileNotFoundException {
		String currentdata;
		CSVFile monFichier = new CSVFile("/Users/sazuchan/Desktop/Solution.csv"); 
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 3; j++) {
				currentdata = monFichier.getData(i, j);
				Datafile[i][j] = Float.parseFloat(currentdata);
			}
			
		}
		
	}
	
	
}
