package Intefaces;

public class BattleSpaceship extends Machine{
   private double primaryWeaponPower;
   private double secondaryWeaponPower;
   private double shieldStrenght;
   private double energyCapacity;

   public BattleSpaceship(double primaryWeaponPower,double secondaryWeaponPower,double shieldStrenght,double energyCapacity){
       this.primaryWeaponPower = primaryWeaponPower;
       this.secondaryWeaponPower = secondaryWeaponPower;
       this.shieldStrenght = shieldStrenght;
       this.energyCapacity = energyCapacity;
   }

    public double getPrimaryWeaponPower() {
        return this.primaryWeaponPower;
    }

    public double getSecondaryWeaponPower() {
        return this.secondaryWeaponPower;
    }

    public double getShieldStrenght() {
        return this.shieldStrenght;
    }
    public double getEnergyCapacity(){
       return this.energyCapacity;
    }
    @Override
    public void type() {
        System.out.println("Batlleship");
    }

    @Override
    public void engineType() {
        System.out.println("Protton engine");
    }

    @Override
    public double primaryWeaponAttack() {
        double primaryAttack = this.getPrimaryWeaponPower();
        System.out.println(primaryAttack);
        return primaryAttack;
    }

    @Override
    public double secondaryWeaponAttack() {
        double secondaryAttack = this.getSecondaryWeaponPower();
        System.out.println(secondaryAttack);
        return secondaryAttack;
    }
}
