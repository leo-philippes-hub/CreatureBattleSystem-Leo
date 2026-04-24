public class Dragon extends Creature {

    public Dragon(String name, float health) {
        super(name, health);
    }


    @Override
    public float attack() {




        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // 20% chance of critical hit
        float power;
        if (Rand.randomInt(0, 10) < 2) {
            power = Rand.randomFloat(20, 25);
            action = name + " got a critical hit with power " + power + "!";
            return power;

        }


        // otherwise, do damage between 15-20
        power = Rand.randomFloat(15, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }


    @Override
    public void defend(float incomingPower) {


        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }


        gethealth() -= incomingPower;
    }
}
