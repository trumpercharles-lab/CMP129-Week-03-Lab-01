public class EmployeeTest {
    
    public static void main(String args[]){
        Employee Employee1=new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println("Name: "+Employee1.GetName()+"\nID: "+Employee1.getID()+"\nDepartment: "+Employee1.GetDepartment()+"\nPosition: "+Employee1.GetPosition());

        Employee Employee2=new Employee("Mark Jones", 39119, "IT", "Programmer");
        System.out.println("\nName: "+Employee2.GetName()+"\nID: "+Employee2.getID()+"\nDepartment: "+Employee2.GetDepartment()+"\nPosition: "+Employee2.GetPosition());

        Employee Employee3=new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println("\nName: "+Employee3.GetName()+"\nID: "+Employee3.getID()+"\nDepartment: "+Employee3.GetDepartment()+"\nPosition: "+Employee3.GetPosition());
    }

}
