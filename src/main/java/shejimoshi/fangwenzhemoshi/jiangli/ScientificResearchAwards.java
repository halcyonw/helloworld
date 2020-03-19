package shejimoshi.fangwenzhemoshi.jiangli;

public class ScientificResearchAwards extends Award {
    @Override
    public void visit(Teacher teacher) {
        int paperNumber=teacher.getPaperNumber();
        if (paperNumber > 10) {
            System.out.println(teacher.getName()+"获得科研奖");
        }
    }

    @Override
    public void visit(Student student) {
        int paperNumber=student.getPaperNumber();
        if (paperNumber > 2) {
            System.out.println(student.getName()+"获得科研奖");
        }
    }
}
