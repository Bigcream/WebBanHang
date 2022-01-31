/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.dao;

import Web.model.ProductModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IProductDao extends IGenericDao<ProductModel> {

    ProductModel findOne(Long id);

    List<ProductModel> findByCategoryId(Long categoryId);

    Long save(ProductModel productModel);

    void delete(ProductModel productModel);
}
