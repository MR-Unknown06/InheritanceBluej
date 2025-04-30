
/**
 * Write a description of class Ax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccessInheritance {
    public static void main(String[] args) {
        Department Dept = new Department();
        Department financeDept = new FinanceDepartment();
        Department serviceDept = new ServiceDepartment();
        System.out.println("Department Information:");
        Dept.depInfo();
        financeDept.depInfo();
        serviceDept.depInfo();
        
    }
}