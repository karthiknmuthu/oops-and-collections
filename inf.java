package Constructor;
import java.util.*;
class Ad implements info{
	public int w = 20;
	public void display() {
		System.out.println(w+v);
	}
}
class Ba extends Ad{
	int x = 30;
	public void display(int n) {
		System.out.println(w+x+n);
	}
}
public class inf{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Ad a = new Ad();
		Ba b = new Ba();
		a.display();
		b.display(n);
	}
}
