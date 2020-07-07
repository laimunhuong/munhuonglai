package employee;

public class TestEmployee {
    public static void main(String []args){
        
        Employee emp1 = new Employee("Ali",5000);
        Employee emp2 = new Employee("Abu");
        emp2.setSalary(4500);
        
        if(emp1.getSalary() > emp2.getSalary()){
            System.out.println(emp1.getName());
        }else{
            System.out.println(emp2.getName());
        }
        
        
        
        System.out.println("Sum of salary is "+ (emp1.getSalary() + emp2.getSalary()) );
        
        //System.out.println("(BEFORE)Salary:"+ emp1.getSalary());
        
        //emp1.raiseSalary(8.0);
        
        //System.out.println("(AFTER)Salary:"+ emp1.getSalary());
        
    }
    
}
