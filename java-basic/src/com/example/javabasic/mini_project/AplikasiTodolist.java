package com.example.javabasic.mini_project;

public class AplikasiTodolist {

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("| APLIKASI TODOLIST JAVA BASIC  |");
        System.out.println("---------------------------------");
        //testShowTodolist();
        //testAddTodolist();
        //testRemoveTodolist();
        //testInput();
        //testviewShowTodoList();
        //testViewAddTodoList();
        //testViewRemoveTodoList();
        viewShowTodoList();
    }

    //MODEL - untuk menyimpan datanya
    public static String[] model = new String[10];

    //---------- BUSSINES LOGIC ----------
    //TAMPIL - data todo list
    public static void showTodolist(){
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodolist(){
        model[0] = "Belajar JAVA";
        model[1] = "Belajar DART";
        showTodolist();
    }

    //TAMBAH data todo list
    public static void addTodolist(String todo){
        //cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] ==null) {
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, kita resize ukuran array 2x lipat
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data arraynya NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodolist() {
        for (int i = 0; i < 25; i++) {
            addTodolist("Contoh Todo ke." + i);
        }

        showTodolist();
    }

    //HAPUS data todo list
    public static boolean removeTodolist(Integer number){
        if ((number - 1) >= model.length){
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            //model[number - 1] = null;
            //handle agar nomornya auto geser ketika diremove datanya
            for (int i = (number -1); i < model.length; i++) {
                if (i == (model.length -1)){
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        var result = removeTodolist(10);
        System.out.println(result);

        //result = removeTodolist(4);
        //System.out.println(result);

        result = removeTodolist(1);
        System.out.println(result);

        showTodolist();
    }

    //INPUT DATA dari USER
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    //----- VIEW -----
    //view data todo list
    public static void viewShowTodoList() {
        while (true){
            showTodolist();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")){
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }
    public static void testviewShowTodoList(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");
        viewShowTodoList();
    }

    //view add todo list
    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            //batal
        } else {
            addTodolist(todo);
        }
    }
    public static void testViewAddTodoList(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        viewAddTodoList();

        showTodolist();
    }

    //view remove todo list
    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang Dihapus (x Jika Batal)");

        if (number.equals("x")){
            //batal
        } else {
            boolean success = removeTodolist(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }
    public static void testViewRemoveTodoList() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        showTodolist();
        viewRemoveTodoList();
        showTodolist();
    }
}
