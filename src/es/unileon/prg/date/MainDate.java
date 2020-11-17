package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		Date other;
		
		try {
			today = new Date(31,8,2000);
			System.out.println(today.toString());
			System.out.println(today.PrintMonthName());
			System.out.println(today.PrintSeasonName());
			System.out.println(today.PrintMonths());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}
