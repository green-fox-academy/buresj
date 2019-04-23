package aircraft;

public class Aircraft {

    String type;
    int ammo;
    int maxAmmo;
    int dealtDamage;
    int baseDamage;
    boolean priority = false;

    public Aircraft(){}

    public Aircraft(String type){
        this.type = type;
        ammo = 0;
        if (type.equals("F16")){
            priority = true;
            maxAmmo = 8;
            baseDamage = 30;
        } else {
            priority = false;
            maxAmmo = 12;
            baseDamage = 50;
        }
    }

    public int fight() {
        dealtDamage = ammo * baseDamage;
        ammo = 0;
        return dealtDamage;
    }

    public int refill(int fill) {

        int toFill = maxAmmo - ammo;
        int remain = fill - toFill;
        ammo += fill;

        if(ammo > maxAmmo) {
            ammo = maxAmmo;
        }

        if(remain < 0) {
            remain = 0;
        }

        return remain;
    }

    public String getType(){
        return type;
    }

    public int getToFill() {
        int toFill = maxAmmo - ammo;
        return toFill;
    }

    public int getDealtDamage () {
        int num = ammo * baseDamage;
        return num;
    }

    public boolean isPriority(){
        return priority;
    }

    public void getStatus() {
        System.out.println("Type: " + type + " , Ammo: " + ammo + " Base damage: " + baseDamage + " All damage: " + dealtDamage);
    }
}
