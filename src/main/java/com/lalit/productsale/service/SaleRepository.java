package com.lalit.productsale.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lalit.productsale.domain.Sale;



public interface SaleRepository extends CrudRepository<Sale, Integer>  {
	
	@Query("select p.productName as product_name,count(p.productId) as total_count, " +
			" sum(s.salesAmount) as total_amount from Sale as s inner join s.productSold as p"+
			" group by p.productId order by p.productName")
	List<Object[]> getSaleSummary();
	
	@Query("select p.productName as product_name,count(p.productId) as total_count, " +
			" sum(s.salesAmount) as total_amount from Sale as s inner join s.productSold as p"+
			" where p.productId= :productIdentifier group by p.productId order by p.productName")
	List<Object[]> getSaleSummaryOfProduct(@Param("productIdentifier") Integer productIdentifier);
}
