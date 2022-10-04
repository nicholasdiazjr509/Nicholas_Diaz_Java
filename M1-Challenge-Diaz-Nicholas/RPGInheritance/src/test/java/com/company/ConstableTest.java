package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
        Constable constable;

    @Before
    public void setUp() {
        constable = new Constable("Francis", "Northside");
    }
    @Test
    public void constableTest(){

        assertEquals("Francis", constable.getName());
        assertEquals(60, constable.getStrength());
        assertEquals(100, constable.getHealth());
        assertEquals(60, constable.getSpeed());
        assertEquals(5, constable.getAttackPower());
        assertEquals(60, constable.getStamina());
        assertFalse(constable.isRunning());
        assertFalse(constable.isArrested());
    }
    @Test
    public void arrestACharacter(){
        Farmer farmer = new Farmer("Sally");
    }
    @Test
    public void attackACharacter(){
        Warrior warrior = new Warrior("Nicholas the Great");
        constable.attackCharacter(warrior);
        assertEquals(95, warrior.getHealth());
    }

}