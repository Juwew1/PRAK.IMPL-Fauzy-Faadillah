package LatihanCleanCode;

import java.util.List;
import java.util.ArrayList;

public class GameRefactored {

    private List<int[]> theList = new ArrayList<>();

    public final static int STATUS_VALUE = 0;
    public final static int FLAGGED = 4;

    public GameRefactored() {

        theList.add(new int[]{FLAGGED, 1, 1});
        theList.add(new int[]{1, 2, 2});
        theList.add(new int[]{FLAGGED, 3, 3});
    }

    public List<int[]> getFlaggedCells() {

        List<int[]> flaggedCells = new ArrayList<int[]>();

        for (int[] cell : theList)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

    public static void main(String[] args) {
        GameRefactored game = new GameRefactored();
        System.out.println("Jumlah sel yang ditandai: " + game.getFlaggedCells().size());
    }
}