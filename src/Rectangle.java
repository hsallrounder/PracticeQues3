import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void arorect(){
        System.out.println(length*breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        (new Rectangle(sc.nextInt(),sc.nextInt())).arorect();
        (new Rectangle(sc.nextInt(),sc.nextInt())).arorect();
    }
}
