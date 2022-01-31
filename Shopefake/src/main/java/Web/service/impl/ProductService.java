/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.service.impl;

import Web.dao.IProductDao;
import Web.mapper.ProductMapper;
import Web.model.ProductModel;
import Web.service.IProductService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author ADMIN
 */
public class ProductService implements IProductService{
    @Inject
    private IProductDao productDao;
    @Override
    public List<ProductModel> findByCategoryId(Long category_Id) {
        
        return productDao.findByCategoryId(category_Id);
        
    }

    @Override
    public ProductModel save(ProductModel pm) {
        Long productId = productDao.save(pm);
        
        return productDao.findOne(productId);
    }

    @Override
    public ProductModel delete(ProductModel pm) {
        this.productDao.delete(pm);
        return null;
        
    }


}
