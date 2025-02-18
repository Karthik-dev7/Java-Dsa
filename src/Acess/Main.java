package Acess;

public class Main {
    public static void main(String[] args) {
        A obj = new A(12, "Karthik Raja");

        obj.getNum();
    }
    class Subclass extends A{
        public Subclass(int num, String name) {
            super(num, name);

            Subclass random = new Subclass(68,"fuggaround andfindout");
            random.getNum();
        }
    }
}