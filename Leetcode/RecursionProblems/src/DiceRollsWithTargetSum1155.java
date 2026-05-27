import java.util.ArrayList;

public class DiceRollsWithTargetSum1155 {
    public static void main(String[] args) {
        Dice("", 4);
        DiceCustom("", 5, 8);
        System.out.println(DiceRet("", 4));
        System.out.println(DiceCustomRet("", 5, 8));
    }

    static void Dice(String P, int target) {
        if (target == 0) {
            System.out.println(P);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            Dice(P + i, target - i);
        }
    }

    //Custom dice can have more than 6 faces also
    static void DiceCustom(String P, int target, int face) {
        if (target == 0) {
            System.out.println(P);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            DiceCustom(P + i, target - i, face);
        }
    }

    static ArrayList<String> DiceRet(String P, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(DiceRet(P + i, target - i));
        }
        return list;
    }

    static ArrayList<String> DiceCustomRet(String P, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(DiceCustomRet(P + i, target - i, face));
        }
        return list;
    }
}