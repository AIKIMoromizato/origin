package jp.ac.uryukyu.ie.e235753;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        int damage = (int) (getAttack() * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }

    @Override
    public void wounded(int damage) {
        int hitPoint = getHitPoint();
        setHitPoint(hitPoint - damage);
        if (hitPoint < 0) {
            setDead(true);
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
