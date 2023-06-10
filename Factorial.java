package Constructor;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Calculation().fact(5);
	}

}
class Calculation{  
	 void fact(int  n){  
	  int fact=1;  
	  for(int i=1;i<=n;i++){  
	   fact=fact*i;  
	  }  
	 System.out.println("factorial is "+fact);  
	}
}
