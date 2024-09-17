package edu.icet.crm.product.repository;

import edu.icet.crm.product.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

}
