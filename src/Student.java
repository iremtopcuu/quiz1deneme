public class Student {
    String name;
    int age;
    char gender;
    boolean isJunior;

    public Student(){
        name="";
        age=0;
        gender='m';
        isJunior=false;
    }
    public void info(){
    System.out.println(name+ " "+ age+" "+ gender+ " "+isJunior);

    }
}
