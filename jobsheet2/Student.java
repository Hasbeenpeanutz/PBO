package jobsheet2;
public class Student {
    public String nim;
    public String name;
    public String address;
    public String className;

    public void displayBio(){
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Class: " + className);
    }
}
