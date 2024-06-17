package Leetcode_Java.String;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    //This question highly asked by JPMorgan

    /*The game rule is :
        **Both player can remove their color IF BOTH ITS NEIGHBORS**

        What we need to check is :
        Checking is index i and its neighbor(index i - 1 and index + 1) are same char
            if yes , one of the player get one point
            if no , check the index i + 1 and its neighbor are same char

        What about both player get the same point? Look at the problem:
        "If a player cannot make a move on their turn, that player loses and the other player wins."
        AND ALICE MOVE **FIRST**
        It means Alice can't make a move on their turn , Bob wins

        */

    public boolean winnerOfGame(String colors) {
        int alice = 0 , bob = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    alice++;
                } else {
                    bob++;
                }
            }
        }
        return alice > bob;
    }
}
