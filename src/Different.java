public class Different {
    public static void main(String[] args) {
        Different different = new Different();
        different.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in, System.out);

        while (io.hasMoreTokens()) {
            long n1 = io.getLong();
            long n2 = io.getLong();

            io.println(Math.abs(n1 - n2));
        }
        io.close();
    }

}
