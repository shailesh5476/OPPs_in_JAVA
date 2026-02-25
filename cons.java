public class cons {
    int x = 10;
}
class con1 extends cons{
    int x = 20;
}
class MainClass{
    public static void main(String[] args) {
        con1 Ob = new con1();
        System.out.println(Ob.x);
    }
}
