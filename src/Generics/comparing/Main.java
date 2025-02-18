package Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student karthik = new Student(23, 76.5f);
        Student joel = new Student(24, 77.5f);
        Student karan = new Student(22, 79.5f);
        Student vijay = new Student(21, 80.5f);
        Student raj = new Student(25, 92.5f);

        Student[] list = {karthik, joel, karan, vijay, raj};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> {
            return -(int) (o1.marks-o2.marks); // - displays in descending order
        });
        System.out.println(Arrays.toString(list));


//        if(joel.compareTo(karthik) > 0){
//            System.out.println(joel.compareTo(karthik));
//            System.out.println("Joel is Higher");
//        }
    }
}
