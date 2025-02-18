package Generics;

public class Test {
    static int isLeapyear(int n){
        if((n % 4 == 0 && n % 100 != 0)||(n % 400 == 0)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int year = 2021;
        System.out.println(isLeapyear(year));

    }
}
