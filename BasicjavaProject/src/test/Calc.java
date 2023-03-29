package test;

public class Calc {
	public static void main(String[] args) {
		ArithmeticSample am = new ArithmeticSample();
		System.out.print("足し算をします\n");
		int ans = am.add1(100,200);
		System.out.print("答えは" + ans + "です");
	}  
}
