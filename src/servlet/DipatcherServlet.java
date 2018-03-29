package servlet;

import controller.InputFormController;
import controller.SaveProductController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by asouqi on 3/22/18.
 */
@WebServlet(name = "DipatcherServlet", urlPatterns = "*.action")
public class DipatcherServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     process(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     process(request,response);
    }

    private void process(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String uri=request.getRequestURI();
        int index_uri=uri.lastIndexOf('/')+1;
        String action=uri.substring(index_uri);

        String dispatchUrl=null;
        if (action.equals("input_product.action")){
            InputFormController inputFormController=new
                    InputFormController();
            dispatchUrl=inputFormController.handleRequest(request,response);
        }else if (action.equals("add_product.action")){
            SaveProductController saveProductController=new
                    SaveProductController();
            dispatchUrl=saveProductController.handleRequest(request,response);
        }

        if (dispatchUrl!=null){
             request.getRequestDispatcher(dispatchUrl).forward(request,response);
        }
    }
}
