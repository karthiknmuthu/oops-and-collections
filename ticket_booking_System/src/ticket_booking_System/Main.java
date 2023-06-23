package ticket_booking_System;
import java.util.*;

public class Main {
void Booking(String a[][],ArrayList<Integer>l1){
	int i=0,j=0;
	Collections.sort(l1);
	ArrayList<Integer>l2=new ArrayList<>();
	ArrayList<Integer>l3=new ArrayList<>();
	for(i=0;i<a.length;i++){	
		for(j=0;j<a[i].length;j++) {
			if(l1.contains((i*a[i].length)+j)&&a[i][j]=="0") {
			  a[i][j]="B";
			  if(l1.size()!=0)l1.remove(0);
			}
			else if(l1.contains((i*a[i].length)+j)&&a[i][j]=="B"){
				l2.add((i*a[i].length)+j);
			}
		}
	}
	if(l2.size()==0) {
		Main m = new Main();
		m.display(a);		
	}
	else Booking(a,l2);
}
void total(double tc,int s){
  System.out.print(tc*s);
}
void display(String a[][]) {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(a[i][j].equals("B")) System.out.print(a[i][j]+" ");
			else System.out.print((i*a[i].length)+j+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
	System.out.println("Kaala-Screen1 --- Leo-Screen2 --- Sivaji-Screen3 ");
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the Screen : ");    
	int screen=sc.nextInt();
	
	
	Screen1 sn1=new Screen1();
    Screen2 sn2=new Screen2();
    Screen3 sn3=new Screen3();
    Main m = new Main();
    if(screen==1) {
    
    	System.out.println("Enter the Seats : ");
    	 System.out.println("The available seats");
    	m.display(sn1.s1);
    	int seats=sc.nextInt();
    	ArrayList<Integer>l1=new ArrayList<>();
    	for(int i=0;i<seats;i++) {
    		l1.add(sc.nextInt());
    	}
    	m.Booking(sn1.s1,l1);
    	m.total(sn1.ticket_cost,seats);
    }
    if(screen==2) {
    	
    	System.out.println("Enter the Seats : ");
    	 System.out.println("The available seats");
    	m.display(sn2.s2);
    	int seats=sc.nextInt();
    	ArrayList<Integer>l1=new ArrayList<>();
    	for(int i=0;i<seats;i++) {
    		l1.add(sc.nextInt());
    	}
    	m.Booking(sn2.s2,l1);
    	m.total(sn2.ticket_cost,seats);
    }
    if(screen==3) {
        
        System.out.println("select the seats");
        System.out.println("The available seats");
        m.display(sn3.s3);
        int seats=sc.nextInt();
    	ArrayList<Integer>l1=new ArrayList<>();
    	for(int i=0;i<seats;i++) {
    		l1.add(sc.nextInt());
    	}
    	m.Booking(sn3.s3,l1);
    	m.total(sn3.ticket_cost,seats);
    }
	}

	
}
