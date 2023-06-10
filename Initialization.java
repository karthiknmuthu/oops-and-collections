package Constructor;

public class Initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students();  
		Students s2=new Students();
		s1.insertRecord(14,"karthikeyan");
		s2.insertRecord(01,"Aadhi");
		s1.displayInformation();
		s2.displayInformation();
	}

}
class Students{  
	 int rollno;  
	 String name;  
	  public void insertRecord(int r, String n) {
		// TODO Auto-generated method stub
		  rollno=r;  
		  name=n;  
	}
	void displayInformation() {
		// TODO Auto-generated method stub
		  System.out.println(rollno+" "+name);
		
	}
}
