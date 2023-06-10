public class Classst {
	public static void main(String args[]) {
		Student karthi=new Student();
         karthi.mark= 95;
         karthi.name="Karthikeyan M";
         karthi.rno=14;
         System.out.println(karthi.rno);
         System.out.println(karthi.name);
         System.out.println(karthi.mark);
	}	
}
class Student{
	int rno;
	String name;
	float mark;
}