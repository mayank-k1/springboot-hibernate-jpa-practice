public class Sample2 {
    //static to static 
    static int a = 124;

    public static void test() {
        int a = 23;
        System.out.println(a);
        System.out.println(Sample2.a);
    }
 public static void main(String[] args)
    {
        test();
    }
}