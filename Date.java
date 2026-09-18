public class Date {

    public void DisplayDate(int day, int month, int year){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.print("\n"+month+"/"+day+"/"+year + "\n"+months[month-1]+" "+day+", "+year + "\n"+day+" "+months[month-1]+" "+year);
    }

}
