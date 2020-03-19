package shejimoshi.beiwanlumoshi.RPGwangyou;

public class jindu {
    private String name;
    private int pass;
    public jindu() {
    }

    public jindu(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    //保存进度
    public JinduMemento save() {
        return new jindu.JinduMemento(this.name,this.pass);
    }

    //恢复进度
    public void restore(JinduMemento jinduMemento) {
        this.name=jinduMemento.name;
        this.pass=jinduMemento.pass;
    }

    static class JinduMemento {
        private String name;
        private int pass;

        public JinduMemento() {
        }

        public JinduMemento(String name, int pass) {
            this.name = name;
            this.pass = pass;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPass() {
            return pass;
        }

        public void setPass(int pass) {
            this.pass = pass;
        }
    }
}
