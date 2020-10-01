public class Arena {

    private String name, map;
    private int max_players, id;

    public Arena(String name, String map, int max_players, int id) {
        this.name = name;
        this.map = map;
        this.max_players = max_players;
        this.id = id;
    }


    public String getJmeno_hry() {
        return name;
    }

    public String getMap() {
        return map;
    }

    public int getMax_players() {
        return max_players;
    }

    public int getId() {
        return id;
    }

}
