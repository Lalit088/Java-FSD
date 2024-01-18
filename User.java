import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        String name;
        String course;
        String sid;
        int py = 1, ph = 1, j = 1;

        Scanner s = new Scanner(System.in);
        boolean a = true;

        while (a) {
            System.out.println("Please enter the name:");
            name = s.next();

            System.out.println("Please enter the course (Java/Python/PHP):");
            course = s.next().toLowerCase();

            if (course.equals("java")) {
                sid = course + j;
                System.out.println("Student sid is: " + sid);
                j++;
            } else if (course.equals("python")) {
                sid = course + py;
                System.out.println("Student sid is: " + sid);
                py++;
            } else if (course.equals("php")) {
                sid = course + ph;
                System.out.println("Student sid is: " + sid);
                ph++;
            } else {
                System.out.println("Invalid course. Please choose Java, Python, or PHP.");
            }

            System.out.println("Do you want to continue? (yes/no):");
            String continueChoice = s.next().toLowerCase();
            a = continueChoice.equals("yes");
        }

        System.out.println("Thank you for using the Student Registration System.");
        s.close();
    }
}
