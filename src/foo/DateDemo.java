package foo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class DateDemo {

	public static void main(String[] args) {
		/*
		 * Date d=new Date(); Locale l=new Locale("HI","IN"); DateFormat
		 * df=DateFormat.getDateInstance(DateFormat.FULL,l);
		 * System.out.println(df.format(d));
		 */
		LocalDate ld=LocalDate.now();
		//LocalDateTime ldt=LocalDateTime.now();
		//System.out.println(ld.getMonth());
		
		LocalDate ld1=LocalDate.of(2018, Month.JANUARY, 01);
		
		System.out.println(ld);
		System.out.println(ld1);
		
		long year=ChronoUnit.DAYS.between(ld1, ld);
		System.out.println("Diff in Year"+year);
		

	}

}
