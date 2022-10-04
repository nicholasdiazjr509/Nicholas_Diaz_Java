package com.company;

public class Warrior extends Character {
    public Warrior(String name) {
        this.name = name;
        setStamina(100);
        setStrength(75);
        setSpeed(50);
        setAttackPower(10);
    }
    protected int shieldStrength = 100;
    public int getShieldStrength() {
        return shieldStrength;

    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
/** Properties:
name
strength (initial value = 75)
health (initial value = 100)
stamina (initial value = 100)
speed (initial value = 50)
attackPower (initial value = 10)
shieldStrength (initial value = 100)
running (initial value = false)
arrested (initial value = false)
 Abilities:
 attack another character
 */