package codelabtitik4;

public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant();

        ArmoredZombie armoredZombie = new ArmoredZombie(100, 100);
        WalkedZombie walkedZombie = new WalkedZombie(100);

        System.out.println("====== Zombie sebelum diserang ======");
        System.out.println(armoredZombie.getZombieInfo());
        System.out.println(walkedZombie.getZombieInfo());

        System.out.println("====== Plant menyerang ArmoredZombie ======");
        while (armoredZombie.health > 0) {
            plant.attack(armoredZombie);
            System.out.println("====== Zombie Info ======");
            System.out.println(armoredZombie.getZombieInfo());
                if (armoredZombie.health <= 0) {
                    System.out.println("====== Zombie Mati ======");
                    break;
                }

            }
        while (walkedZombie.health > 0) {
            plant.attack(walkedZombie);
            System.out.println("====== Zombie Info ======");
            System.out.println(walkedZombie.getZombieInfo());
            if (walkedZombie.health <= 0) {
                System.out.println("====== Zombie Walked Mati ======");
                break;
            }
        }
        }
    }