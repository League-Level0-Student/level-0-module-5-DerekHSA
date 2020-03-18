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
			
		
		
	
	for (int p = 0; p < 501; p++) {
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
	
	
	
	for (int i = 0; i < 3; i++) {
		int Mommy=0;
		for (int j = 0; j < 3; j++) {
			System.out.println(i+" "+Mommy);
			Mommy++;
		}}
	
	
	
	int Scout=1; //Nested 2(feels like cheating)
	int lil=Scout+1;
	int derek=lil+1;
	for (int i = 0; i < 3; i++) {
		System.out.println(Scout+" "+lil+" "+derek);
		
		for (int j = 0; j < 3; j++) {
			Scout++;
			lil++;
			derek++;
		}}
	
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int e=5;
	int f=6;
	int g=7;
	int h=8;
	int i=9;
	int j=10;
	for (int z = 0; z < 10; z++) {
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" ");
		
		for (int x = 0; x < 10; x++) {
			a++;
			b++;
			c++;
			d++;
			e++;
			f++;
			g++;
			h++;
			i++;
			j++;
		}}
	
	
	String practice="* "; //This example nesting not needed
	for (int z = 0; z < 6; z++) {	
		System.out.println(practice);
		practice=practice+"* ";
		}
	
}
}

