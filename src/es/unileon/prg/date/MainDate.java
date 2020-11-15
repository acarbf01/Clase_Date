package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		
		try {
			today = new Date(31,9,2000);
			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}
