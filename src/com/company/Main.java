package com.company;

public class Main {
    private Object Medic;
    private Object Magic;
    private Object Warior;
    int [] heroes={(int) Warior, (int) Medic, (int) Magic};




    public static void main(String[] args) {

        HavingSuperAbility[] heros = {new Magic() {
            @Override
            public void applySuperAbility() {

            }
        }, new Medic() {
            @Override
            public void applySuperAbility(String superAbility) {

            }
        }, new Warior() {
            @Override
            public void applySuperAbility(String superAbility) {

            }
        }};
        for (int i = 0; i < heros.length; i++) {
                heros[i].applySuperAbility();
        }

    }

    //private static void herosall(HavingSuperAbility hero) {

    }

