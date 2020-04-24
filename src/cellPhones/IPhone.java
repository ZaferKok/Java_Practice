package cellPhones;

public class IPhone extends CellPhones{
	
	String model = "3C";
	int storageCapacity = 8;
	double price = 350.0;
	
	public IPhone() {
	
	}

	public IPhone(String model, int storageCapacity, double price) {
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