import java.util.List;
public class CatalogService {
    private Catalog catalog;

    public CatalogService() {
        catalog = new Catalog();
    }

    public void adaugaProfesor(Profesor profesor) {
        catalog.adaugaProfesor(profesor);
    }

    public void adaugaElev(Elev elev) {
        catalog.adaugaElev(elev);
    }

    public void afiseazaProfesori() {
        catalog.afiseazaProfesori();
    }

    public void afiseazaElevi() {
        catalog. afiseazaStudentiInscrisi();
    }

    public void afisareProfesoriDupaMaterie(String materie) {
        List<Profesor> profesori = catalog.getProfesoriDupaMaterie(materie);
        System.out.println("Profesorii cu materia " + materie + " sunt:");
        for (Profesor profesor : profesori) {
            System.out.println(profesor.getNume());
        }
    }

    public void cautaElevDupaNume(String nume) {
        List<Elev> elevi = catalog.cautaElevDupaNume(nume);
        System.out.println("Elevii cu numele " + nume + " sunt:");
        for (Elev elev : elevi) {
            System.out.println(elev.getNume() + " - " + elev.getClasa());
        }
    }

    public void modificaClasaElev(String cnp, String clasaNoua) {
        boolean modificareReusita = catalog.modificaClasaElev(cnp, clasaNoua);
        if (modificareReusita) {
            System.out.println("Clasa elevului cu CNP-ul " + cnp + " a fost modificata cu succes.");
        } else {
            System.out.println("Eroare: Elevul cu CNP-ul " + cnp + " nu exista in catalog.");
        }
    }

    public void stergeProfesor(String cnp) {
        boolean stergereReusita = catalog.stergeProfesor(cnp);
        if (stergereReusita) {
            System.out.println("Profesorul cu CNP-ul " + cnp + " a fost sters cu succes.");
        } else {
            System.out.println("Eroare: Profesorul cu CNP-ul " + cnp + " nu exista in catalog.");
        }
    }

    public void numaraElevi() {
        int numarElevi = catalog.getNumarElevi();
        System.out.println("Numarul total de elevi din catalog: " + numarElevi);
    }

    public void verificaExistentaElev(String cnp) {
        boolean existaElev = catalog.verificaExistentaElev(cnp);
        if (existaElev) {
            System.out.println("Elevul cu CNP-ul " + cnp + " exista in catalog.");
        } else {
            System.out.println("Elevul cu CNP-ul " + cnp + " nu exista in catalog.");
        }
    }

    public void calculeazaMedieGeneralaElev(String cnp) {
        double medieGenerala = catalog.calculeazaMedieGeneralaElev(cnp);
        if (medieGenerala != -1) {
            System.out.println("Medie generala a elevului cu CNP-ul " + cnp + ": " + medieGenerala);
        } else {
            System.out.println("Eroare: Elevul cu CNP-ul " + cnp + " nu exista in catalog.");
        }
    }

    public void ordonareEleviDupaNume() {
        List<Elev> elevi = catalog.getEleviOrdonatiDupaNume();
        System.out.println("Elevii ordonati dupa nume sunt:");
        for (Elev elev : elevi) {
            System.out.println(elev.getNume() + " - " + elev.getClasa());
        }
    }
}
