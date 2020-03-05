package _02_fibonacci;

public class WEIRD {
public static void main(String[] args) {
	int next=0;
	int fl=0;
	int sl=1;
	for (int i = 0; i < 12; i++) {
		System.out.println(fl);
		next=fl+sl;
		fl=sl;
		sl=next;
	}
}
}
