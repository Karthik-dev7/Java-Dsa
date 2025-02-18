package Recursion;

public class Main {
    public static void main(String[] args) {
        sayHi(1);
    }
    public static void sayHi(int count){
        if(count == 5){
            System.out.println(count);
            return;
        }
        sayHi(count++);
    }

}
