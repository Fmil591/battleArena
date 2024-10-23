import java.util.concurrent.ThreadLocalRandom;



public class Zwerg extends Charakter{
    public Zwerg(String name, boolean spezialfähigkeitAktiv, int lebenspunkte) {
        super(name, spezialfähigkeitAktiv, lebenspunkte);
    }

    private int damage;

    public void angreifen(Charakter gegner){
        if(isSpezialfähigkeitAktiv()){
            damage = ThreadLocalRandom.current().nextInt(15, 26)-ThreadLocalRandom.current().nextInt(5,10);
            gegner.setLebenspunkte(lebenspunkte-damage);
        } else{
            int damage = ThreadLocalRandom.current().nextInt(20, 26);
            gegner.setLebenspunkte(lebenspunkte-damage);}
    }

    public void spezialFähigkeit(){
        if(!isSpezialfähigkeitAktiv()){
            if(lebenspunkte<50){
            spezialfähigkeitAktiv = true;

            if(lebenspunkte<50&&lebenspunkte>20)
            {
                if(ThreadLocalRandom.current().nextInt(1,11)<=3){
                    damage=2*damage;

                }else damage = damage/2;
            }

                if(lebenspunkte<20&&lebenspunkte>10)
                {
                    if(ThreadLocalRandom.current().nextInt(1,6)==1){
                        damage=2*damage;

                    }else damage = damage/2;
                }




            }
        } else if (isSpezialfähigkeitAktiv()) {
            spezialfähigkeitAktiv = false;
            lebenspunkte=lebenspunkte-10;
        }
    }

}
