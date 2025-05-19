package learn;

class Manager {
    String nameManager;

    Manager(String name){
        this.nameManager = name;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + "My Name is Manager " + this.nameManager);
    }
}

