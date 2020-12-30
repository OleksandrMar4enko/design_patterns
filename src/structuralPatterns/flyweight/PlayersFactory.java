package structuralPatterns.flyweight;

import java.util.HashMap;

public class PlayersFactory {

    private static final HashMap<String, Player> PLAYERS = new HashMap<>();

    public static Player getPlayer(String team) {
        Player player = null;

        if (PLAYERS.containsKey(team)) {
            player = PLAYERS.get(team);
        } else {
            switch (team) {
                case "Terrorist":
                    player = new Terrorist();
                    System.out.println("Terrorist team created!");
                    break;
                case "Counter-Terrorist":
                    player = new CounterTerrorist();
                    System.out.println("Counter-Terrorist team created!");
                    break;
                default:
                    System.out.println("Spectator detected");
            }
            PLAYERS.put(team, player);
        }
        return player;
    }

}
