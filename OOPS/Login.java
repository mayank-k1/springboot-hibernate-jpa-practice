class Login {
    static String username = "robbin";
    static String pass = "robbin123";
    static String name = "mayank";

    public static void idpass() {
        if (username == "robbin" && pass == "robbin123") {
            System.out.println("login successfull");
        } else {
            System.out.println("invalid id pass");
        }
    }

    public static void main(String[] args) {
        Login.idpass();
        System.out.println("username=" + Login.name);
        // System.out.println(login.phono);
    }
}