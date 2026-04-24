public class Main {
    public static void main(String[] args) {


        // set up the creatures
        Creature a = new Creature();
        Creature b = new Creature();
        Creature c = new Dragon();
        Creature d = new Mosasaurus();
        Creature e = new Triceratops();


        a.name = "A";
        a.health = 100;
        b.name = "B";
        b.health = 100;
        c.name = "C";
        c.health = 80;
        d.name = "D";
        d.health = 120;
        e.name = "E";
        e.health = 150;




        // set up the battle
        BattleSystem battleSystem = new BattleSystem();


        // run the battle
        battleSystem.battle(c, d);
    }
}
