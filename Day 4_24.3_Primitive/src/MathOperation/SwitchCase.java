package MathOperation;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int dayNumber = scanner.nextInt();
        System.out.println("Number you used is: " +dayNumber);
        System.out.println(determineNameOfDay(dayNumber));
        System.out.println(isWeekDay(dayNumber));
        System.out.println(determineNameOfMonth(dayNumber));
       }

    public static String determineNameOfDay(int dayNumber){
        String result = "";

        switch (dayNumber){
            case 1: result = "SUNDAY";
                break;
            case 2: result = "MONDAY";
                break;
            case 3: result = "TUESDAY";
                break;
            case 4: result = "WEDNESDAY";
                break;
            case 5: result = "THURSDAY";
                break;
            case 6: result = "FRIDAY";
                break;
            case 7: result = "SATURDAY";
                break;
        }
        return result;
    }
    public static boolean isWeekDay(int dayNumber){
        switch (dayNumber){
            case 1: return false;
            case 2: return true;
            case 3: return true;
            case 4: return true;
            case 5: return true;
            case 6: return true;
            case 7: return false;
        }
        return false;
    }
    public static String determineNameOfMonth(int dayNumber){
        String result = "";

        switch (dayNumber){
            case 1: result = "January";
                break;
            case 2: result = "February";
                break;
            case 3: result = "March";
                break;
            case 4: result = "April";
                break;
            case 5: result = "May";
                break;
            case 6: result = "June";
                break;
            case 7: result = "July";
                break;
            case 8: result = "August";
                break;
            case 9: result = "September";
                break;
            case 10: result = "October";
                break;
            case 11: result = "November";
                break;
            case 12: result = "December";
                break;
        }
        return result;
    }
}
