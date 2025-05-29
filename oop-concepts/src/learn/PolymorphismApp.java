package learn;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("EKo");
        employee.sayHello("Budi");

        employee = new VicePresident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko E"));
        sayHello(new Manager("Eko M"));
        sayHello(new VicePresident("Eko V"));
    }

    //Kelas paling atas
    static void sayHello(Employee employee){
        //instanceof untuk mengecek apakah benar class yang dituju
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
