package sample_java;

public class Example {
	public static void main(String args[]) {
		// S =(a-1)/(a+10)+(a-2)/(a+9)+(a-3)/(a+8)+......+(a-10)/(a+1)
		int a=15;
	System.out.println(a);
		float S =(a-1)/(a+10)+(a-2)/(a+9)+(a-3)/(a+8)+(a-4)/(a+7)+(a-5)/(a+6)+(a-6)/(a+5)+(a-7)/(a+4)+(a-8)/(a+3)+(a-9)/(a+2)+(a-10)/(a+1);
		System.out.println((a-1)/(a+10));
		System.out.println((a-2)/(a+9));
		System.out.println((a-3)/(a+8));
		System.out.println((a-4)/(a+7));
		System.out.println((a-5)/(a+6));
		System.out.println((a-6)/(a+5));
		System.out.println((a-7)/(a+4));
		System.out.println((a-8)/(a+3));
		System.out.println((a-9)/(a+2));
		System.out.println((a-10)/(a+1));
		System.out.printf("%.2f",S);
	}

}
