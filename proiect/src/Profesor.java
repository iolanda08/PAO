public class Profesor extends Persoana {
    private String materie;
    private String grad;

    public Profesor(String cnp, String nume, String prenume, String dataNasterii, String materie, String grad) {
        super(cnp, nume, prenume, dataNasterii);
        this.materie = materie;
        this.grad = grad;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    @Override
    public String getTip() {
        return "profesor";
    }

    @Override
    public String toString() {
        return super.toString() + ", materie: " + materie + ", grad: " + grad;
    }
}
