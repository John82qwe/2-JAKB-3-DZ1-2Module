import java.util.Scanner;

public class University {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John", "White");
        Teacher teacher2 = new Teacher("Alex", "Johnson");
        Teacher teacher3 = new Teacher("Antony", "Martial");


        teacher1.Full_array();
        teacher1.show_info();
        teacher1.Calling_student_methods();
        teacher2.Full_array();
        teacher2.show_info();
        teacher2.Calling_student_methods();
        teacher3.Full_array();
        teacher3.show_info();
        teacher3.Calling_student_methods();



    }
}
