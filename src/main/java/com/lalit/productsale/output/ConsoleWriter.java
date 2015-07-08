package com.lalit.productsale.output;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements Writer {

	@Override
	public void print(String record) {
		System.out.println(record);
	}

}
