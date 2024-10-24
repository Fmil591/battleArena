import java.util.concurrent.ThreadLocalRandom;

public class Zwerg extends Charakter {
    public Zwerg(String name, boolean spezialfähigkeitAktiv, int lebenspunkte) {
        super(name, spezialfähigkeitAktiv, lebenspunkte);
    }

    public void angreifen(Charakter gegner) {
        int basisAngriffswert = ThreadLocalRandom.current().nextInt(15, 26);

        if (isSpezialfähigkeitAktiv()) {

            double successChance = getSuccessChance();
            if (ThreadLocalRandom.current().nextDouble() < successChance) {
                basisAngriffswert *= 2;
                System.out.println("Die Spezialfähigkeit war erfolgreich und verdoppelt den Angriffswert");
            } else {
                basisAngriffswert /= 2;
                System.out.println("Die Spezialfähigkeit war nicht erfolgreich und halbiert den Angriffswert");
            }
        }

        gegner.setLebenspunkte(gegner.getLebenspunkte() - basisAngriffswert);

    }

    public void spezialFähigkeit() {
        if (!isSpezialfähigkeitAktiv() && getLebenspunkte() < 50) {
            spezialfähigkeitAktiv = true;
            System.out.println("Die Spezialfähigkeit 'Zwergeenkopfnuss' wurde aktiviert.");
        } else if (isSpezialfähigkeitAktiv()) {
            spezialfähigkeitAktiv = false;
            System.out.println("Die Spezialfähigkeit 'Zwergeenkopfnuss' wurde deaktiviert.");
        } else {
            System.out.println("Die Spezialfähigkeit 'Zwergeenkopfnuss' kann nur aktiviert werden, wenn der Zwerg weniger als 50 Lebenspunkte hat.");
        }
    }

    private double getSuccessChance() {
        int lebenspunkte = getLebenspunkte();
        if (lebenspunkte <= 10) {
            return 0.7;
        } else if (lebenspunkte <= 20) {
            return 0.5;
        } else {
            return 0.3;
        }
    }
}