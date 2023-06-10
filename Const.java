package Constructor;

public class Const {

	public static void main(String[] args) {
		Student aadhi=new Student();
		Student karthikn=new Student(aadhi);
        System.out.println(karthikn.rno);
        System.out.println(karthikn.name);
        System.out.println(karthikn.mark);
        System.out.println(karthikn.name);
		aadhi.changename("karthikn");

	}

}
class Student{
	int rno;
	String name;
	float mark;
	
	Student(){
		this.mark=99.5f;
		this.name="AAdhi";
		this.rno=1;
	}
	//calling constructor for another constructor
	
	//constructor overloading
	Student (Student other){
		this.mark=other.mark;
		this.name=other.name;
		this.rno=other.rno;
	}
	void changename(String name) {
		this.name=name;
	}
	
}
