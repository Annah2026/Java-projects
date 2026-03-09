public class PackageExcemption {
   public class Functions {
    public static void main(String[] arg) {
        System.out.println("start main");
        FA(); // Calling FA
        System.out.println("End main");
    }

    public static void FA() {
        System.out.println("start A");
        FB();
        System.out.println("End A");
    }

    public static void FB() {
        System.out.println("start B");
        FC();
        System.out.println("End B");
    }

    public static void FC() {
        System.out.println("start C");
        System.out.println("End C");
    } 
}
