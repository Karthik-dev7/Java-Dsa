package Recursion;

public class FunctionCall {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n == 10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        //this is called tail recursion(the last function to be called)
        print(n + 1);
    }
}
