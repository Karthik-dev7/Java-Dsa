
public class Bogus {
        static int a = 10;
        static int b;

        static{
            b = a*20;
            System.out.println("I'm Leo");
        }

    public static void main(String[] args) {

        Bogus obj = new Bogus();
        System.out.println(Bogus.a+" "+Bogus.b);

        Bogus.b += 3;
        System.out.println(Bogus.b);

        Bogus obj2 = new Bogus();
        b = 234;
        System.out.println(b);

    }

    }
