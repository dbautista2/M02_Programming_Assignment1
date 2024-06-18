// 10.14
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor
    public MyDate() {
        Calendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Set date with elapsed time
    public void setDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Main method to test the MyDate class
    public static void main(String[] args) {
        // Create a MyDate object for the current date
        MyDate date1 = new MyDate();
        System.out.println("Current date:");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());

        // Create a MyDate object with specified elapsed time
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date with elapsed time 34355555133101L:");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
    }
}

/* 
              MyDate                 

 - year: int                        
 - month: int                        
 - day: int                          

 + MyDate()                          
 + MyDate(elapsedTime: long)         
 + MyDate(year: int, month: int, day: int) 
 + getYear(): int                    
 + getMonth(): int                   
 + getDay(): int                     
 + setDate(elapsedTime: long): void

*/