package another;

class Human{
    int age;
    String name;
    static String country = "\"India\"";

    Human(int age, String name){
        this.age = age;
        this.name = name;
        // no need to initialise country here, as already the object for the static has instantiated.
    }
     void getinformation(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("Country: "+country);
    }

}

public class NewClass {
    public static void main(String[] args) {

        Human person1 = new Human(21,"Karthik Raja");
        Human person2 = new Human(23,"Yuvan Shankar Raja");


        person1.getinformation();
        System.out.println();
        person2.getinformation();
    }
}
