package structuralPatterns.flyweight;

import java.util.Random;

public class App {

    private static final String[] PLAYER =
            {"Terrorist", "Counter-Terrorist"};

    private static final String[] WEAPON =
            {"K&M Sub-Machine Gun", "Clarion 5.56", "IDF Defender", "CV-47", "Maverick M4A1 Carbine", "Magnum Sniper Rifle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayersFactory.getPlayer(getRandomPlayer());
            player.setWeapon(getRandomWeapon());
            player.showInformation();
        }

        for (int i = 5; i >= 0; i--) {
            if(i == 0) System.out.println("Go! Go! Go!");
            else System.out.printf("Round restart after %d sec... %n", i);
        }
    }

    private static String getRandomPlayer() {
        Random random = new Random();
        int randomPlayer = random.nextInt(PLAYER.length);
        return PLAYER[randomPlayer];
    }

    private static String getRandomWeapon() {
        Random random = new Random();
        int randomWeapon = random.nextInt(WEAPON.length);
        return WEAPON[randomWeapon];
    }
}
