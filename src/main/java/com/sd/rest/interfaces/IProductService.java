package com.sd.rest.interfaces;

import java.util.List;
import com.sd.rest.entities.Product;

public interface IProductService {
	List<Product> findAll();
}