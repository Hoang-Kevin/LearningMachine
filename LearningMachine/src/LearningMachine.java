import java.util.*;
import java.io.*;

public class LearningMachine {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Supervised learning process
    
		    	
		
		CSVReader csvreader = new CSVReader();
		Perceptron machine = new Perceptron();
		Data[] datatable;
		float counter = 0;
		float successrate = 0;
		int retriescounter = 0;

		for(int i = 1; i < csvreader.values.length;i++) {
			datatable[i-1] = new Data();
		}
		


		
		
		
		while(successrate < 92) {
			for(int i = 0; i < datatable.length; i++) {
				Boolean test;
				int randomInteger = new Random().nextInt(101);;
				float[] inputs = {datatable[randomInteger].bias,datatable[randomInteger].x,datatable[randomInteger].y,datatable[randomInteger].z};
				//datatable[i].showinfo();
				test = machine.train(inputs, datatable[i].targetvalue);
				if(test == true) {
					counter += 1;
				}
				//System.out.println("Counterafter = " + counter);
				//System.out.println("Database length = " + datatable.length);
			}
			
			successrate = counter/datatable.length*100;
			System.out.println("Success rate : " + successrate +"%");
			//System.out.println("Counterafter = " + counter);
			//System.out.println("Database length = " + datatable.length);
			counter = 0;
			retriescounter += 1;
			System.out.println("Number of retries = " + retriescounter);
		}

		

	}

}
