package zaur.chak.lesson4.My;

public class MyWork2 {

	public static void main(String[] args) {
		String per1 = metod2("Строка", 52);
		System.out.println(per1);
	}

	public static String metod2(String s1, Integer int1) {
		System.out.println(s1 + " "+ int1);
		return "Вторая строка";
	}






	public static void metod1() {
		MyWork w1 = new MyWork(1, "Alex", "Ivanov", 1992, 9.6, 6.6, 7.6);

		System.out.println(w1.getMatematik());
		w1.setMatematik(8.4);
		System.out.println(w1.getMatematik());

		MyWork w2 = new MyWork();

		System.out.println(w2.getYear());
		w2.setYear(8592);
		System.out.println(w2.getYear());
		w2.setYear(null);
		System.out.println(w2.getYear());

		MyWork w3 = new MyWork(1, "Petr", 8.9);

	}
}
