package daysInMonth.calculator;

public class DaysInMonth {

	public static int daysInMonth(int month, int year) {
		
		if (year < 1700) {                                               //returns error (-1) if year is before 1700 AD
			return -1;
	    }
	      
	    else if (month == 1 || month == 3 || month == 5 || month == 7    //determines if the month is a month that regularly has 31 days
	                   || month == 8 || month == 10 || month == 12) {
	        return 31;
	    }
	      
	    else if (month == 4 || month == 6 || month == 9 || month == 11){ //determines if the month is a month that regularly has 30 days
	         return 30;
	    }
	      
	    else if (month == 2) {                                           //if february
	    	if ( year % 4 != 0) {                                        //if remainder of year divided by 4 does not equal 0
	    		return 28;                                               //it identifies that it is not a leap year and returns 28 as days in february
	         }
	         
	         else{                                                       //else it is a leap year and returns 29
	            return 29;
	         }
	    }
	      
	    else {                                                           //else if any value for month not listed is inputted, the program returns
	         return -1;                                                  //an error becasue of an unexisting month
	    }
	}
	   
	public static void main(String[] args) {

		System.out.println( daysInMonth(1,2000) );                       //Jan 2000 return 31
	    System.out.println( daysInMonth(2,2101) );                       //feb 2101 return 28 non leap year
	    System.out.println( daysInMonth(2,2020) );                       //feb 2020 return 29 leap yr
	    System.out.println( daysInMonth(2,2100) );                       //feb 2100 return 29 leap yr
	    System.out.println( daysInMonth(3,2000) );                       //march 2000 return 31
	    System.out.println( daysInMonth(4,2000) );                       //april 2000 return 30
	    System.out.println( daysInMonth(1,1699) );                       //jan 1699 return error (-1) (year before 1700ad)
	    System.out.println( daysInMonth(1,1700) );                       //jan 1700 return 31
	    System.out.println( daysInMonth(0,2000) );                       //month 0 return -1 (invalid yr error)
	    System.out.println( daysInMonth(13,2000) );                      //month 13 return -1 (invalid yr error)
	    System.out.println( daysInMonth(12,2000) );                      // december 2000 return 31
	}
}
