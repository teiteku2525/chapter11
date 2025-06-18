import java.io.Serializable;

public class Fool extends Character implements Human {
    //Characterからフィールドと抽象メソッドattack()を抽象
    public Fool(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void talk() {
        System.out.println(this.name + "は意味のないことを話した");
    }
    public void watch() {
        System.out.println(this.name + "は虚空を見つめている");
    }
    public void hear() {
        System.out.println(this.name + "は誰かの声を聞いた気がした");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わず遊んでいる");
    }
    public void run() {
        System.out.println(this.name + "は大笑いしながら逃げ出した");
    }
}
