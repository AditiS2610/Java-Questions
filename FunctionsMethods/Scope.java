public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        {
            int c = 78;
            System.out.println(c);
        }
        int c=20;
        System.out.println(c);
    }
    static void random(){

    }
}
