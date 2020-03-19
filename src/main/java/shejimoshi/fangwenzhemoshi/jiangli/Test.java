package shejimoshi.fangwenzhemoshi.jiangli;

public class Test {
    public static void main(String[] args) {
        OccupotionList occupotionList = new OccupotionList();
        Occupotion t1,t2,s1,s2;
        t1 = new Teacher("c1", 9, 92);
        t2 = new Teacher("c2", 12, 93);
        s1 = new Student("w1", 15, 5);
        s2 = new Student("w2", 97, 1);
        occupotionList.addOccupotion(t1);
        occupotionList.addOccupotion(t2);
        occupotionList.addOccupotion(s1);
        occupotionList.addOccupotion(s2);
        Award award = (Award) XMLUtil.getBean();
        occupotionList.accept2(award);
    }
}
