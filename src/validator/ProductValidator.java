package validator;

import domin.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asouqi on 3/22/18.
 */
public class ProductValidator {

    public static List<String> validate(Product product){
        List<String> error=new ArrayList<>();

        if (product.getName()==null || product.getName().trim().isEmpty())
           error.add("product name empty!");
        if (product.getDetail()==null || product.getDetail().trim().isEmpty())
            error.add("prduct detail empty!");
        if (product.getPrice()<0)
            error.add("prodect price have to be more than zero!");

        return error;
    }
}
