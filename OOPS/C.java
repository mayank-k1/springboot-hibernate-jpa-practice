class A {
    static int a = 5;

    public static void count() {
        System.out.println("count()");
    }
}

class B {
    public static void test() {
        System.out.println("test()");
    }

    public static void check() {
        System.out.println("check()");
    }
}

class C {
    public static void display() {
        System.out.println("display()");
    }

    public static void main(String[] args) {
        System.out.println(A.a);
        A.count();
        B.test();
        B.check();
        display();
    }
}