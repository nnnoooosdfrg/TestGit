package refact;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int year = 2023;
		int month = 1;
		int day = 1;

		day = MonthCheck.chkDays(year, month);

		System.out.println("その月の日数は" + day + "です!");
	}

	static int leapYear(int year) {
		int day;
		if ((year % 4) == 0 && (year % 100 != 0 || year % 400 == 0))
			day = 29;
		else
			day = 28;
		return day;
	}

}
