package Mapper;

import Entity.CatalogEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogEntityMapper implements RowMapper<CatalogEntity> {

    public CatalogEntity mapRow(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        // Add mapping for other attributes of CatalogEntity if available

        return new CatalogEntity(id, name);
    }
}
