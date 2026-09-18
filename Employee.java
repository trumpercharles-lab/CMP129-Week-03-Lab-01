public class Employee {
    public String name,department,position;
    public int idNumber;

    public Employee(String Ename, int EidNumber, String Edepartment, String Eposition){
        name=Ename;
        idNumber=EidNumber;
        department=Edepartment;
        position=Eposition;
    }

    public Employee(String Ename, int EidNumber){
        name=Ename;
        idNumber=EidNumber;
        department="";
        position="";
    }

    public Employee(){
        name="";
        idNumber=0;
        department="";
        position="";
    }

    public void ChangeName(String Nname){
        name=Nname;
    }

    public void ChangeID(int ID){
        idNumber=ID;
    }

    public void ChangeDepartment(String Ndepartment){
        department=Ndepartment;
    }

    public void ChangePosition(String NPosition){
        position=NPosition;
    }

    public String GetName(){
        return name;
    }

    public int getID(){
        return idNumber;
    }

    public String GetDepartment(){
        return department;
    }

    public String GetPosition(){
        return position;
    }

}
