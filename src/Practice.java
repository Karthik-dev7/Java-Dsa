class person{
    String name;
    int age;
    int salary;
    boolean married;

    person(String name, int age, int salary, boolean married) {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
    }
    void displaydetails(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
        System.out.println("married: "+ married);
    }
}
public class Practice {
    public static void main(String[] args) {

        person person1 = new person("Karthik Raja", 22, 35000, false);
        person person2 = new person("Rahul Raja", 21, 36000, true);

//        person1.displaydetails();
//        System.out.println();
//        person2.displaydetails();
    }
      void greeting(){
          System.out.println("hello world");
        fun();
      }
      static void fun(){
//          System.out.println("it's fun jane");
          Practice obj = new Practice();
          obj.greeting();
      }

}