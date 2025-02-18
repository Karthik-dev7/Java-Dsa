
public class Main {
    public static void main(String[] args) {

        Student karthik = new Student(21, "Karthik Raja", 87.65f,2002, "COMPUTER SCIENCE");
        Student joel = new Student(23, "Joel Santhosh", 89.85f,2012, "BIOLOGY");
        Student akash = new Student(22, "Akash", 92.70f,2005, "ACCOUNTANCY");
        Student vijay = new Student(24, "Joseph Vijay", 87.50f,2999, "POLITICAL SCIENCE");


//        karthik.changeName("Roronoa Zoro");
//        akash.greeting();

        //created to execute no.4 (refer.below)
//      Student random = new Student(karthik);
//        System.out.println(random.name);

        Student one = new Student();
        Student two = one;

        one.name = "Shanks";

        System.out.println(two.name);

//

        //created to execute n0.5 (refer.below)
//        Student random2 = new Student();
//        System.out.println(random2.group);

//        System.out.println(vijay.name);

//        System.out.println(karthik.name);
//        System.out.println(akash.year);
//        System.out.println(joel.marks);

    }
}
class Student{

    // 1.creating a new class named "Student" that contains every detail of them
    int rnos;
    String name;
    float marks;
    int year;
    String group;


    Student(int rnos, String name, float marks, int year, String group){
        // 2.assigning what are the data types should the new class should contain
        //  by creating this, we can as much student profile's we want
        this.rnos = rnos;
        this.name = name;
        this.marks = marks;
        this.year = year;
        this.group = group;
    }

    void greeting(){
        //3.function created to generate greeting message with a person name
        System.out.println("hello! my name is: "+ this.name);
    }

    Student (Student other){
        //4.created to assign a student values to another one(by creating new object)
        this.rnos = other.rnos;
        this.name = other.name;
        this.marks = other.marks;
        this.year = other.year;
        this.group = other.group;
    }

    Student(){
        // 5.calling a constructor from another constructor
        // internally: new Student();
        this(19, "default person", 100.0f, 2004, "ZOOLOGY");
    }

    void changeName (String naam){
        //6.function created to change name of any given student
        name = naam;
    }

}