package com.imooc.sell;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerTest {

    @Autowired
    private ProductCategoryRepository repository;


    @RequestMapping("/getall")
    public List<ProductCategory> getAll(){
        return repository.findAll();

    }
}
