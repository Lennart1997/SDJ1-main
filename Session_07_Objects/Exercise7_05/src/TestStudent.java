import java.util.Scanner;

public class TestStudent
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Jack", 'M', 123);
    Student student2 = new Student("Bob", 'M', 213);
    Student student3 = new Student("Jane", 'F', 312);

    //just some little scanner fun here!
    /*System.out.println("Enter a name for student1");
    Scanner input = new Scanner(System.in);
    student1.setName(input.nextLine());*/

    student1.setName("Irene");
    student1.setGender('F');
    student1.setStudentNumber(333);

    System.out.println(student1.getName());
    System.out.println(student1.getGender());
    System.out.println(student1.getStudentNumber());

    System.out.println(student1.toString());
    System.out.println(student2.toString());
    System.out.println(student3.toString());
  }
}
