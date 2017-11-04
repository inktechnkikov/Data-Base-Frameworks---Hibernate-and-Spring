package Intefaces;

public class FalconSpaceShip extends BattleSpaceship{
    public FalconSpaceShip(double primaryWeaponPower, double secondaryWeaponPower, double shieldStrenght, double energyCapacity) {
        super(primaryWeaponPower, secondaryWeaponPower, shieldStrenght, energyCapacity);
    }


    @Override
    public void type() {
        System.out.println("Battle Ship");
    }

    @Override
    public void engineType() {
        System.out.println("Impulse drive");
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
