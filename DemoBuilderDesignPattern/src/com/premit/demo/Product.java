package com.premit.demo;

public class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private String productDescription;
	
	private Product(Builder builder) {
		this.productId = builder.productId;
		this.productName = builder.productName;
		this.productPrice = builder.productPrice;
		this.productQuantity = builder.productQuantity;
		this.productDescription = builder.productDescription;
	}
	
	public static class Builder{
		private String productId;
		private String productName;
		private double productPrice;
		private int productQuantity;
		private String productDescription;
		
		public Builder productId(String productId) {
			this.productId = productId;
			return this;
		}
		public Builder productName(String productName) {
			this.productName = productName;
			return this;
		}
		public Builder productPrice(double productPrice) {
			this.productPrice = productPrice;
			return this;
		}
		public Builder productQuantity(int productQuantity) {
			this.productQuantity = productQuantity;
			return this;
		}
		public Builder productDescription(String productDescription) {
			this.productDescription = productDescription;
			return this;
		}
		
		public Product build() {
			return new Product(this);
		}
		
	}
	public void display() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(productQuantity);
		System.out.println(productDescription);
	}
	
}
