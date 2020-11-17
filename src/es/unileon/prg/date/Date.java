package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	

	public Date (int day, int month, int year) throws DateException {
		//this.month = month;
		this.setMonth(month);
		//this.day = day;
		this.setDay(day);
		//this.year = year;
		this.setYear(year);
	}

	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getYear(){
		return this.year;
	}


	public void setDay(int day) throws DateException {
		if ( day < 1 || day > this.getDaysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
		this.day = day;
	}
	
	public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}
	
	public void setYear (int year) throws DateException {
		if(year<0){
			throw new DateException("Date error: Year " + year +" not valid");
		}
		this.year = year;
	}

	
	private int getDaysOfMonth() {
		int numDays;
		
		numDays = 0;
		switch (this.month) {
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;			
		}
		
		return numDays;
	}
	
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean isSameYearIf(Date today){
		if(this.year == this.getYear()){
			return true;
		}
			return false;
		}
	
	public boolean isSameMonthIf(Date today){
		if(this.year == this.getMonth()){
			return true;
		}
			return false;
		}
	
	public boolean isSameDayIf(Date today){
		if(this.year == this.getDay()){
			return true;
		}
    		return false;
		}
	
	public boolean isSameIf(Date today) {
		if(isSameDay(today) && isSameMonth(today) && isSameYear(today)){
			return true;
		}
		return false;
	}
	
	public boolean isSameYear(Date today){
		return this.getYear()==getYear();
	}

	public boolean isSameMonth(Date today){
		return this.getMonth()==getMonth();
	}
	
	public boolean isSameDay(Date today){
		return this.getDay()==getDay();
	}

	public boolean isSame(Date today){
		return (isSameDay(today) && isSameMonth(today) && isSameYear(today));
	}

	public String PrintMonthName(){
		StringBuffer salida = new StringBuffer();
		switch(this.month){
			case 1:
				   salida.append("Enero");
				   break;
			case 2:
				   salida.append("Febrero");
				   break;
			case 3:
				   salida.append("Marzo");
				   break;
			case 4:
				   salida.append("Abril");
				   break;
			case 5:
				   salida.append("Mayo");
				   break;
			case 6:
				   salida.append("Junio");
				   break;
			case 7:
				   salida.append("Julio");
				   break;
			case 8:
				   salida.append("Agosto");
				   break;
		    case 9:
				   salida.append("Septiembre");
				   break;
			case 10:
				   salida.append("Octubre");
				   break;
			case 11:
				   salida.append("Noviembre");
				   break;
			case 12:
				   salida.append("Diciembre");
				   break;
		}
		return salida.toString();
	}
	public String PrintSeasonName(){
		StringBuffer salida = new StringBuffer();
		switch(this.month){
			case 1:
			case 2:
			case 3:
				   salida.append("Invierno");
				   break;
			case 4:
			case 5:
			case 6:
				   salida.append("Primavera");
				   break;
			case 7:
			case 8:
		    case 9:
				   salida.append("Verano");
				   break;
			case 10:
			case 11:
			case 12:
				   salida.append("Invierno");
				   break;
		}
		return salida.toString();
	}

	public String PrintMonths(){
		StringBuffer salida = new StringBuffer();
		switch(this.month){
			case 1:
			       salida.append("Enero, ");
			case 2:
			       salida.append("Febrero, ");
			case 3:
				   salida.append("Marzo, ");
				   
			case 4:
			       salida.append("Abril, ");
			case 5:
			       salida.append("Mayo, ");
			case 6:
				   salida.append("Junio, ");
				  
			case 7:
			       salida.append("Julio, ");
			case 8:
			       salida.append("Agosto, ");
		    case 9:
				   salida.append("Septiembre, ");
				  
			case 10:
			       salida.append("Octubre, ");
			case 11:
			       salida.append("Noviembre, ");
			case 12:
			       salida.append("Diciembre, ");
				   break;
		}
		return salida.toString();
	}

    public String PrintDate(){
        return this.day +" de "+this.PrintMonthName()+" de "+this.year;
	}
	
	public String PrintDays(){
		StringBuffer salida=new StringBuffer();
		int numDay;
		switch (this.month) {
			case 1: //next
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
				numDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDay = 30;
				break;
			case 2:
				numDay = 28;
				break;			
			}
		for(int i=0; i < numDay-this.day; i++){
			
			salida.append((this.day+i)+"/"+(this.month)+"/"+(this.year));
		}
		return salida.toString();
	}

	public String PrintMonthsWSDays(){
		StringBuffer salida = new StringBuffer(this.PrintMonthName()+" tiene el mismo numero de dias que ");

		switch(this.getMonth()){
				case 1:
					salida.append("Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
			
				case 2:
					salida.append("ningun otro mes");
					break;
				
				case 3:
					salida.append("Enero, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
					
				case 4:
					salida.append("Junio, Septiembre y Noviembre");
					break;
			
				case 5:
					salida.append("Enero, Marzo, Julio, Agosto, Octubre y Diciembre");
					break;
				
				case 6:
					salida.append("Abril, Septiembre y Noviembre");
					break;
					
				case 7:
					salida.append("Enero, Marzo, Mayo, Agosto, Octubre y Diciembre");
					break;
			
				case 8:
					salida.append("Enero, Marzo, Mayo, Junio, Octubre y Diciembre");
					break;
				
				case 9:
					salida.append("Abril, Junio y Noviembre");
					break;
					
				case 10:
					salida.append("Enero, Marzo, Mayo, Junio, Agosto y Diciembre");
					break;
			
				case 11:
					salida.append("Abril, Junio y Septiembre");
					break;
				
				case 12:
					salida.append("Enero, Marzo, Mayo, Junio, Agosto y Octubre");
					break;
		}
		return salida.toString();
	}

	public int daysPast(){
		int numDay, daysSinceYearBegin = 0;
		for (int i=1;i<this.month;i++ ) {
			switch(i){
				case 1: //next
				case 3: //next
				case 5: //next
				case 7: //next
				case 8: //next
				case 10:
					numDay= 31;
					break;
				
					case 2:
					numDay = 28;
					break;
				
				default:
					numDay = 30;
			}
			daysSinceYearBegin = daysSinceYearBegin + numDay;
		}
		daysSinceYearBegin = daysSinceYearBegin + this.day;

		return daysSinceYearBegin;
	}

	
	public int attemptsToDate(){
		int randomDay = 0, intentos = 0;
		while(this.daysPast()!=randomDay){
			randomDay = (int)(Math.random() * ((365 - 1) + 1)) + 1;
			intentos++;
		}
		return intentos;
	}

	
	public int attemptsToDateDoWhile(){
		int randomDay = 0, intentos = 0;
		do{
			randomDay = (int)(Math.random() * ((365 - 1) + 1)) + 1;
			intentos++;
		}
		while(this.daysPast()!=randomDay);
		return intentos;
	}

	
	public String dayOfTheWeek(int firstDayOfTheYear){
		int dayOfTheWeek = (this.daysPast()%7)+firstDayOfTheYear; 
		StringBuffer salida = new StringBuffer("El "+this.PrintDate()+" es ");
		switch (dayOfTheWeek){
			case 1:
				salida.append("Lunes");
				break;
			case 2:
				salida.append("Martes");
				break;
			case 3:
				salida.append("Miercoles");
				break;
			case 4:
				salida.append("Jueves");
				break;
			case 5:
				salida.append("Viernes");
				break;
			case 6:
				salida.append("Sabado");
				break;
			case 7:
				salida.append("Domingo");
				break;																																			
		}

		return salida.toString();
	}
}
