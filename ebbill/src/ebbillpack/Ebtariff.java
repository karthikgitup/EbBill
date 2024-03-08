package ebbillpack;

public class Ebtariff {
	
	double amount;
	public double findtarif(double unit) {
		if(unit<=100) {
			amount=0;
		
			
		}
		else if(unit>=101 && unit<=200) {
			double sub=100;
			sub=unit-sub;
			sub=sub*(4.5/2);
			amount=unit*4.5;
			amount=amount-sub-450;
		}
		else if(unit>=201 && unit<=400) {
			amount=unit*4.5;
			amount=amount-225-450;
			
		}
		else if(unit>=401 && unit<=500) {
			double fourh=unit-400;
			fourh=fourh*6;
			amount=400*4.5;
			
			amount=amount-225-450+fourh;
			
		}
		else if(unit>=501 && unit<=600){
			double five=unit-500;
			five=five*8;
			amount=(400*4.5) + (100*6);
			amount=amount-450+five;
			
		}
		else if(unit>=601 && unit<=800){
			double six=unit-600;
			six=six*9;
			amount=(400*4.5)+(100*6)+(100*8);
			amount=amount-450+six;
			
		}
		else if(unit>=801 && unit<=1000){
			double eight=unit-800;
			eight=eight*10;
			amount=(400*4.5)+(100*6)+(100*8)+(200*9);
			amount=amount-450+eight;
			
		}
		else if(unit>1000) {
			double ten=unit-1000;
			ten=ten*11;
			amount=(400*4.5)+(100*6)+(100*8)+(200*9)+(200*10);
			amount=amount-450+ten;
			
		}
		return amount;
		
	}

}
