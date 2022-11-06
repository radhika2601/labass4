package qus1;
import java.util.ArrayList;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
	    arr.add(18);
	    arr.add(26);
	    arr.add(29);
	    arr.add(27);
	    arr.add(52);
	   arr.forEach((x)->
	   {
		   if(x%2==0)
		   {
			   System.out.print("Even number ");
			  System.out.print(x+" ");
		   }
		   if(x%2==1)
		   {
		    	System.out.print("Odd number ");
			  System.out.print(x+" ");
		   }
		    System.out.println("");
	   });   
	}

}
