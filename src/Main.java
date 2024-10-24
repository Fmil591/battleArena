import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Kommandozeilenemnue k = new Kommandozeilenemnue();
        Drache d = new Drache("DracheSpieler", false, 100);
        Zwerg z = new Zwerg("ZwergSpieler", false, 100);

        Charakter currentCharacter;
        Charakter otherCharacter;
        int anfang = ThreadLocalRandom.current().nextInt(2);
        if (anfang == 0) {
            currentCharacter = d;
            otherCharacter = z;
            System.out.println("Drache startet.");
        } else {
            currentCharacter = z;
            otherCharacter = d;

            System.out.println("Zwerg startet.");
        }
        Scanner scanner = new Scanner(System.in);
        while (d.getLebenspunkte()>0 && z.getLebenspunkte()>0) {
            k.MenüAnzeigen();
            int action = scanner.nextInt();



            switch (action) {
                case 1:
                    currentCharacter.angreifen(otherCharacter);
                    break;
                case 2:
                    currentCharacter.spezialFähigkeit();
                    break;

                default:
                    System.out.println("Ungültige Eingabe. Bitte wiederholen.");
                    continue;}

            d.displayStatus();
            z.displayStatus();

            if (currentCharacter == d) {
                currentCharacter = z;
                otherCharacter = d;
            } else {
                currentCharacter = d;
                otherCharacter = z;
            }
            System.out.println(currentCharacter.getName()+" ist am Zug");
        }


        if (d.getLebenspunkte()>0) {
            System.out.println("Drache gewinnt!");
            System.exit(0);
        } else if(z.getLebenspunkte()>0) {
            System.out.println("Zwerg gewinnt!");
            System.exit(0);
        }













    }}
