package jp.ac.uryukyu.ie.e235753;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    public static void main(String[] args) {
        testAttackWithWeaponSkill();
    }

    public static void testAttackWithWeaponSkill() {
        
        Warrior warrior = new Warrior("五条悟れない", 100, 20);
       
        LivingThing opponent = new LivingThing("両面少ない", 100, 10);

        warrior.attackWithWeponSkill(opponent);
        warrior.attackWithWeponSkill(opponent);
        warrior.attackWithWeponSkill(opponent);

        int expectedHP = 100 - (int) (20 * 1.5 * 3); 
        if (opponent.getHitPoint() == expectedHP) {
            System.out.println("Test passed: Damage calculation is correct.");
        } else {
            System.out.println("Test failed: Damage calculation is incorrect.");
        }
    }
}


