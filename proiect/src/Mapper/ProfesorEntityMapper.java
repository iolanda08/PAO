package Mapper;

import Entity.ProfesorEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfesorEntityMapper implements RowMapper<ProfesorEntity> {

    public ProfesorEntity mapRow(ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name");
        String cnp = resultSet.getString("cnp");
        String nume = resultSet.getString("nume");
        String prenume = resultSet.getString("prenume");
        String dataNasterii = resultSet.getString("dataNasterii");
        String materie = resultSet.getString("materie");
        String grad = resultSet.getString("grad");
        int catalogId = resultSet.getInt("catalog_id");

        return new ProfesorEntity(name, cnp, nume, prenume, dataNasterii, materie, grad, catalogId);
    }
}
