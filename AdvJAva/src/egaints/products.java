package egaints;

public class products {
	int product_id;
	String product_description;
	String product_name;
	Float product_price;
	int supplier_id;
	public products()
	{
		
	}
	public products(int product_id, String product_description, String product_name, Float product_price,
			int supplier_id) {
		
		this.product_id = product_id;
		this.product_description = product_description;
		this.product_name = product_name;
		this.product_price = product_price;
		this.supplier_id = supplier_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Float product_price) {
		this.product_price = product_price;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	
	

}
