package learn;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        //untuk menjaga akses field nya, agar tidak langsung diakses, harus melalui getter setter
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
