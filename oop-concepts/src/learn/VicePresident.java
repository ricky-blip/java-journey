package learn;

class VicePresident extends Manager{
    //Super Constractor
    VicePresident(String name){
        super(name  );
    }

    //Method Overriding, membuat ulang method dari class parent nya
    void sayHello(String name){
        System.out.println("Hello " + name + "My Name is VP " + this.name);
    }
}
