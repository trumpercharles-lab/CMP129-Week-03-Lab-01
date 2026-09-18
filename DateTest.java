import java.util.Scanner;

public class DateTest {
    
    public static void main(String args[]){
        int day=0, month=0, year=0;

        Scanner newScanner=new Scanner(System.in);
        System.out.print("Enter the day: ");
        day=newScanner.nextInt();

        System.out.print("Enter the month: ");
        month=newScanner.nextInt();

        System.out.print("Enter the year: ");
        year=newScanner.nextInt();

        Date DateObject=new Date();
        DateObject.DisplayDate(day, month, year);
    }
    
}
