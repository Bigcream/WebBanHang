/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.service;

import Web.model.ProductModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IProductService {
    List<ProductModel> findByCategoryId(Long category_Id);
    ProductModel save(ProductModel productModel);
    ProductModel delete(ProductModel productModel);
}
