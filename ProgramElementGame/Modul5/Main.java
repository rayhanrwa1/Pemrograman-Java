package Modul5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("       Welcome to Hero game       ");
        System.out.println("=======================================");


        System.out.println("===== Player 1 ====");
        System.out.println("Assassin");
        System.out.print("level: ");
        int level = input.nextInt();
        Assassin assassin = new Assassin(level, "Gun", "fire");
        System.out.println("Attack: " + assassin.attackDamage);
        System.out.println("Defense: " + assassin.defense);
        System.out.println("health: " + assassin.healthPoint);
        System.out.println("Life status: " + assassin.lifeStatus);
        assassin.useWeapon();
        assassin.useElement();

        System.out.println("\n====== player 2 =====");
        System.out.println("Tank");
        System.out.print("level: ");
        int tingkat = input.nextInt();
        Tank tank = new Tank(tingkat, 3) {
            @Override
            protected void spawnIntro() {

            }
        };
        System.out.println("Attack: " + tank.attackDamage);
        System.out.println("Defanse: " + tank.defense);
        System.out.println("Health: " + tank.healthPoint);
        System.out.println("life status: " + tank.lifeStatus);

        System.out.println("\n======FIGHT BEGIN======\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("======Round " + i + "======");
            // Player 1 turn
            System.out.println("======Player 1 Turn======");
            assassin.spawnIntro();
            assassin.attack(tank);
            System.out.println("Player 2 HP: " + tank.healthPoint);
            System.out.println("Player 2 Armor: " + tank.armorStrength);

            if (!tank.lifeStatus) {
                System.out.println("\nPlayer 1 WIN");
                break;
            }
            //player 2 turn
            System.out.println("\n=======Player 2 Turn======");
            tank.spawnintro();
            tank.attack(tank);
            System.out.println("Player 1 HP: " + assassin.healthPoint);

            if (!assassin.lifeStatus) {
                System.out.println("\nPlayer 2 WIN");
                break;

            }

        }

    }
}
