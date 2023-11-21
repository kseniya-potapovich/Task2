public class Main {
    public static void main(String[] args) throws Exception {
        boolean t = true;
        try {
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I work");
        }
    }
}
