import java.util.Scanner;


public class Quickmaths {

    Scanner scanner = new Scanner(System.in);

    double gennemsnit(double a, double b) {


        return ((a + b) / 2);
    }

    int Sum(int a, int b) {


        return (a+b);
    }

    public void start() {
    while (true) {
        Quickmaths math = new Quickmaths();
        System.out.println("**** Quickmaths ****");
        System.out.print("Indtast A: ");
        int First = scanner.nextInt();
        System.out.print("Indtast B: ");
        int Anden = scanner.nextInt();
        System.out.println("Sum: " + math.Sum(First,Anden));
        System.out.println("Gennemsnit: " + math.gennemsnit(First,Anden));
        System.out.println("--------------");
    }
    }

    public static void main(String[] args) {
        Quickmaths math = new Quickmaths();
        math.start();


    }

}
