package arkprocoder;

public class Javaa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operators
		
		/*float a=5;
		a*=2; //a=a*2;
		System.out.println(a);
		a+=5; //a=a+5;
		System.out.println(a);
		a-=3; //a=a-3;
		System.out.println(a);
		a/=5;
		System.out.println(a);
		a%=2; a=a%2;
		System.out.println(a);
		*/
		
		//comparision operators
		/*int x=15;
		int y=10;
		System.out.println(x<y);
		System.out.println(x==y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		*/
		//logical operators
		
	    
	   /* And(&&) Operations
	    
	    true= 1  false =0
	    
	    1 && 1 = 1 // True and True = True
	    1 && 0 =0 //True and False = False
	    0 && 1 = 0
	    0 && 0 =0
		
	    
        Or(||) Operations
	    
	    true= 1  false =0
	    
	    1 || 1 = 1 // True and True = True
	    1  ||  0 = 1 //True and False = True
	    0  || 1 = 1
	    0 ||  0 = 0
		
		! -> not
		!= : not equals // a!=b
		== : equals		// a==b
		!true = false
		!false = true
		*/
	   /* 
		boolean a=true;
	    boolean b = false;
	    boolean c= true;
	    System.out.println("And Operations");
	    System.out.println(a && a);
	    System.out.println(a && b);
	    System.out.println(b && a);
	    System.out.println(b && b);
	    System.out.println("Or Operations");
	    System.out.println(a || a);
	    System.out.println(a || b);
	    System.out.println(b || a);
	    System.out.println(b || b);
	    System.out.println("Not operation");
	    System.out.println(!a);
	    System.out.println(!b);
	    System.out.println(a==c);
	    System.out.println(a==b);
	    
	    System.out.println("Problems");
	            int i=12; 
	    		int j=13;
	    		int z=14;
	    System.out.println(i<=j && i>j );
	   
	    //System.out.println(12<=13=True && 12>13=False );
	    //System.out.println(True && False);
	   // System.out.println(z>j || j>z ||i>z);
	      
	    */
		//associative left to right /,*,+,-
		/*
		int x= 8*7-98+6;  //56+6=62-98=-36
		System.out.println(x);
		int y=60/2*6+10-10;
		
		
		System.out.println(y);
	    */
		
		//auto increment and auto decrement
		/*
		int x=10;
		int y=x++;  //y=10 assigned first then x is incremented to +1
		System.out.println("y:"+y);
		System.out.println("x:"+x);
	    
		
		int i=13;
		int j = ++i;  //i=14 i is incremented to +1 then i=14 so 14 is assigned to j
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	    
		*/
		
		int x=10;
		int y=x--;  //y=10 assigned first then x is post decremented to -1
		System.out.println("y:"+y);
		System.out.println("x:"+x);
	    
		
		int i=13;
		int j = --i;  //i=14 i is pre decremented to +1 then i=14 so 14 is assigned to j
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		
		
		long l=234567l;
		double z=234567.12333d;
		System.out.println(l+z);
	    

	}

}
