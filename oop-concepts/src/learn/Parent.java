package learn;

class Parent {
    String name;
    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    String name;
    void doIt() {
        System.out.println("Do it in child");
        //akses name ke class atasnya
        System.out.println("Parent name is " + super.name);
    }
}
