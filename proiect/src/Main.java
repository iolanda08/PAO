public class Main {
    public static void main(String[] args) {
        CatalogService catalogService = new CatalogService();

        catalogService.afiseazaProfesori();
        catalogService.afiseazaElevi();
        catalogService.afisareProfesoriDupaMaterie("Matematica");
        catalogService.cautaElevDupaNume("Popescu");
        catalogService.modificaClasaElev("123457", "11B");
        catalogService.stergeProfesor("123456");
        catalogService.numaraElevi();
        catalogService.verificaExistentaElev("123459");
        catalogService.calculeazaMedieGeneralaElev("123458");
        catalogService.ordonareEleviDupaNume();
    }
}
