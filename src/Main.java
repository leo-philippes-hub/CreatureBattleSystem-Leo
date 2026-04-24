public class Main {
    public static void main(String[] args) {


        // set up the creatures
        Creature a = new Creature("A", 100);
        Creature b = new Creature("B", 100);
        Creature c = new Dragon("C", 80);
        Creature d = new Mosasaurus("D", 120);
        Creature e = new Triceratops("e", 150);





        // set up the battle
        BattleSystem battleSystem = new BattleSystem();


        // run the battle
        battleSystem.battle(c, d);
    }
}
