package learn;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Manager");
        manager.nameManager = "Ricky";
        manager.sayHello("aaa");

        var vp = new VicePresident();
        vp.nameManager = "Jokowi";
        vp.sayHello("aaaa");

        System.out.println(manager);
    }
}
