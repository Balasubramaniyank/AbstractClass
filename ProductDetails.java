
abstract class Product{
	abstract int getPrice();
	abstract String getDescription();
}
class ClothingProduct extends Product{
	int getPrice() {
		return 499;
	}
	String getDescription() {
		return "Welcome to Ztudio! Buy 1 get 1 ";
	}
}
class ElectronicProduct extends Product{
	int getPrice() {
		return 19999;
	}
	String getDescription() {
		return "Summer Sale On...AC starts from";
	}
}
class BookProduct extends Product{
	int getPrice() {
		return 999;
	}
	String getDescription() {
		return "Buy any 2 Books for ";
	}
}
public class ProductDetails {

	public static void main(String[] args) {
		Product p1=new ElectronicProduct();
		System.out.println(p1.getDescription() +": "+p1.getPrice() +"Only...");
		Product p2=new ClothingProduct();
		System.out.println(p2.getDescription() +": "+p2.getPrice()+"Only...");
		Product p3=new BookProduct();
		System.out.println(p3.getDescription() +": "+p3.getPrice()+"Only...");

	}

}