package Collections1;
import java.util.*;
public class C1 {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		int[]a = new int[50];
		for(int i=0;i<50;i++) a[i] = i;
		System.out.println(l1);
		l1.add("Aadhi");
		System.out.println(l1);
		l1.add("Karthikn");
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.add(1,"Ashraf");
		System.out.println(l1);
		List<int[]> l2 = Arrays.asList(a);
		System.out.println(l2.get(0));
	}

}
