public class Elev extends Persoana {
    private String clasa;
    private String specializare;

    public Elev(String cnp, String nume, String prenume, String dataNasterii, String clasa, String specializare) {
        super(cnp, nume, prenume, dataNasterii);
        this.clasa = clasa;
        this.specializare = specializare;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    @Override
    public String getTip() {
        return "elev";
    }

    @Override
    public String toString() {
        return super.toString() + ", clasa: " + clasa + ", specializare: " + specializare;
    }
}
