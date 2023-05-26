public abstract class Persoana {
    private int id;
    private String cnp;

    private String nume;
    private String prenume;
    private String dataNasterii;

    public Persoana( String cnp, String nume, String prenume, String dataNasterii) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;

    }
    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public abstract String getTip();

    @Override
    public String toString() {
        return  nume + " " + prenume + " " + dataNasterii;
    }
}
