

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
    m.hello("András");
    m.hello("");

    }

    public String hello(String navn) {
        if (navn.equals("")) {
            System.out.println("Hello World!");
            return "Hello World!";
        } else {
            System.out.println("Hello " +  navn + "!");
            return "Hello " +  navn + "!";
        }
    }

}
