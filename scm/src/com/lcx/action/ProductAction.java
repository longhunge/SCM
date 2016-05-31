package com.lcx.action;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.lcx.entity.Brand;
import com.lcx.entity.Hot;
import com.lcx.entity.Product;
import com.lcx.entity.ProductSize;
import com.lcx.entity.ProductType;
import com.lcx.service.BrandService;
import com.lcx.service.HotService;
import com.lcx.service.ProductService;
import com.lcx.service.ProductSizeService;
import com.lcx.service.ProductTypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	@Resource
	private ProductService productService;
	@Resource
	private BrandService brandService;
	@Resource
	private ProductTypeService productTypeService;
	@Resource
	private ProductSizeService productSizeService;
	@Resource
	private HotService hotService;
	
	private ProductSize productSize=new ProductSize();
	private List <ProductSize> slist;
	private List<Brand> blist;
	private ProductType ttype;
	private Product product;
	private Hot hot;
	private List <Hot> hlist;
	private Brand brand;
	private List<ProductType> tlist;
	
	private String[] selectRaw;
	/**size start**/
	private Integer num38;
	private Integer num39;
	private Integer num41;
	private Integer num42;
	private Integer num43;
	private Integer num40;
	private Integer mnum;
	private Integer snum;
	private Integer lnum;
	private Integer xlnum;
	private Integer xxlnum;
	/**size start**/
	/********image*****/
	private File img1;
	private String img1ContentType;
	private String img1FileName;
	private File img2;
	private String img2ContentType;
	private String img2FileName;
	private File img3;
	private String img3ContentType;
	private String img3FileName;
	private File img4;
	private String img4ContentType;
	private String img4FileName;
	private File img5;
	private String img5ContentType;
	private String img5FileName;
	/*****image**********/
	
	private List<Product> plist;
	ActionContext ctx = ActionContext.getContext();
	
	
	public String pdetail(){
		slist = productSizeService.finbypid(product.getPid());
		product = productService.findbyid(product.getPid());		
		return "pdetail";
		
	}
	
	//热门
	public String photui(){
		product = productService.findbyid(product.getPid());
		hlist = hotService.findall();
		return "photui";
	}
	public String photedit(){
		hot.setHot1(product.getPid());
		hotService.update(hot);
		return "list";
	}
	// 跳转到新增
	public String paddui() {
		tlist = productTypeService.findall();
		ctx.put("tlist", tlist);
		blist = brandService.findall();
		ctx.put("blist", blist);
		return "paddui";
	}

	public String deleteSelected() {
		if(selectRaw!=null){
			for(String id : selectRaw){
				productService.delete(id);
			}
		}
		return "list";
	}
	public String Save(File img,String filepath,String imgFileName){
		if(img!=null){
			//保存头像到指定路径upload/user
			String filename = UUID.randomUUID().toString()+imgFileName.substring(imgFileName.lastIndexOf("."));
			try {
				FileUtils.copyFile(img, new File(filepath,filename));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			return filename;
		}	
		return "";
	}
	// 添加
	public String padd() throws Exception {
		if (product != null) {
			String filepath = ServletActionContext.getServletContext().getRealPath("upload/goods");
			product.setImg1("upload/goods/"+Save(img1,filepath,img1FileName));
			product.setImg2("upload/goods/"+Save(img2,filepath,img2FileName));
			product.setImg3("upload/goods/"+Save(img3,filepath,img3FileName));
			product.setImg4("upload/goods/"+Save(img4,filepath,img3FileName));
			product.setImg5("upload/goods/"+Save(img5,filepath,img5FileName));
			// ttype.setTname(new
			// String(ttype.getTname().getBytes("ISO-8859-1"),"UTF-8"));
			productService.save(product);
			product = productService.findbyproduct(product);
			check();
		}
		return "list";
	}

	
	public String plistui() {
		plist = productService.findall();
		ctx.put("plist", plist);
		blist = brandService.findall();
		ctx.put("blist", blist);
		tlist=productTypeService.findall();
		ctx.put("tlist", tlist);
		return "plistui";
	}

	public String pdelete() {
		productService.delete(product.getPid());
		return "list";
	}

	// 编辑页面
	public String peditui() {
		tlist = productTypeService.findall();
		product = productService.findbyid(product.getPid());
		return "peditui";
	}

	// 编辑功能
	public String pedit() throws Exception {
		String filepath = ServletActionContext.getServletContext().getRealPath("upload/goods");
		product.setImg1("upload/goods/"+Save(img1,filepath,img1FileName));
		product.setImg2("upload/goods/"+Save(img2,filepath,img2FileName));
		product.setImg3("upload/goods/"+Save(img3,filepath,img3FileName));
		product.setImg4("upload/goods/"+Save(img4,filepath,img3FileName));
		product.setImg5("upload/goods/"+Save(img5,filepath,img5FileName));
		//product.setPname(new String(product.getPname().getBytes("ISO-8859-1"),"UTF-8"));
		check();
		productService.update(product);
		return "list";
	}

	
	//尺寸初始化
		public void check(){
			if(product.getPid()!=null){
				System.out.println("+++++++++++"+product.getPid());
			//款式设置
			if(mnum != null){	
				productSize.setPid(product.getPid());
				productSize.setPnum(mnum.intValue());
				productSize.setPsize("M");
				productSizeService.save(productSize);
			}
			if(snum != null){	
				productSize.setPid(product.getPid());
				productSize.setPnum(snum.intValue());
				productSize.setPsize("S");
				productSizeService.save(productSize);
			}
			if(lnum != null){	
				productSize.setPid(product.getPid());
				productSize.setPnum(lnum.intValue());
				productSize.setPsize("L");
				productSizeService.save(productSize);
			}
			if(xlnum != null){	
				productSize.setPid(product.getPid());
				productSize.setPnum(xlnum.intValue());
				productSize.setPsize("XL");
				productSizeService.save(productSize);
			}
			if(xxlnum != null){	
				productSize.setPid(product.getPid());
				productSize.setPnum(xxlnum.intValue());
				productSize.setPsize("XXL");
				productSizeService.save(productSize);
			}
			if(num38!=null){
				productSize.setPnum(num38);
				productSize.setPid(product.getPid());
				productSizeService.save(productSize);
			}
			if(num40!=null){
				productSize.setPnum(num40);
				productSize.setPid(product.getPid());
				productSizeService.save(productSize);
			}
			if(num41!=null){
				productSize.setPnum(num41);
				productSize.setPid(product.getPid());
				productSizeService.save(productSize);
			}
			if(num42!=null){
				productSize.setPnum(num42);
				productSize.setPid(product.getPid());
				productSizeService.save(productSize);
			}
			if(num43!=null){
				productSize.setPnum(num43);
				productSize.setPid(product.getPid());
				productSizeService.save(productSize);
			}
			if(num39!=null){
				productSize.setPnum(num39);
				productSize.setPid(product.getPid());
				productSizeService.save(productSize);
			}
			}
		}
	
	
	
	/****************************************
	 * geter and seter                      *
	 ****************************************/
	
	public ProductService getProductService() {
		return productService;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ProductType getTtype() {
		return ttype;
	}

	public void setTtype(ProductType ttype) {
		this.ttype = ttype;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	public BrandService getBrandService() {
		return brandService;
	}
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}
	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	/*size start*/

	public void setNum39(Integer num39) {
		this.num39 = num39;
	}

	public void setNum41(Integer num41) {
		this.num41 = num41;
	}

	public void setNum42(Integer num42) {
		this.num42 = num42;
	}

	public void setNum43(Integer num43) {
		this.num43 = num43;
	}

	public void setNum40(Integer num40) {
		this.num40 = num40;
	}

	public void setMnum(Integer mnum) {
		this.mnum = mnum;
	}

	public void setSnum(Integer snum) {
		this.snum = snum;
	}

	public void setLnum(Integer lnum) {
		this.lnum = lnum;
	}

	public void setXlnum(Integer xlnum) {
		this.xlnum = xlnum;
	}

	public void setXxlnum(Integer xxlnum) {
		this.xxlnum = xxlnum;
	}
	public void setNum38(Integer num38) {
		this.num38 = num38;
	}
	
	public ProductSize getProductSize() {
		return productSize;
	}
	public void setProductSize(ProductSize productSize) {
		this.productSize = productSize;
	}
	public void setProductSizeService(ProductSizeService productSizeService) {
		this.productSizeService = productSizeService;
	}
	/*size start*/
	/****image***/
	public void setImg1(File img1) {
		this.img1 = img1;
	}
	public void setImg1ContentType(String img1ContentType) {
		this.img1ContentType = img1ContentType;
	}
	public void setImg1FileName(String img1FileName) {
		this.img1FileName = img1FileName;
	}
	public void setImg2(File img2) {
		this.img2 = img2;
	}
	public void setImg2ContentType(String img2ContentType) {
		this.img2ContentType = img2ContentType;
	}
	public void setImg2FileName(String img2FileName) {
		this.img2FileName = img2FileName;
	}
	public void setImg3(File img3) {
		this.img3 = img3;
	}
	public void setImg3ContentType(String img3ContentType) {
		this.img3ContentType = img3ContentType;
	}
	public void setImg3FileName(String img3FileName) {
		this.img3FileName = img3FileName;
	}
	public void setImg4(File img4) {
		this.img4 = img4;
	}
	public void setImg4ContentType(String img4ContentType) {
		this.img4ContentType = img4ContentType;
	}
	public void setImg4FileName(String img4FileName) {
		this.img4FileName = img4FileName;
	}
	public void setImg5(File img5) {
		this.img5 = img5;
	}
	public void setImg5ContentType(String img5ContentType) {
		this.img5ContentType = img5ContentType;
	}
	public void setImg5FileName(String img5FileName) {
		this.img5FileName = img5FileName;
	}
	public File getImg1() {
		return img1;
	}
	public String getImg1ContentType() {
		return img1ContentType;
	}
	public String getImg1FileName() {
		return img1FileName;
	}
	public File getImg2() {
		return img2;
	}
	public String getImg2ContentType() {
		return img2ContentType;
	}
	public String getImg2FileName() {
		return img2FileName;
	}
	public File getImg3() {
		return img3;
	}
	public String getImg3ContentType() {
		return img3ContentType;
	}
	public String getImg3FileName() {
		return img3FileName;
	}
	public File getImg4() {
		return img4;
	}
	public String getImg4ContentType() {
		return img4ContentType;
	}
	public String getImg4FileName() {
		return img4FileName;
	}
	public File getImg5() {
		return img5;
	}
	public String getImg5ContentType() {
		return img5ContentType;
	}
	public String getImg5FileName() {
		return img5FileName;
	}
	public HotService getHotService() {
		return hotService;
	}
	public void setHotService(HotService hotService) {
		this.hotService = hotService;
	}
	public Hot getHot() {
		return hot;
	}
	public void setHot(Hot hot) {
		this.hot = hot;
	}
	public List<Hot> getHlist() {
		return hlist;
	}
	public void setHlist(List<Hot> hlist) {
		this.hlist = hlist;
	}
	public String[] getSelectRaw() {
		return selectRaw;
	}
	public void setSelectRaw(String[] selectRaw) {
		this.selectRaw = selectRaw;
	}

	public List<ProductSize> getSlist() {
		return slist;
	}

	public void setSlist(List<ProductSize> slist) {
		this.slist = slist;
	}
	
	/****image****/
	
}
