package com.premit.DemoBuilderDesignPatternLombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private int productQty;
	
	
}
