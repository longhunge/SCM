package com.lcx.action;

import java.util.ArrayList;
import java.util.List;

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
import com.opensymphony.xwork2.ActionContext;
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
	
	private List<Product> plist = new ArrayList<Product>();
	private List<Cart> clist;
	ActionContext ctx = ActionContext.getContext();
	//添加到购物车
	@SuppressWarnings("unused")
	public String addttocart(){
		Cart cart1 =new Cart();
		cart1 = cartService.findbypid(cart.getPid());
		if(cart1==null){
			cartService.save(cart);
		}else{
			cart.setCid(cart1.getCid());
			cart.setCnumber(cart1.getCnumber()+cart.getCnumber());
			cartService.update(cart);			
		}
		clist = cartService.findall();
		if (!clist.isEmpty()) {
			for (Cart ca : clist) {
				plist.add(productService.findbyid(ca.getPid()));
			}
		}
		ctx.put("plist", plist);
		return "detail";
	}
	
	
	
	
	public CartService getCartService() {
		return cartService;
	}
	
	public List<Cart> getClist() {
		return clist;
	}

	public void setClist(List<Cart> clist) {
		this.clist = clist;
	}

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
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
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
