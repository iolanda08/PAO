package repository;

import Entity.ElevEntity;
import Mapper.ElevEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class ElevRepository {

    public static List<ElevEntity> findAll() {
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("SELECT * FROM elev", new ElevEntityMapper());
        List<ElevEntity> result = new ArrayList<>();

        for (Object object : objects) {
            if (object instanceof ElevEntity) {
                result.add((ElevEntity) object);
            } else {
                throw new RuntimeException("Expected ElevEntity instance");
            }
        }

        return result;
    }

    public static void addElev(ElevEntity elevEntity) {
        String sql = "INSERT INTO elev (name, cnp, nume, prenume, dataNasterii, clasa, specializare, catalogId) " +
                "VALUES ('" + elevEntity.getName() + "', '" + elevEntity.getCnp() + "', '" +
                elevEntity.getNume() + "', '" + elevEntity.getPrenume() + "', '" +
                elevEntity.getDataNasterii() + "', '" + elevEntity.getClasa() + "', '" +
                elevEntity.getSpecializare() + "', " + elevEntity.getCatalogId() + ")";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void updateElev(ElevEntity elevEntity) {
        String sql = "UPDATE elev SET name = '" + elevEntity.getName() + "', cnp = '" + elevEntity.getCnp() + "', " +
                "nume = '" + elevEntity.getNume() + "', prenume = '" + elevEntity.getPrenume() + "', " +
                "dataNasterii = '" + elevEntity.getDataNasterii() + "', clasa = '" + elevEntity.getClasa() + "', " +
                "specializare = '" + elevEntity.getSpecializare() + "', catalogId = " + elevEntity.getCatalogId() + " " +
                "WHERE cnp = " + elevEntity.getCnp();
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void deleteElev(int cnp) {
        String sql = "DELETE FROM elev WHERE cnp = " + cnp;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }
}
