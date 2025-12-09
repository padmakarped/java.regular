package NonAccesModifier;

public class Statick {

    static String companyname;
    int id;
    String name;
    double salary;

    public Statick(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display()
    {
        System.out.println("Company Name:"+companyname);
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        // System.out.println("Salary:"+salary);
        Calculatesalary();
    
        System.out.println("===================================:");
    }
     /// static method all object logic is same
    static void Calculatesalary()
    {
        double dailysalary=500.00;
        double monthly=dailysalary*30;

        System.out.println("Monthly Salary:"+monthly);
    }


    public static void main(String[] args) {
       companyname="TCS";

       Statick e1=new Statick(1, "ram", 50000);
       e1.display();
       Statick e2=new Statick(2, "shyam", 60000);
       e2.display();
       Statick e3=new Statick(2, "shyam", 10000);
       e3.display();
       Calculatesalary();
       
        
        


    }
    



//     static String companyname;
//     int id;
//     String name;
//     String department;
//     double salary; 
    
//     public Statick(int id, String name, String department, double salary)
//     {
//         this.id=id;
//         this.name=name;
//         this.department=department;
//         this.salary=salary;
//     }

//     void display()
//     {
//         System.out.println("companyname:"+companyname);
//         System.out.println("id:"+id);
//         System.out.println("name:"+name);
//         System.out.println("department:"+department);
//         System.out.println("salary:"+salary);
//     }
// public static void main(String[] args) {

//     Statick e1=new Statick(1,"padmakar","computer",50000);
//     Statick.companyname="infosis";
//     e1.display();
// }

    
}
