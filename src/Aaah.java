public class Aaah {
    public static void main(String[] args) {
        Aaah aah = new Aaah();
        aah.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in, System.out);

        while (io.hasMoreTokens()) {
            String a = io.getWord();
            String b = io.getWord();

            io.println(b.length() > a.length() ? "no" : "go");
        }
        io.close();
    }
}