package learn;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); //class abstract tidak bisa dijadikan object
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
