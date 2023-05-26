package repository;

import Entity.ProfesorEntity;
import Mapper.ProfesorEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class ProfesorRepository {

    public static List<ProfesorEntity> findAll() {
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("SELECT * FROM profesor", new ProfesorEntityMapper());
        List<ProfesorEntity> result = new ArrayList<>();

        for (Object object : objects) {
            if (object instanceof ProfesorEntity) {
                result.add((ProfesorEntity) object);
            } else {
                throw new RuntimeException("Expected ProfesorEntity instance");
            }
        }

        return result;
    }

    public static void addProfesor(ProfesorEntity profesorEntity) {
        String sql = "INSERT INTO profesor(cnp, nume, prenume, dataNasterii, materie, grad, catalog_id) " +
                "VALUES('" + profesorEntity.getCnp() + "', '" + profesorEntity.getNume() + "', '" +
                profesorEntity.getPrenume() + "', '" + profesorEntity.getDataNasterii() + "', '" +
                profesorEntity.getMaterie() + "', '" + profesorEntity.getGrad() + "', " +
                profesorEntity.getCatalogId() + ")";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }
    public static void updateProfesor(ProfesorEntity profesorEntity) {
        String sql = "UPDATE profesor SET cnp = '" + profesorEntity.getCnp() + "', nume = '" +
                profesorEntity.getNume() + "', prenume = '" + profesorEntity.getPrenume() +
                "', dataNasterii = '" + profesorEntity.getDataNasterii() + "', materie = '" +
                profesorEntity.getMaterie() + "', grad = '" + profesorEntity.getGrad() +
                "', catalog_id = " + profesorEntity.getCatalogId() + " WHERE cnp = " + profesorEntity.getCnp();
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void deleteProfesor(int cnp) {
        String sql = "DELETE FROM profesor WHERE cnp = " + cnp;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

}
