public class Dragon extends Creature {


    public Dragon(String name, float health) {
        super(name, health);
    }


    @Override
    public float attack() {




        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            setAction(getName() + " missed!");
            return 0;
        }

        // 20% chance of critical hit
        float power;
        if (Rand.randomInt(0, 10) < 2) {
            power = Rand.randomFloat(20, 25);
            setAction(getName() + " got a critical hit with power " + power + "!");
            return power;

        }


        // otherwise, do damage between 15-20
        power = Rand.randomFloat(15, 20);
        setAction(getName() + " attacked with power " + power + "!");
        return power;
    }


    @Override
    public void defend(float incomingPower) {


        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            setAction(getName() + " defended and reduced damage taken to " + incomingPower);
        }
        else
        {
            setAction(getName() + " did not defend.");
        }


        reduceHealth(incomingPower);
    }
}
