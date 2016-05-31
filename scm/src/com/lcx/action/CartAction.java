package com.lcx.action;

import javax.annotation.Resource;

import com.lcx.entity.Brand;
import com.lcx.entity.Cart;
import com.lcx.entity.Product;
import com.lcx.entity.ProductSize;
import com.lcx.entity.ProductType;
import com.lcx.service.BrandService;
import com.lcx.service.CartService;
import com.lcx.service.ProductService;
import com.lcx.service.ProductSizeService;
import com.lcx.service.ProductTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport {
	@Resource
	private ProductService productService;
	@Resource
	private BrandService brandService;
	@Resource
	private ProductTypeService productTypeService;
	@Resource
	private ProductSizeService productSizeService;
	@Resource
	private CartService cartService;
	private Product product; 
	private Brand brand;
	private ProductSize productSize;
	private ProductType productType;
	private Cart cart;
	//添加到购物车
	public String addttocart(){
		cartService.save(cart);
		return "list";
	}
	
	
	
	
	
	
	
	
	
	public CartService getCartService() {
		return cartService;
	}
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	public ProductService getProductService() {
		return productService;
	}
	public BrandService getBrandService() {
		return brandService;
	}
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}
	public ProductSizeService getProductSizeService() {
		return productSizeService;
	}
	public Product getProduct() {
		return product;
	}
	public Brand getBrand() {
		return brand;
	}
	public ProductSize getProductSize() {
		return productSize;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	public void setProductSizeService(ProductSizeService productSizeService) {
		this.productSizeService = productSizeService;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public void setProductSize(ProductSize productSize) {
		this.productSize = productSize;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	
	
}
