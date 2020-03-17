package _06_for_loop_gauntlet;

public class LoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
		
	}
	int one=100;
	for (int j = 0; j < 101; j++) {
		System.out.println(one);
		 one--;
	}
	
	for (int l = 2; l < 101; l++) {
		if (l%2==0) {
			System.out.println(l);
		}
	}
	one=100;
	for (int k = 0; k < 101; k++) {
		if (one%2==0) {
			System.out.println(one);
		}
		one--;
	}
	for (int k = 0; k < 101; k++) {
		 if (k%2==1) {
			System.out.println(k);
		} }
			
		
		
	
	for (int p = 0; p < 101; p++) {
		if (p%2==0) {
			System.out.println(p+" is even");
		} else {
			System.out.println(p+" is odd");
		}}
	for (int k = 0; k < 778; k++) {
		 if (k%7==0) {
			System.out.println(k);
		} }
	int age=1;
	for (int k = 2009; k < 2021; k++) {
		 
			System.out.println("In "+k+" I was "+age);
			age++;
		 }
}
}

