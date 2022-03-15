import java.util.List;

public class Road {
    Croisement Cross1;
    Croisement Cross2;
    float speed_limit;
    List<Vehicule> L_Veh;

    public Croisement getCross2() {
        return Cross2;
    }

    public Croisement getCross1() {
        return Cross1;
    }

    public float getSpeed_limit() {
        return speed_limit;
    }

    public List<Vehicule> getVehicules(){
        return L_Veh;
    }
}
