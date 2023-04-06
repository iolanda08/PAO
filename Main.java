public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Profesor profesor1 = new Profesor( "123455", "Popescu" , " Ion", "21 aprilie 1989", " Matematica", "liceu");
        Profesor profesor2 = new Profesor("123456","Ionescu" ," Ana", "1 aprilie 1988", " Chimie", "liceu");
        catalog.adaugaProfesor(profesor1);
        catalog.adaugaProfesor(profesor2);

        Elev elev1 = new Elev( "123457","Popescu" , " Maria", "11 iunie 2002" , "10A", "Informatica");
        Elev elev2 = new Elev( "123458" ,"Ionescu " , " Andrei", "12 mai 2001", "11A", "Informatica");
        catalog.adaugaElev(elev1);
        catalog.adaugaElev(elev2);

        System.out.println("Profesorii sunt:");
        for (Profesor profesor : catalog.getProfesori()) {
            System.out.println(profesor.getNume());
        }

        System.out.println("Elevii sunt:");
        for (Elev elev : catalog.getElevi()) {
            System.out.println(elev.getNume() + " - " + elev.getClasa());
        }
    }
}
