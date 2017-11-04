package Intefaces;


public class Main {
    public static void main(String[] args) {
       Machine battleShip = new BattleSpaceship(10.2,11.2,30,1500);
       battleShip.type();
       battleShip.engineType();
       Machine falcon = new FalconSpaceShip(9.3,10.5,40,1600);
        falcon.engineType();
        falcon.primaryWeaponAttack();
    }
}
