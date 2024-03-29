

public class LearningMachine {

	public static void main(String[] args) {
		// Supervised learning process
		Perceptron machine = new Perceptron();
		Data[] datatable = new Data[92];
		float counter = 0;
		float successrate = 0;
		int retriescounter = 0;

		datatable[ 0 ] = new Data( 4,3,5,-1 ) ;
		datatable[ 1 ] = new Data( 1,1,2,-1 ) ;
		datatable[ 2 ] = new Data( 12,13,6,-1 ) ;
		datatable[ 3 ] = new Data( 20,2,1,-1 ) ;
		datatable[ 4 ] = new Data( 13,5,3,-1 ) ;
		datatable[ 5 ] = new Data( 13,14,8,-1 ) ;
		datatable[ 6 ] = new Data( 9,5,5,-1 ) ;
		datatable[ 7 ] = new Data( 3,9,13,-1 ) ;
		datatable[ 8 ] = new Data( 17,10,13,-1 ) ;
		datatable[ 9 ] = new Data( 7,7,9,-1 ) ;
		datatable[ 10 ] = new Data( 2,8,13,-1 ) ;
		datatable[ 11 ] = new Data( 2,14,11,1 ) ;
		datatable[ 12 ] = new Data( 8,9,14,-1 ) ;
		datatable[ 13 ] = new Data( 15,12,8,-1 ) ;
		datatable[ 14 ] = new Data( 19,13,2,-1 ) ;
		datatable[ 15 ] = new Data( 2,4,4,-1 ) ;
		datatable[ 16 ] = new Data( 6,2,5,-1 ) ;
		datatable[ 17 ] = new Data( 6,9,14,-1 ) ;
		datatable[ 18 ] = new Data( 10,12,5,-1 ) ;
		datatable[ 19 ] = new Data( 9,1,2,-1 ) ;
		datatable[ 20 ] = new Data( 15,7,1,-1 ) ;
		datatable[ 21 ] = new Data( 13,5,7,-1 ) ;
		datatable[ 22 ] = new Data( 11,12,7,-1 ) ;
		datatable[ 23 ] = new Data( 8,10,12,-1 ) ;
		datatable[ 24 ] = new Data( 7,14,7,-1 ) ;
		datatable[ 25 ] = new Data( 12,12,6,-1 ) ;
		datatable[ 26 ] = new Data( 13,2,9,-1 ) ;
		datatable[ 27 ] = new Data( 9,6,7,-1 ) ;
		datatable[ 28 ] = new Data( 10,11,3,-1 ) ;
		datatable[ 29 ] = new Data( 6,9,13,-1 ) ;
		datatable[ 30 ] = new Data( 8,1,5,-1 ) ;
		datatable[ 31 ] = new Data( 4,6,5,-1 ) ;
		datatable[ 32 ] = new Data( 14,13,9,-1 ) ;
		datatable[ 33 ] = new Data( 18,10,12,-1 ) ;
		datatable[ 34 ] = new Data( 15,5,5,-1 ) ;
		datatable[ 35 ] = new Data( 1,11,6,-1 ) ;
		datatable[ 36 ] = new Data( 12,7,8,-1 ) ;
		datatable[ 37 ] = new Data( 19,2,12,-1 ) ;
		datatable[ 38 ] = new Data( 20,5,3,-1 ) ;
		
		datatable[ 39 ] = new Data( 18,12,10,1 ) ;
		datatable[ 40 ] = new Data( 15,11,11,1 ) ;
		datatable[ 41 ] = new Data( 10,5,7,-1 ) ;
		datatable[ 42 ] = new Data( 2,8,9,-1 ) ;
		datatable[ 43 ] = new Data( 5,12,4,-1 ) ;
		datatable[ 44 ] = new Data( 20,6,6,-1 ) ;
		
		datatable[ 45 ] = new Data( 8,1,1,-1 ) ;
		datatable[ 46 ] = new Data( 6,4,3,-1 ) ;
		datatable[ 47 ] = new Data( 16,3,13,-1 ) ;
		datatable[ 48 ] = new Data( 5,13,12,-1 ) ;
		datatable[ 49 ] = new Data( 13,4,14,-1 ) ;
		datatable[ 50 ] = new Data( 7,5,5,-1 ) ;
		datatable[ 51 ] = new Data( 7,4,1,-1 ) ;
		datatable[ 52 ] = new Data( 16,4,9,-1 ) ;
		datatable[ 53 ] = new Data( 14,11,2,-1 ) ;
		datatable[ 54 ] = new Data( 9,12,10,1 ) ;
		datatable[ 55 ] = new Data( 5,4,2,-1 ) ;
		datatable[ 56 ] = new Data( 11,3,8,-1 ) ;
		datatable[ 57 ] = new Data( 18,10,8,-1 ) ;
		datatable[ 58 ] = new Data( 10,8,5,-1 ) ;
		datatable[ 59 ] = new Data( 12,8,10,1 ) ;
		datatable[ 60 ] = new Data( 20,4,13,-1 ) ;
		datatable[ 61 ] = new Data( 11,13,4,-1 ) ;
		datatable[ 62 ] = new Data( 18,12,11,1 ) ;
		datatable[ 63 ] = new Data( 6,2,2,-1 ) ;
		datatable[ 64 ] = new Data( 10,9,13,-1 ) ;
		datatable[ 65 ] = new Data( 14,7,1,-1 ) ;
		datatable[ 66 ] = new Data( 14,12,8,-1 ) ;
		datatable[ 67 ] = new Data( 9,14,3,-1 ) ;
		datatable[ 68 ] = new Data( 5,3,6,-1 ) ;
		datatable[ 69 ] = new Data( 14,11,8,-1 ) ;
		datatable[ 70 ] = new Data( 2,6,7,-1 ) ;
		datatable[ 71 ] = new Data( 6,12,12,-1 ) ;
		datatable[ 72 ] = new Data( 6,4,4,-1 ) ;
		datatable[ 73 ] = new Data( 20,11,12,-1 ) ;
		datatable[ 74 ] = new Data( 7,10,8,-1 ) ;
		datatable[ 75 ] = new Data( 12,7,12,1 ) ;
		datatable[ 76 ] = new Data( 15,8,6,-1 ) ;
		datatable[ 77 ] = new Data( 18,8,13,-1 ) ;
		datatable[ 78 ] = new Data( 3,8,11,1 ) ;
		datatable[ 79 ] = new Data( 6,4,9,-1 ) ;
		datatable[ 80 ] = new Data( 2,8,2,-1 ) ;
		datatable[ 81 ] = new Data( 18,13,11,-1 ) ;
		datatable[ 82 ] = new Data( 3,1,9,-1 ) ;
		datatable[ 83 ] = new Data( 16,3,11,1 ) ;
		datatable[ 84 ] = new Data( 11,6,14,-1 ) ;
		datatable[ 85 ] = new Data( 20,13,9,-1 ) ;
		datatable[ 86 ] = new Data( 19,5,14,-1 ) ;
		datatable[ 87 ] = new Data( 2,5,4,-1 ) ;
		datatable[ 88 ] = new Data( 11,9,6,-1 ) ;
		datatable[ 89 ] = new Data( 3,4,6,-1 ) ;
		datatable[ 90 ] = new Data( 1,4,3,-1 ) ;
		datatable[ 91 ] = new Data( 18,6,1,-1 ) ;


		
		
		
		while(successrate != 100) {
			for(int i = 0; i < datatable.length; i++) {
				Boolean test;
				float[] inputs = {datatable[i].bias,datatable[i].x,datatable[i].y,datatable[i].z};
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
