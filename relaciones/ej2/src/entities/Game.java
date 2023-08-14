package entities;

import java.util.ArrayList;

public class Game {
    private final int MAX_PLAYERS = 6;
    ArrayList<Player> players;
    WaterGun wg;

    public Game() {
    }

    public int getMAX_PLAYERS() {
        return MAX_PLAYERS;
    }

    public void loadGame(ArrayList<Player> players, WaterGun wg) {
        this.players = players;
        this.wg = wg;
    }

    public Player round() {
        if (players.size() > MAX_PLAYERS) {
            System.out.println("Too many players");
            return null;
        }

        for (Player player : players) {
            if (player.shoot(wg)) {
                return player;
            }
        }

        return null;
    }

    public void start() {
        ArrayList<Player> players = new ArrayList<Player>();
        WaterGun wg = new WaterGun();

        for (int i = 0; i < this.MAX_PLAYERS; i++) {
            players.add(new Player(i + 1));
        }

        wg.load();

        this.loadGame(players, wg);
        System.out.println(this.round());
    }
}
