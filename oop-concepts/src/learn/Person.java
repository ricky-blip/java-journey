package learn;

//Person is 'Class'
public class Person {
    //membuat field/atribute
    String name;
    String address;
    final String country = "Germany";

    //membuat Method
    void sayHello(String paramName){
        System.out.println(paramName + this.name);
    }

    //membuat Constractor biasa
    //    Person(String paramName, String paramAddress) {
    //            name = paramName;
    //            adress = paramAddress;
    //    }

    //membuat Constractor Overloading
    //---Constractor 1
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }
    //---Constractor 2
    Person(String paramName) {
        //name = paramName;
        //memanggil constractor 1 dengan this
        this(paramName,null );
    }
    //---Constractor 3
    Person(){
        this(null);
    }
}
