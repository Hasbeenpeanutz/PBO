package jobsheet2;
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.nim = "123456";
        s1.name = "Yansy Ayuningtyas";
        s1.address = "Nias, Sumatra Utara";
        s1.className = "2A";

        Student s2 = new Student();
        s2.nim = "654321";
        s2.name = "John Doe";
        s2.address = "Jakarta";
        s2.className = "2G";

        Student s3 = new Student();
        s3.nim = "789012";
        s3.name = "Jane Smith";
        s3.address = "Bandung";
        s3.className = "2G";

        s1.displayBio();
        s2.displayBio();
        s3.displayBio();

    }
}
