package day22date_accessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {
	
	
	/*
	 You are going to use date to learn how long does ittak eto run a block of code 
	 to name your screenshots 
	 to put inside your report
	 
	 */

	public static void main(String[] args) {
		// How to create date object : LocalDate currentDate1=LocalDate.now();
		
		LocalDate currentDate1=LocalDate.now();
		
		System.out.println(currentDate1); //2021-07-14
		
		System.out.println(currentDate1.plusDays(8)); //2021-07-22 ==>daysToAdd
		
		System.out.println(currentDate1.plusMonths(2)); //2021-09-14 ==> monthsToAdd
		
		System.out.println(currentDate1.plusYears(5)); //2026-07-14 ==>yearsToAdd
		
		//Tomorrow
		LocalDate tomorrow= currentDate1.plusDays(1);
		System.out.println("Tomorrow Date: " + tomorrow);
		
		//Yesterday
		
		LocalDate yesterday=currentDate1.minusDays(1);
		System.out.println("Yesterday Date: "+ yesterday);
		
		System.out.println(currentDate1.plusDays(-11)); //2021-07-03
		
		System.out.println(currentDate1.plusDays(4).plusMonths(3).plusYears(2)); //2023-10-18
		
		System.out.println(currentDate1.getYear()); //2021
		
		System.out.println(currentDate1.getMonth()); //JULY
		
		System.out.println(currentDate1.getMonthValue()); // 7
		
		System.out.println(currentDate1.getDayOfMonth()); // 14
		
		System.out.println(currentDate1.getDayOfWeek()); // WEDNESDAY
		
		System.out.println(currentDate1.plusWeeks(5)); //2021-08-18
		
		System.out.println(currentDate1.minusDays(2)); //2021-07-12
		
		LocalDate date2=LocalDate.of(2020, 8, 10);
		//2021-07-12 vs 2021, 8, 10
		System.out.println(currentDate1.isAfter(date2)); //true
		
		System.out.println(currentDate1.isBefore(date2)); //false
		
		
		LocalDateTime dateTime1=LocalDateTime.now();
		System.out.println(dateTime1); // 2021-07-14T17:06:37.863372
		
		
		LocalDate currentDate2=LocalDate.now();
		System.out.println(currentDate2); //2021-07-14
		DateTimeFormatter dtformat1=DateTimeFormatter.ofPattern("dd/MMM/yy");
		/*
		 M=>  one digit of the month - 7, m=>minutes
		 MM=> two digits of the month -07.
		 MMM=> first tree characters of the month- Jul
		 MMMM=> Full name of the month - July
		 
		 
		 */
		
		System.out.println(dtformat1.format(currentDate2));
		
		LocalDateTime currentTime1=LocalDateTime.now();
		System.out.println(currentTime1); //2021-07-14T17:18:24.104135 I do not need the second and the rest
		
		DateTimeFormatter dtformat2=DateTimeFormatter.ofPattern("hh:mm");
		
		
		System.out.println(dtformat2.format(currentTime1)); //(12 hours format)hh:mm=> 05:20, (24 hours format)HH:mm=>17:21, 
		
		//How to find the difference of two dates
		
		LocalDate d1 =LocalDate.now();
		LocalDate d2= LocalDate.of(1981, 8, 10);
		//it returns Year, Months and Days
		Period age = Period.between(d1, d2);
		System.out.println(age); //P-39Y-11M-4D
		
		// If I want to get just a year
		
		int ageYear = Period.between(d2,  d1).getYears();
		System.out.println(ageYear); //39
		
	}

}
