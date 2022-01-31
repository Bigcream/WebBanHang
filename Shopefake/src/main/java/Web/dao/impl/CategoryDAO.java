/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.dao.impl;

import Web.dao.Icategory;
import Web.mapper.CategoryMapper;
import Web.model.CategoryModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.codegen.CompilerConstants.className;

/**
 *
 * @author ADMIN
 */
public class CategoryDAO extends AbstractDao<CategoryModel> implements Icategory {

    @Override
    public List<CategoryModel> findAll() {
        String sql = "SELECT * FROM category";
        return querỵ̣(sql, new CategoryMapper());
    }
}
