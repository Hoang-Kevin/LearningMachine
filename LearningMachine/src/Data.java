import java.util.*;
import java.lang.*;

// Data type for the excels informations
public class Data {
	float bias;
	float x;
	float y;
	float z;
	float targetvalue;
	
	Data(float x, float y, float z, float targetvalue) {
		this.bias = 1;
		this.x = x;
		this.y = y;
		this.z = z;
		this.targetvalue = targetvalue;
		
	}
	
	void showinfo() {
		System.out.println("bias = " + this.bias);
		System.out.println("x = " + this.x );
		System.out.println("y = " + this.y );
		System.out.println("z = " + this.z );
		System.out.println("targetvalue = " + this.targetvalue );
	}
}
