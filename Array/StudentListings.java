package p2;

/** @author Nelson Hazelbaker
 * Programming Exercises 2.19 and 2.20
 * (Code Modeled after guide in textbook)
 */
public class StudentListings {

    private String name;  // key field
    private String number;
    private String gpa;

    public StudentListings(String n, String num, String g) {
        name = n;
        number = num ;
        gpa = g;
    }

    public String toString() {
        return ("Student Name is " + name
                + "\nStudent Number is " + number
                + "\nGrade Point Average is " + gpa + "\n");
    }

    public StudentListings deepCopy() {
        StudentListings clone = new StudentListings(name, number, gpa);
        return clone;
    }

    public int compareTo(String targetKey) {
        return (name.compareTo(targetKey));
    }

}// end of class StudentListing
