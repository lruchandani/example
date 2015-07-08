package com.lalit.productsale;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lalit.productsale.output.ReportBuilder;
import com.lalit.productsale.service.SaleRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	SaleRepository saleRepository;
	
	@Autowired
	ReportBuilder reportBuilder;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Object[]> results = saleRepository.getSaleSummary();
		reportBuilder.printReport(results);
	}


}
