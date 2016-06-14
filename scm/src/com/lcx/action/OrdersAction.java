package com.lcx.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;

import com.lcx.entity.Address;
import com.lcx.entity.Brand;
import com.lcx.entity.Cart;
import com.lcx.entity.Logitics;
import com.lcx.entity.Orders;
import com.lcx.entity.Product;
import com.lcx.entity.ProductSize;
import com.lcx.entity.ProductType;
import com.lcx.entity.User;
import com.lcx.entity.WOrder;
import com.lcx.service.AddressService;
import com.lcx.service.BrandService;
import com.lcx.service.CartService;
import com.lcx.service.LogiticsService;
import com.lcx.service.OrdersService;
import com.lcx.service.ProductService;
import com.lcx.service.ProductSizeService;
import com.lcx.service.ProductTypeService;
import com.lcx.service.WOrderService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrdersAction extends ActionSupport {
	@Resource
	OrdersService ordersService;
	@Resource
	CartService cartService;
	@Resource
	AddressService addressService;
	@Resource
	ProductService productService;
	@Resource
	LogiticsService logiticsService;
	@Resource
	ProductTypeService typeService;
	@Resource
	BrandService brandService;
	@Resource
	ProductSizeService productSizeService;
	@Resource
	WOrderService wOrderService;
	List <ProductSize> slist;
	List <Brand> blist;
	List <ProductType> tlist;
	List <Logitics> llist;
	List <Product> plist = new ArrayList<Product>() ;
	List <String> cartlist;
	List <Orders> olist =new ArrayList<Orders>();
	Orders orders;
	ActionContext ctx = ActionContext.getContext();
	List<Address> alist;
	Address address = new Address();
	String[] oilist;
	String  aid;
	Double total = 0.00;
	
	public String save(){
		
		if(cartlist != null){
			for (String cid : cartlist) {
				slist = productSizeService.findall();
				tlist = typeService.findall();
				blist = brandService.findall();
				Cart cart = new Cart();
				cart = cartService.findbyid(cid);
				Orders od = new Orders();
				od.setPid(cart.getPid());
				
				Product product = new Product();
				product = productService.findbyid(cart.getPid());				
				plist.add(product);
				od.setPname(product.getPname());
				od.setPay(product.getPrice()*cart.getCnumber());
				od.setPnum(cart.getCnumber());
				od.setLid(cart.getLid());
				od.setOstatus("待付款");	
				od.setSid(cart.getSid());
				User user = new User();
				total = total+product.getPrice()*cart.getCnumber();
				if (ctx.getSession().get("user") != null) {					
					user = (User) ctx.getSession().get("user");
					alist = addressService.findbyuid(user.getU_id());
					od.setUid(user.getU_id());
				}	
				
				llist = logiticsService.findall();				
				ordersService.save(od);
				cartService.delete(cid);
				olist.add(od);
			}
			
		}else{
			User user = new User();
			if (ctx.getSession().get("user") != null) {					
				user = (User) ctx.getSession().get("user");
				alist = addressService.findbyuid(user.getU_id());
			}
			llist = logiticsService.findall();
			blist = brandService.findall();
//			ActionContext actionContext = ActionContext.getContext();
//			User user = new User();
//			user = (User) actionContext.getSession().get("user");		
			plist = productService.findall();
			orders = ordersService.findbyid(orders.getOid());
			System.out.println("+++++++++="+orders.getPnum());
			olist.add(orders);
		}
		return "save";
	}
	public String delete(){
		ordersService.delete(orders.getOid());
		return "listu";
	}
	
	public String addto(){
		User user = new User();
		user = (User) ctx.getSession().get("user");
	
		for(String oid : oilist){
			Orders od = new Orders();
			od = ordersService.findbyid(oid);
			od.setLiuyan(orders.getLiuyan());
			od.setLid(orders.getLid());
			if(!aid.isEmpty()){
				address = addressService.findbyid(aid);
				od.setAddress(address.getUaddress());
				od.setPhone(address.getUphone());
				od.setUname(address.getUname());
				//设置物流订单
				WOrder wo=new WOrder();
				wo.setOid(od.getOid());
				wo.setLid(od.getLid());
				wo.setWostatus("未发货");
				wOrderService.save(wo);
				od.setOstatus("未发货");
			}
		
			ordersService.update(od);
			
		}
	
		return "listu";
	}
	public String add(){
		User user = new User();
		user = (User) ctx.getSession().get("user");
		
		return "listu";
	}
	
	public String listui() {
		User user = new User();
		user = (User) ctx.getSession().get("user");
		ctx.put("user", user);
		olist = ordersService.finbyuid(user.getU_id());
		plist = productService.findall();
//		for(Orders od : olist){
//			Product pd = new Product();
//			pd = productService.findbyid(od.getPid());
//			plist.add(pd);
//		}
		return "listui";
	}
	
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String[] getOilist() {
		return oilist;
	}
	public void setOilist(String[] oilist) {
		this.oilist = oilist;
	}
	public Double getTotal() {
		
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}

	public ProductSizeService getProductSizeService() {
		return productSizeService;
	}

	public void setProductSizeService(ProductSizeService productSizeService) {
		this.productSizeService = productSizeService;
	}

	public List<ProductSize> getSlist() {
		return slist;
	}

	public void setSlist(List<ProductSize> slist) {
		this.slist = slist;
	}

	public AddressService getAddressService() {
		return addressService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public LogiticsService getLogiticsService() {
		return logiticsService;
	}

	public ProductTypeService getTypeService() {
		return typeService;
	}

	public BrandService getBrandService() {
		return brandService;
	}

	public void setLlist(List<Logitics> llist) {
		this.llist = llist;
	}

	public void setAlist(List<Address> alist) {
		this.alist = alist;
	}

	public void setTypeService(ProductTypeService typeService) {
		this.typeService = typeService;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	public List<Product> getPlist() {
		return plist;
	}

	
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	
	public List<Brand> getBlist() {
		return blist;
	}

	public void setBlist(List<Brand> blist) {
		this.blist = blist;
	}

	public List<ProductType> getTlist() {
		return tlist;
	}

	public void setTlist(List<ProductType> tlist) {
		this.tlist = tlist;
	}

	public List<Logitics> getLlist() {
		return llist;
	}

	public void setLogiticsService(LogiticsService logiticsService) {
		this.logiticsService = logiticsService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Address> getAlist() {
		return alist;
	}

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	public List<Orders> getOlist() {
		return olist;
	}

	public void setOlist(List<Orders> olist) {
		this.olist = olist;
	}

	public List<String> getCartlist() {
		return cartlist;
	}

	public void setCartlist(List<String> cartlist) {
		this.cartlist = cartlist;
	}

	public OrdersService getOrdersService() {
		return ordersService;
	}

	public CartService getCartService() {
		return cartService;
	}

	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	
}
