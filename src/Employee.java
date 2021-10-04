public class Employee {
    String name;
    String address;
    int year;

    public Employee(String name,String address,int year){
        this.name = name;
        this.address = address;
        this.year = year;
        System.out.println(name+" "+year+" "+address);
    }

    public static void main(String[] args) {
        new Employee("Aman","Chandigarh",2021);
        new Employee("Sunil", "Mathura", 2000);
        new Employee("Rohan","Agra",2010);
    }
}
