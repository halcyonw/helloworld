package game;

public class Test {
    public static void main(String[] args) {
        Weapon wp = new Weapon("屠龙刀", 999);
        Armout ar = new Armout("麒麟甲", 1);
        Role r = new Role();
        r.setWp(wp);
        r.setAr(ar);
        r.attack();
        r.wear();
        r.setFashuSkill(new FashuSkill() {
            @Override
            public void fashuSkill() {
                System.out.println("纵横天下");
            }
        });
        r.fashuSkillAttack();

    }
}
