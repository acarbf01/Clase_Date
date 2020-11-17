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
			System.out.println(today.PrintDate());
			System.out.println(today.PrintDays());
			System.out.println(today.PrintMonthsWSDays());
			System.out.println("Han pasado "+today.daysPast()+" dias");
			System.out.println(today.attemptsToDate()+"intentos");
			System.out.println(today.attemptsToDateDoWhile()+" intentos ");
			int primerDiaAnio = 1;
			System.out.println(today.dayOfTheWeek(primerDiaAnio));
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}
