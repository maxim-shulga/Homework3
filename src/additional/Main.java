package additional;

public class Main {
    public static void main(String[] args) {
        Canon printer1 = new Canon();
        Samsung printer2 = new Samsung();
        Samsung printer3 = new Samsung();
        printer1.print("Canon is printing");
        printer2.print("Samsung is printing");
        printer3.print("Samsung2 is printing");

    }
}
