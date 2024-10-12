import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Bob");
        NPC npc = new NPC("Joe");

        Scanner sc = new Scanner(System.in);
        npc.greet();

        while (true) {
            MoveType playerMove = player.getMoveType(sc);
            MoveType npcMove = npc.generateRandomMove();
            System.out.println("NPC move: " + npcMove);

            RoundResult result = calculateResult(playerMove, npcMove);
            System.out.println(result);
        }
    }

    private static RoundResult calculateResult(MoveType playerMove, MoveType npcMove) {
        if (playerMove == npcMove) {
            return RoundResult.Tie;
        } else if (
                playerMove == MoveType.Scissors && npcMove == MoveType.Paper ||
                        playerMove == MoveType.Paper && npcMove == MoveType.Rock ||
                        playerMove == MoveType.Rock && npcMove == MoveType.Scissors
        ) {
            return RoundResult.PlayerWins;
        } else {
            return RoundResult.NPCWins;
        }
    }
}