package game;

public class Role {
    int id;
    int blood;
    String name;
    Weapon wp;
    Armout ar;
    FashuSkill fs;

    public void setFashuSkill(FashuSkill fs) {
        this.fs=fs;
    }

    public void fashuSkillAttack() {
        System.out.println("发功法术攻击");
        fs.fashuSkill();
        System.out.println("完成");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armout getAr() {
        return ar;
    }

    public void setAr(Armout ar) {
        this.ar = ar;
    }

    public void attack() {
        System.out.println("使用"+wp.getName()+"造成了"+wp.hurt+"伤害");
    }

    public void wear() {
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+"增加了"+ar.getProtect()+"保护");
    }
}

class Weapon {
    String name;
    int hurt;

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
class Armout{
    String name;
    int protect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Armout(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
