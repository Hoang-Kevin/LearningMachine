import java.util.*;
import java.lang.*;

public class Perceptron {
	//float[] weights = new float[4];
	float[] weights = {-1, 0, 0, 0};
	float learningrate = (float) 1;
	
	
	
	Perceptron() {

		/*
		for(int i= 0; i < weights.length;i++) {
		 int rand = -1 +(int) (Math.random() * ((1 - (-1)) + 1));
			weights[i] = rand;
			//System.out.println("Initial weights (random) = " + Arrays.toString(weights));
		}
		*/
	}
	
	int sign(float n) {
		if (n >= 0) {
			return 1;
		} 
		else {
			return 0;
		}
	}

	
	int guess(float[] inputs) {
		
		// sum is the weighted sum
		float sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += inputs[i]*weights[i];
		}
		
		int output = sign(sum);
		return output;
	}
	
	Boolean train(float[] inputs, float target) {
		Boolean pleasework;
		int guess = guess(inputs);
		//System.out.println("guess = " + guess);
		int error = (int) (target - guess);
		if(guess == target) {
			pleasework = true;
		} else {
			pleasework = false;
		}
		//Adjusts the weights according to the error
		for(int i = 0; i < weights.length; i++) {
			weights[i] += error * (inputs[i])* learningrate;
		}
		
		//System.out.println("Current weights = " + Arrays.toString(weights));
		return pleasework;
		
	}

}
