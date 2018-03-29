package controller;

import domin.Product;
import validator.ProductValidator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by asouqi on 3/22/18.
 */
public class SaveProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Product product=new Product();
        product.setName(request.getParameter("txtProductName"));
        product.setDetail(request.getParameter("txtProductDetail"));
        product.setPrice(Double.parseDouble(request.getParameter("txtProductPrice")));

        List<String> error=ProductValidator.validate(product);
        if (error==null){
         request.setAttribute("product",product);
         return "/WEB-INF/jsp/ProductDetail.jsp";
        }
        else{
            request.setAttribute("error",error);
            return "/WEB-INF/jsp/ProductForm.jsp";
        }
    }
}
