package com.lalit.productsale.output;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportBuilder {

	@Autowired
	Writer writer;
	
	@Autowired
	Layout layout;
	
	public  void printReport(List<Object[]> results) {
		printHeader();
		printBody(results);
		printFooter();
	}

	private void printFooter() {
		
	}

	private void printBody(List<Object[]> results) {
		results.stream().forEach(result -> writer.print(layout.format(result)));
	}

	private void printHeader() {
		String[] headers= {"Product Name", "Total Sold", "Total Amount"};
		writer.print(layout.format(headers));
	}

}
