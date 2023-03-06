package zaur.chak.lesson6;

public class MethodOverloading {
	void show (int i1) {
		System.out.println(i1);
	}

	void show (boolean b1) {
		System.out.println(b1);
	}

	void  show(String s1) {
		System.out.println(s1);
	}

}

class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading m0 = new MethodOverloading();
		int a = 500;
		m0.show(a);
		boolean b = true;
		m0.show(b);
		String s = "Priver";
		m0.show(s);
	}
}
