package com.lalit.productsale.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lalit.productsale.service.SaleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationTestConfig.class})
public class ProductSaleTest {

	@Autowired
	SaleRepository saleRepository;
	
	@Test
	public void contextLoaded(){
		Assert.assertNotNull(saleRepository);
	}
	
	@Test
	public void findSaleByID(){
		Assert.assertEquals(1,saleRepository.findOne(1).getSalesId().intValue());
	}
	
	@Test
	public void totalSaleItems_For_ProductID_1_Is_Four(){
		Assert.assertEquals(4L,saleRepository.getSaleSummaryOfProduct(1).get(0)[1]);
	}
	
}
