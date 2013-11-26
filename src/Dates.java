import java.util.Scanner;
public class Dates {
    public static void main(String[] args) {
        int month;
        int day;
        int year; //date read in from user
        int daysInMonth; //number of days in month read in
        int yearR1;
        int yearR2;
        int yearR3;
        boolean monthValid;
        boolean yearValid;
        boolean dayValid = false; //true if input from user is valid
        boolean leapYear = false; //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter the month, day,"
                + " and year, in the form mm dd yyyy: ");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        if (month >= 1 && month <= 12) {
           monthValid = true;
        } else {
            monthValid = false;
        }
        if (year >= 1000 && year <= 1999) {
            yearValid = true;
        } else {
            yearValid = false;
        }
    
    
        yearR1 = year % 4;
        yearR2 = year % 100;
        yearR3 = year % 400;
        
        if (yearR1 == 0 && yearR2 != 0 || yearR3 == 0) {
            leapYear = true;
        }
                
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2 && leapYear){
            daysInMonth = 29;
        } else if (month == 2) {
            daysInMonth = 28;
        } else {
            daysInMonth = 31;
        }
        
        if (day > 0 && day <= daysInMonth) {
            dayValid = true;
        }
        
        if (dayValid && monthValid && yearValid) {
            System.out.println("Date is valid");
            if (leapYear) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("It is not a leap year");
            }
        } else {
            System.out.println("Date is not valid");
        }
        scan.close();
    }
}
