package shejimoshi.fangwenzhemoshi.jiangli;

public class HonorableMention extends Award {
    @Override
    public void visit(Teacher teacher) {
        int teachScore=teacher.getTeachScore();
        if (teachScore > 90) {
            System.out.println(teacher.getName()+"获得优秀奖");
        }
    }

    @Override
    public void visit(Student student) {
        int AverageScore=student.getAverageScore();
        if (AverageScore > 90) {
            System.out.println(student.getName()+"获得优秀奖");
        }
    }
}
