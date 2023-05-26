package repository;

import Entity.CatalogEntity;
import Mapper.CatalogEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepository {

    public static List<CatalogEntity> findAll() {
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("SELECT * FROM catalog", new CatalogEntityMapper());
        List<CatalogEntity> result = new ArrayList<>();

        for (Object object : objects) {
            if (object instanceof CatalogEntity) {
                result.add((CatalogEntity) object);
            } else {
                throw new RuntimeException("Expected CatalogEntity instance");
            }
        }

        return result;
    }

    public static void deleteCatalog(int id) {
        String sql = "DELETE FROM catalog WHERE id = " + id;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

}
