package com.acme.domain;

import java.util.List;

public interface ProductRepository {

    void save(Product product);

    List<Product> getAll();

    Product getOne(long productId);
}
