import java.util.Arrays;

public class Wrapper {
    public static void main(String[] args) {

//        Adios hitler = new Adios(12, "Adolf Hitler", 'B',87.5f, true );
//        Adios mussolini = new Adios(15, "Benito Mussolini", 'C',92.2f, false );

//        System.out.println(hitler.name);
//        System.out.println(mussolini.status);

//        int a = 10;
//        a = 20;
//        System.out.println(a);

        Adios obj;
//        for (int i = 0; i < 1000000; i++) {
//            obj = new Adios("dhanapal");
//
//        }


    }
}

class Adios{
//    int sno;
    String name;
//    char grade;
//    float marks;
//    boolean status;

    Adios( String name){
//        System.out.println("Object Created");
//        this.sno = sno;
        this.name = name;
//        this.grade = grade;
//        this.marks = marks;
//        this.status = status;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}