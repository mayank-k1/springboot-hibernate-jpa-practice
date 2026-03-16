class MathsExe {
    public void prime() {
        int a = 7;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }
        if (count >= 2) {
            System.out.println("no is prime");
        } else {
            System.out.println("no is not prime");
        }
    }

    public void even() {
        int b = 8;
        if (b % 2 == 0)
            System.out.println("no is even");
        else
            System.out.println("no is not even");
    }

    public static void main(String[] args) {
        new MathsExe().even();
        new MathsExe().prime();
    }
}