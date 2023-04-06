import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Catalog {
    private List<Profesor> profesori;
    private Map<String, Elev> elevi;

    public Catalog() {
        profesori = new ArrayList<>();
        elevi = new HashMap<>();
    }

    public void adaugaProfesor(Profesor profesor) {
        profesori.add(profesor);
    }

    public void adaugaElev(Elev elev) {
        elevi.put(elev.getCnp(), elev);
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }

    public Set<Elev> getElevi() {
        return new TreeSet<>(elevi.values());
    }

    public void afiseazaStudentiInscrisi() {
        System.out.println("Elevii inscrisi sunt:");
        for (Elev elev : elevi.values()) {
            System.out.println(elev);
        }
    }

    public void afiseazaProfesori() {
        System.out.println("Profesorii sunt:");
        for (Profesor profesor : profesori) {
            System.out.println(profesor);
        }
    }
}
