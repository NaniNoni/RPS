import java.util.Scanner;

public class Player {
    public Player(String name) {
        this.name = name;
    }

    private String name;

    public MoveType getMoveType(Scanner sc) {
        System.out.print("Enter move type (R/P/S): ");
        String moveTypeInput = sc.nextLine().trim().toUpperCase();

        return switch (moveTypeInput) {
            case "R" -> MoveType.Rock;
            case "P" -> MoveType.Paper;
            case "S" -> MoveType.Scissors;
            default -> getMoveType(sc);
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
