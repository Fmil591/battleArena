public class Charakter {
    String name;
    int lebenspunkte;
    boolean spezialfähigkeitAktiv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public boolean isSpezialfähigkeitAktiv() {
        return spezialfähigkeitAktiv;
    }

    public void setSpezialfähigkeitAktiv(boolean spezialfähigkeitAktiv) {
        this.spezialfähigkeitAktiv = spezialfähigkeitAktiv;
    }

    public Charakter(String name, boolean spezialfähigkeitAktiv, int lebenspunkte) {
        this.name = name;
        this.spezialfähigkeitAktiv = spezialfähigkeitAktiv;
        this.lebenspunkte = lebenspunkte;
    }

    public void schadenNehmen(int punkte){
        this.lebenspunkte = lebenspunkte-punkte;
    }
    public void angreifen(Charakter gegner){

    }

}
