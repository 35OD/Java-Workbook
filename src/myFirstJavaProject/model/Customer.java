package myFirstJavaProject.model;

public class Customer {
    private String name;
    private String address;

    public Customer(){
        this.name = "Vic";
        this.address = "3 bee street";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
