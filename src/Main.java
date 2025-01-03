import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Nmpa", "phou", 123, "tena", 2010);
        Book b2 = b1.clone();
        System.out.printf("Tittle : %s by %s (%d pages)", b1.getAuthor(), b1.getTitle(), b1.getPages(), b1.getPublisher());
        b2.setPublishedyear(1000);
        //ArrayList has Dynamic length depends on number of element 
        ArrayList <Book> books = new ArrayList<>();
        boolean exit = false;
while (exit == false) { 
    
        System.out.println("""
------------------------- Menu -------------------------
1. List students
2. Add a new student (use prototype)
3. Create multiple students (use prototype)
4. Update a student by index
5. Remove a student by index
6. Remove all students
0. Exit
--------------------------------------------------------
""");

        Scanner input = new Scanner(System.in);
        int options = input.nextInt();
        switch (options) {
            case 0 :
                exit = true;
                break;
            case 1:
                System.out.println("List of students");
                break;
            case 2 :
                System.out.println("Add a new student");
                break;
        
            default:
                System.out.println("Choose only from 1 to 6");
                break;

        }
    }
}
}
