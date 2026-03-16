class Sample1 {
    //static to non static
    int a = 125;

    public static void test() {
        int a = 25;
        System.out.println(a);
        System.out.println(new Sample1().a);
    }

    public static void main(String[] args) {
        test();
    }
}