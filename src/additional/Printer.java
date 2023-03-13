package additional;

import java.util.Random;

public class Printer {
    String ansiColorOfText;
    public Printer(){
        Random random = new Random();

        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        this.ansiColorOfText = String.format("\033[38;2;%d;%d;%dm", r, g, b);
    }

    public void print (String value){
        System.out.println(ansiColorOfText + value + "\033[0m");
    }
}
