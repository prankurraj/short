package edu.boun.cmpe451.group2.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by mdbaloglu on 02/11/15.
 */
@Repository
@Scope("request")
public class IngredientDao extends BaseDao{
    public List<Map<String, Object>> getAllIngredients() {
        String sql = "SELECT ing.*, ingUnit.name FROM ingredients as ing INNER JOIN ingredientUnits AS ingUnit on ing.unitID = ingUnit.id";
        return this.jdbcTemplate.queryForList(sql);
    }

}
