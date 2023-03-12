public class Main {
    public Main(){
        System.out.println("constructor block");
    }

    {
        System.out.println("block 1");
    }
    {
        System.out.println("block 2");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
       Main mn = new Main();
    }
}