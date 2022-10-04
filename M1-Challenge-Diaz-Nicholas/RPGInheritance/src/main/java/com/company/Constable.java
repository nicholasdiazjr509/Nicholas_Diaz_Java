package com.company;
/** strength (initial value = 60)
 health (initial value = 100)
 stamina (initial value = 60)
 speed (initial value = 20)
 attackPower (initial value = 5)
 running (initial value = false)
 arrested (initial value = false)
 jurisdiction
 Abilities:  arrest another character, attack another character
 REFERENCE: https://stackoverflow.com/questions/45002521/using-a-players-stats-in-multiple-different-classes*/
public class Constable extends Character{

    private String jurisdiction;

    public Constable(String name, String jurisdiction){
     this.name = name;
     this.jurisdiction = jurisdiction;
     setStamina(60);
     setSpeed(20);
     setAttackPower(5);
     setStrength(60);
 }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
    private void arrestCharacter(Character enemy){
        enemy.setArrested(true);
        System.out.println(name + " arrested " + enemy.getName());
    }
}
