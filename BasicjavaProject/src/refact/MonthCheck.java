package refact;

public class MonthCheck {

	static int chkDays(int year, int month) {
		int day = 0;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = 31;
		}else if(month == 2) {
			day = Calc.leapYear(year);
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		} else {
			System.out.println("該当する年月がありません!");
		}
		return day;
	}

}
