public class Triceratops extends Creature {
    
    
    public Triceratops(String name, float health) {
        super(name, health);
    }

    @Override
    public float attack() {


        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            setAction(getName() + " missed!");
            return 0;
        }


        // otherwise, do damage between 10-15
        float power = Rand.randomFloat(10, 15);
        setAction(getName() + " attacked with power " + power + "!");
        return power;
    }


    @Override
    public void defend(float incomingPower) {


        // 30 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 3) {
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
