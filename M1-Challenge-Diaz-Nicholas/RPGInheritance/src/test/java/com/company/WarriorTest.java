package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior;
    @Before
    public void setUp() throws Exception {
        warrior = new Warrior("Nicholas the Great");
    }
    @Test
    public void testWarriorCharacteristics() {
        assertEquals("Nicholas the Great", warrior.getName());
        assertEquals(75, warrior.getStrength());
        assertEquals(100, warrior.getHealth());
        assertEquals(50, warrior.getSpeed());
        assertEquals(10, warrior.getAttackPower());
        assertEquals(100, warrior.getStamina());
        assertEquals(100, warrior.getShieldStrength());
    }

    @Test
    public void attackACharacter(){
        Warrior warriorEnemy = new Warrior("Bilbo the Meek");
        warrior.attackCharacter(warriorEnemy);
        assertEquals(90, warriorEnemy.getHealth());
    }
}