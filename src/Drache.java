import java.util.concurrent.ThreadLocalRandom;

public class Drache extends Charakter{

    public Drache(String name, boolean spezialfähigkeitAktiv, int lebenspunkte) {
        super(name, spezialfähigkeitAktiv, lebenspunkte);
    }

    public void angreifen(Charakter gegner){
        if(isSpezialfähigkeitAktiv()){
            int damage = ThreadLocalRandom.current().nextInt(20, 26)-ThreadLocalRandom.current().nextInt(5,10);
            gegner.setLebenspunkte(lebenspunkte-damage);
        } else{
        int damage = ThreadLocalRandom.current().nextInt(20, 26);
            gegner.setLebenspunkte(lebenspunkte-damage);}


    }

    public void spezialFähigkeit(){
        if(!isSpezialfähigkeitAktiv()){
            spezialfähigkeitAktiv = true;
            lebenspunkte=lebenspunkte+10;

        } else if (isSpezialfähigkeitAktiv()) {
            spezialfähigkeitAktiv = false;
            lebenspunkte=lebenspunkte-10;
        }
    }


}
