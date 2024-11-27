package encapInheritance;

import encapInheritance.model.LibraryUser;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        LibraryUser obj = new LibraryUser("Vic", "vic@gmail.com");
        System.out.println(obj);
    }
}