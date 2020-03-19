package RedPackage;

import java.util.ArrayList;

public class Common implements OpenMode {


    @Override
    public ArrayList<Integer> getRedPacket(int totalMoney, int count) {
        // 创建保存各个红包金额的集合
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<count ; i++){
            list.add(totalMoney);
        }
        return list;
    }
}
