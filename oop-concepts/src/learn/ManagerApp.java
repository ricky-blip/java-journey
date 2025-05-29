package learn;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Manager");
        manager.name = "Ricky";
        manager.sayHello("aaa");

        var vp = new VicePresident("Vice President");
        vp.name = "Jokowi";
        vp.sayHello("aaaa");

        System.out.println(manager);
    }
}
