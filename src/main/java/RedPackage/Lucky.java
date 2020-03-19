package RedPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Lucky implements  OpenMode {

    public ArrayList<Integer> getRedPacket(int totalMoney, int count) {
        if (count > totalMoney) {
            System.out.println("不好意思,我if分不了呀");
            return new ArrayList<>();
        }
        // 创建保存各个红包金额的集合
        ArrayList<Integer> list = new ArrayList<>();

        // 定义循环次数,总个数-1次
        int time = count - 1;


        //创建一个集合存储 随机获取的节点数
        ArrayList<Integer> nums = new ArrayList<>();

        // 创建随机数对象. 随机获取 time 个 (0,money) 之间的随机数: 不包含0 和money
        Random rd = new Random();

        //开始随机获取节点
        while (true) {
            //获取[1,money-1] 的随机数
            int n = rd.nextInt(totalMoney - 1) + 1;
            if (nums.contains(n)) {
                //如果nums中含有这个数,继续随机生成
                continue;
            } else {
                //如果不包含,随机数有效
                nums.add(n);
            }
            if (nums.size() == time) {
                //节点个数好了,退出循环
                break;
            }
        }

        //nums 集合排序, 借助工具类 Collections.sort()
        Collections.sort(nums);

        System.out.println("随机生成的节点数:" + nums);
        // 根据之前分析的原理 循环分配
        for (int i = 0; i < time; i++) {
            //获取当前红包大小
            int m;
            if (i == 0) {
                //第一个红包大小
                m = nums.get(i) - 0;
            } else {
                //其他红包大小
                m = nums.get(i) - nums.get(i - 1);
            }
            //将红包放进集合中
            list.add(m);
        }
        //最后一个红包: 总额减去最大节点数
        list.add(totalMoney - nums.get(nums.size() - 1));
        return list;
    }


}