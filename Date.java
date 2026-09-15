import java.util.Scanner;

public class Date {
    public static void main(String args[]){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int month=0, day=0, year=0;

        Scanner newScanner=new Scanner(System.in);
        System.out.print("Enter the day: ");
        day=newScanner.nextInt();

        System.out.print("Enter the month: ");
        month=newScanner.nextInt();

        System.out.print("Enter the year: ");
        year=newScanner.nextInt();

        System.out.print(month+"/"+day+"/"+year + "\n"+months[month-1]+" "+day+", "+year + "\n"+day+" "+months[month-1]+" "+year);
    }
}
