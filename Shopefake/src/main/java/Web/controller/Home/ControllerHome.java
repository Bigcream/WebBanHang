/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web.controller.Home;

import Web.model.ProductModel;
import Web.model.UserModel;
import Web.service.ICategoryService;
import Web.service.IProductService;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/HomeWeb"})
public class ControllerHome extends HttpServlet {

    @Inject
    private ICategoryService categoryService;
    @Inject
    private IProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String code = "quan-ao-nam";
        //Long categoryId = 1l;
        // req.setAttribute("products", productService.findByCategoryId(categoryId));
        String name = "T-SHIRT BLACK/RED";
        Long categoryId = 1L;
        float price = 1200000;
        String description = "Chất liệu sang xịn mịn phù hợp mọi lứa tuổi";
        Long quantity = 5L;
        Long status = 1L;
        String image_Link = "AO COC TAY.jpg";
        String note = "";
        ProductModel product = new ProductModel();
        product.setName(name);
        product.setCategoryId(categoryId);
        product.setPrice(price);
        product.setDescription(description);
        product.setQuantity(quantity);
        product.setStatus(status);
        product.setImage_Link(image_Link);
        product.setNote(note);
        //productService.save(product);
        productService.delete(product);
        req.setAttribute("categories", categoryService.findAll());
        RequestDispatcher rd = req.getRequestDispatcher("/views/Home/Home.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
