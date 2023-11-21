public class Main {
    public static void main(String[] args) throws Exception {
        boolean t = true;
        try {
           System.exit(0);
        }catch (Exception e){
            throw new Exception();
        }finally {
            System.out.println("I work");
        }
    }
}
