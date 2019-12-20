

public class Main {

    public static void main(String[] args) {
        //instantere m så vi kan kalde på mains metoder
        Main m = new Main();
    m.hello("András");
    m.hello("");

    }

    public String hello(String navn) {
        // if statement der gør at der kommer til at stå hello András eller vis der ikke står noget så bare hello world.
        if (navn.equals("")) {
            System.out.println("Hello World!");
            return "Hello World!";
        } else {
            System.out.println("Hello " +  navn + "!");
            return "Hello " +  navn + "!";
        }
    }

}
