

public class Main {

    public static void main(String[] args) {
    hello("András");
    hello("");

    }

    public static String hello(String navn) {
        if (navn.equals("")) {
            System.out.println("Hello World!");
        } else {
            System.out.println("Hello " +  navn);
        }
        return "";
    }

}
