package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer("Sally");
    }
    @Test
    public void checkGetters(){
        assertEquals("Sally", farmer.getName());
        assertEquals(75, farmer.getStrength());
        assertFalse(farmer.isHarvesting());
           /**Can I assertFalse or true? If it does work.*/
        assertFalse(farmer.isPlowing());
        assertFalse(farmer.isRunning());
        assertFalse(farmer.isArrested());
        assertEquals(100, farmer.getHealth());
        assertEquals(10, farmer.getSpeed());
        assertEquals(10, farmer.getAttackPower());
        assertEquals(75, farmer.getStamina());
    }
    @Test
    public void attackACharacter(){
        Constable constable = new Constable("Dano", "Southside");
        farmer.attackCharacter(constable);
        assertEquals(99, constable.getHealth());
    }
}