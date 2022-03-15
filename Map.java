import java.util.List;

public class Map {
    List<Croisement> Intersections;
    List<Road> Lignes;
    Gestionnaire Brain;

    public List<Road> getLignes() {
        return Lignes;
    }

    public List<Croisement> getIntersections() {
        return Intersections;
    }

    public void add_Croisement(Croisement CROSS){
        this.Intersections.add(CROSS);
    }

    public void add_Road(Road ROAD){
        this.Lignes.add(ROAD);
    }

    public void nextstep(long now) {
        for
    }
}
