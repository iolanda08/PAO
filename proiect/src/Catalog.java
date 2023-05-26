import java.util.*;


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

    public List<Profesor> getProfesoriDupaMaterie(String materie) {
        List<Profesor> profesoriDupaMaterie = new ArrayList<>();
        for (Profesor profesor : profesori) {
            if (profesor.getMaterie().equalsIgnoreCase(materie)) {
                profesoriDupaMaterie.add(profesor);
            }
        }
        return profesoriDupaMaterie;
    }

    public List<Elev> cautaElevDupaNume(String nume) {
        List<Elev> eleviDupaNume = new ArrayList<>();
        for (Elev elev : elevi.values()) {
            if (elev.getNume().equalsIgnoreCase(nume)) {
                eleviDupaNume.add(elev);
            }
        }
        return eleviDupaNume;
    }

    public boolean modificaClasaElev(String cnp, String clasaNoua) {
        if (elevi.containsKey(cnp)) {
            Elev elev = elevi.get(cnp);
            elev.setClasa(clasaNoua);
            return true;
        }
        return false;
    }

    public boolean stergeProfesor(String cnp) {
        for (int i = 0; i < profesori.size(); i++) {
            Profesor profesor = profesori.get(i);
            if (profesor.getCnp().equals(cnp)) {
                profesori.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getNumarElevi() {
        return elevi.size();
    }

    public boolean verificaExistentaElev(String cnp) {
        return elevi.containsKey(cnp);
    }

    public double calculeazaMedieGeneralaElev(String cnp) {
        if (elevi.containsKey(cnp)) {
            Elev elev = elevi.get(cnp);
            // Calculeaza media generala a elevului si returneaza rezultatul
            return 0.0; // Implementeaza logica pentru calculul mediei generale
        }
        return -1;
    }

    public List<Elev> getEleviOrdonatiDupaNume() {
        List<Elev> eleviOrdonati = new ArrayList<>(elevi.values());
        eleviOrdonati.sort(null); // Use sort() without a separate comparator
        return eleviOrdonati;
    }


}
