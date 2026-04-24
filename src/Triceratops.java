public class Triceratops extends Creature {


    @Override
    public float attack() {


        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }


        // otherwise, do damage between 10-15
        float power = Rand.randomFloat(10, 15);
        action = name + " attacked with power " + power + "!";
        return power;
    }


    @Override
    public void defend(float incomingPower) {


        // 30 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 3) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }


        health -= incomingPower;
    }
}
