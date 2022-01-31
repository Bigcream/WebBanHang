/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.controller.admin.api;

import Web.model.ProductModel;
import Web.service.IProductService;
import Web.utill.HttpUtill;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(urlPatterns = {"/api-admin-product"})
public class ProductApi extends HttpServlet {
    @Inject
    private IProductService productService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        ProductModel productModel = HttpUtill.of(req.getReader()).toModel(ProductModel.class);
        productModel = productService.save(productModel);
        mapper.writeValue(resp.getOutputStream(), productModel);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
}
