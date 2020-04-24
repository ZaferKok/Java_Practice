package cellPhones;

public class Xiaomi extends CellPhones{
	
	String model;
	int storageCapacity;
	double price;
	
	public Xiaomi() {
		model = "9C";
		storageCapacity = 28;
		price = 850.0;
	}

	public Xiaomi(String model, int storageCapacity, double price) {
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