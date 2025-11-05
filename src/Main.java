public class Main {
    public static void main(String[] args) {

        //Q1
        /*Engine e1 = new Engine(120);
        Engine e2=new Engine(200);
        Engine e3=new Engine(300);

        Car s1 = new Car("Honda", "Civic", 2022, e1, FuelType.GASOLINE);
        Car s2 = new Car("BMW", "320d", 2021, e2, FuelType.DIESEL);
        Car s3 = new Car("Tesla", "Model S", 2024, e3, FuelType.ELECTRIC);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();*/


        //Q2
       /* Book b1=new Book();
        Book b2=new Book("Harry Potter", "J.K.Rowling",120);
        b1.showDetails();
        b2.showDetails();*/

 Student s=new Student();
 System.out.println(s.age);
 System.out.println(s.name);
        s.age = 15;
        s.name = "Ayşe";
        s.gender = 'f';
        s.isJunior = true;
System.out.println(s.age);
System.out.println(s.name);
s.info();
    }
}