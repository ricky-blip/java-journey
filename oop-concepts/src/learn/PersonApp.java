package learn;

public class PersonApp {
    //Membuat Object
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        var name = person1.name = "Ricky";
        var address = person1.address = "Palembang";
        System.out.println(name);
        System.out.println(address);
        System.out.println(person1.country);
        person1.sayHello("Ini Method");
    }
}
