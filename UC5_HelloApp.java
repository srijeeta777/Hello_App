public class UC5_HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello ");
            boolean first = true;
            for (String name : args) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(name);
                first = false;
            }
            System.out.println("!");
        }
    }
}