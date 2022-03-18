package com.company;

public abstract class Hero implements HavingSuperAbility {
     int health;
    int hit;
    int superAbility;

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(int superAbility) {
        this.superAbility = superAbility;
    }

    public abstract void applySuperAbility();

    public abstract void applySuperAbility(String superAbility);
}
