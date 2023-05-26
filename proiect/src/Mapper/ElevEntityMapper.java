package Mapper;

import Entity.ElevEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ElevEntityMapper implements RowMapper<ElevEntity> {

    public ElevEntity mapRow(ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name");
        String cnp = resultSet.getString("cnp");
        String nume = resultSet.getString("nume");
        String prenume = resultSet.getString("prenume");
        String dataNasterii = resultSet.getString("dataNasterii");
        String clasa = resultSet.getString("clasa");
        String specializare = resultSet.getString("specializare");
        int catalogId = resultSet.getInt("catalog_id");

        return new ElevEntity(name, cnp, nume, prenume, dataNasterii, clasa, specializare, catalogId);
    }
}
