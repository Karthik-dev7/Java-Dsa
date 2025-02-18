package Generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks +" "+rollno;
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println("In Compare to method");
      int diff = (int)(this.marks - o.marks);
      // if diff == 0, both are equal
      // if diff < 0, means o is bigger (or) smaller
      return diff;
    }
}
