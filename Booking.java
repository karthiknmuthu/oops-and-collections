package abstraction;
import java.util.*;
abstract class Booking {
	String gender ="";

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	} 

}
class Customer extends Booking{
	int age=0;
	String name="";
	String phnumber="";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
	void gen(){
		if(gender.equals("male")) {
			System.out.println("\n"+"male");
		}
		else {
			System.out.println("female");
		}
	}
	public void display() {
		if(age>=18) {
			System.out.print(this.age+" "+"book ticket");
		}
		else {
			System.out.println("Under age can't book ticket");
		}
	}
    

	
}

class main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		String name=sc.nextLine();
		String phnumber=sc.nextLine();
		int age=sc.nextInt();
		Customer c= new Customer();
		c.setAge(age);
		c.setGender(gender);
		c.setName(name);
		c.setAge(age);
		c.display();
		c.gen();
	}
}