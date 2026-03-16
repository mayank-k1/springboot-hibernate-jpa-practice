class Student {
    static String name = "momo";
    static int rollno = 7;
    static char gender = 'F';

    public static void studetails() {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(gender);
    }

    public static void main(String[] args) {
        Student.studetails();
    }
}