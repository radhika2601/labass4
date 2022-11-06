package qus1;
interface Adder 
{
	public int add(int x,int y);	
}
interface Upperstring
	{
		public void str();
}
public class qus1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Adder x=(n1,n2)->
     {
    	 return n1+n2;
     };
     String s1="radhika";
     Upperstring s11=()->
     {
    	 
     System.out.println(s1.toUpperCase());
    
     };
    
    System.out.println( x.add(5,5));
    s11.str();
}

}
