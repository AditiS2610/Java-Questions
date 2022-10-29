public class Overload {
    public static void main(String[] args) {
        fun("Abhishek Niranjan");
        fun(56);

        int ans= sum(45,68);
        System.out.println(ans);
        int and = sum(25,14,68);
        System.out.println(and);

    }

    static  int sum(int a, int b){
        return a + b;

    }
    static int sum(int a, int b, int c){
        return a+b+c;

    }

    static void fun(int a){
        System.out.println(a);

    }

    static void fun( String name){
        System.out.println(name);
    }
}
