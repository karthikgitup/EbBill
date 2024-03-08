package ebbillpack;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner obj=new Scanner(System.in);
	ArrayList<Double> al=new ArrayList<Double>();
	

	System.out.println("Enter the 1(start) or 2(stop)");
	int num=obj.nextInt();
		while(num==1) {
	
	System.out.println("Enter the unit");
	int unit=obj.nextInt();
	Ebtariff item=new Ebtariff();
	
//   System.out.println(item.findtarif(unit)); 
	al.add(item.findtarif(unit));
	System.out.println(al);
   System.out.println("Enter the 1(start) or 2(stop)");
   num=obj.nextInt();
	}
		System.out.println(al);
		double sum=0;
		for(int i=0;i<=al.size()-1;i++) {
			
			sum=sum+al.get(i);
		}
		System.out.println(sum);

	}

}
