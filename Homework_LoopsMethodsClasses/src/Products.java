
public class Products implements Comparable<Products> {
	private String name;
	private float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Products(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
    public int compareTo(Products prod) {
    if (this.price > prod.getPrice()) {
            return 1;
    }
    else if (this.price < prod.getPrice()) {
            return -1;
    }
    return 0;
    }
}
