package cellPhones;

public class Samsung extends CellPhones{
	
	String model;
	int storageCapacity;
	double price;
	
	public Samsung() {
		model = "4C";
		storageCapacity = 18;
		price = 1350.0;
	}
	
	public Samsung(String model, int storageCapacity, double price) {
		this.model = model;
		this.storageCapacity = storageCapacity;
		this.price = price;
	}
	
	String phoneModel() {
		return model;
	}
	int phoneStorage() {
		return storageCapacity;
	}
	double phonePrice() {
		return price;
	}
}