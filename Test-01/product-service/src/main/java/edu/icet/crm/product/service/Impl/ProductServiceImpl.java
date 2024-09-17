package edu.icet.crm.product.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.product.ProductEntity;
import edu.icet.crm.product.model.Product;
import edu.icet.crm.product.repository.ProductRepository;
import edu.icet.crm.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void saveProduct(Product product){

//        ProductEntity entity = new ProductEntity();
//        entity.setName(product.getName());
//        entity.setPrice(product.getPrice());
//        entity.setDescription(product.getDescription());
//        repository.save(entity);
        ProductEntity entity = mapper.convertValue(product, ProductEntity.class);

        repository.save(entity);
    }
}
