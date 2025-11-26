package LatihanCleanCode;

import java.util.List;
import java.util.ArrayList;

public class MinesweeperGame {

    private List<int[]> theList = new ArrayList<>();

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

}