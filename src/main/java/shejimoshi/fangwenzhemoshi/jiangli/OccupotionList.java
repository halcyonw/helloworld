package shejimoshi.fangwenzhemoshi.jiangli;

import java.util.ArrayList;

public class OccupotionList {
    private ArrayList<Occupotion> list = new ArrayList<>();

    public void addOccupotion(Occupotion occupotion) {
        list.add(occupotion);
    }

    public void removeOccupation(Occupotion occupotion) {
        list.remove(occupotion);
    }

    public void accept2(Award handle) {
        for (Occupotion o:list
             ) {
            o.accept(handle);
        }
    }
}
