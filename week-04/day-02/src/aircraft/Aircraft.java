package aircraft;

public class Aircraft {

    String type;
    int ammo;
    int maxAmmo;
    int dealtDamage;
    int baseDamage;
    boolean priority;
    boolean filled;


    public Aircraft(String type){
        this.type = type;
    }

    public int fight() {
        dealtDamage = ammo * baseDamage;
        ammo = 0;
        return dealtDamage;
    }
//
//    public int refill(int fill) {
//
//        if (filled) {
//            return fill;
//        }
//
//        if (ammo + fill > maxAmmo) {
//
//        }
//
//    }

    public String getType(){
        return type;
    }

    public void getStatus() {
        System.out.println("Type: " + type + " , Ammo: " + ammo + " Base damage: " + baseDamage + " All damage: " + dealtDamage);
    }


}