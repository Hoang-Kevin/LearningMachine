import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVReader {
	
	public String[] values;

	
	CSVReader() throws IOException {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/sazuchan/foo.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        values = line.split(";");
		        System.out.println(Arrays.deepToString(values));
		       
		    }
		}
		
	}
	
	
}
