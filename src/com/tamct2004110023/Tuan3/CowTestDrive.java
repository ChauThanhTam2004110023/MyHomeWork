package vn.edu.Tuan3;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow(15);
        System.out.println("weight: " +cow.weight);
        cow.weight = 15;

        cow = new Cow(5);
        System.out.println("weight: " +cow.weight);
        cow.weight = 15;
    }
}
