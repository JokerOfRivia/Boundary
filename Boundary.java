import java.util.*;
import java.io.*; 
public class Boundary{
	public Boundary(){

	}
	public static void squishA(){
		double[] array= {0, 0.000027535691114583473, 0.004070137715896128, 0.18242552380635635, 0.2689414213699951, 0.425557483188341, 0.47178002201963243, 0.5, 0.5768852611320463, 0.6813537337890256, 0.7858349830425586, 0.8797431375322491, 0.9993891206405656, 1, 1};
		double n;
		for (int i=0; i<array.length;i++){
			if (array[i]<=0.5){
				n=array[i];
			}
			else{
				n=1-array[i];
			}
			System.out.println("Input: "+array[i]+" Output: "+(n/2));
		}
	}
	public static void main (String [] args){
		Boundary.squishA();
	}
}
