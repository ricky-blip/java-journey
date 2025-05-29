package learn;

class Manager extends Employee{
//    String nameManager;

    String company;

    Manager(String name){
//        this.nameManager = name;
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + "My Name is Manager " + this.name);
    }

}

