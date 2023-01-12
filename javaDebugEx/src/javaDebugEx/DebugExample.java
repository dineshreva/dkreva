package javaDebugEx;

public class DebugExample {
public static void main(String args[]) {
	System.out.println(" Start ");
	int a = 10;
	a = a++ + ++a - ++a + a++;
	int value = show();
	a=a+value;
	if(a>55) {
		System.out.println(" Valid ");
	}else {
		System.out.println(" Invalid ");
	}
	System.out.println(" Done ");
}
public static int show() {
	System.out.println(" Start the show method ");
	int j = 20;
	j = j++ +j-- + ++j + ++j;
	System.out.println( " Display J value "+j);
	System.out.println(" Returned to main method   ");
	return j;
}

}
