public class APCS_0508{
    public static void main(String[] args) {
        // client program, Tools_0426.java
        // main method
        int a = 18;
        int b = 14;
        int c = Tools_0426.add(a, b);
        System.out.println(c);

        int x = 10;
        x = Tools_0426.modify(x);
        System.out.println(x);

        int y = 5;
        System.out.println(Tools_0426.weekday(y));
    }
}