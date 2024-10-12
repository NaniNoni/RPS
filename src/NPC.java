import java.util.random.RandomGenerator;

public class NPC {
    private String name;

    public NPC(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, I'm " + name + "! and you don't stand a chance...");
    }

    public MoveType generateRandomMove() {
        int index = RandomGenerator.getDefault().nextInt(MoveType.class.getEnumConstants().length);
        return MoveType.class.getEnumConstants()[index];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
