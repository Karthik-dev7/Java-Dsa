package polymorphism;

public class Main{
    int  sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return  a+b;
    }

    static void name(String name){
        System.out.println("Hello"+" "+name);
    }

    public static void main(String[] args) {

//        Main obj = new Main();
//        int result = obj.sum(2,34);
//
//        System.out.println(result);
//      name("karthik");
//        String result = "Hello".toLowerCase().concat(" World").toUpperCase();
//        System.out.println(result);

//        Shapes shape = new Shapes();
//        Circle circle = new Circle();
//        Shapes square = new Square();

        Shapes random = new Triangle();

        random.area();

//        shape.area();
//        square.area();
//        circle.area();
    }

}
