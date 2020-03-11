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
	
	
}
}
