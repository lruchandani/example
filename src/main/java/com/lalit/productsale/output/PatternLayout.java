package com.lalit.productsale.output;

import org.springframework.stereotype.Component;

@Component
public class PatternLayout implements Layout {

	private static final String OUTPUT_PATTERN = "%-20s %10s %15s";
	
	@Override
	public String format(Object[] result) {
		return String.format(OUTPUT_PATTERN, result[0],result[1],result[2]);
	}

}
