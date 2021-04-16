import java.util.*;
import java.io.*; 
public class Boundary{
	public Boundary(){

	}
	public static void squishA(){
		double[] array= {-1337.1337, -10.5, -5.5, -1.5, -1.0, -0.3, -0.113, 0.0, 0.31, 0.76, 1.3, 1.99, 7.4, 160.0, 1337.0};
		for (int i=0; i<array.length;i++){
			System.out.println("Input: "+array[i]+" Output: "+Math.abs(1 / (1+(double)Math.pow(2.71,array[i]))));
		}
	}
	public static void main (String [] args){
		index.squishA();
	}
}
