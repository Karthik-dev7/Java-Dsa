public class InnerClass {
    static class A{
        String name;
        int age;
        static String degree = "Arts";

        public A(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return degree;
        }
    }
    public static void main(String[] args) {
        A name = new A("karthik", 12);
        System.out.println(name);

    }
}