package patterns.adapter;

public class WineGallonsImplClass extends WineInLitres implements WineInGallonsInterface {
    
    public Wine purchaseWineInGallons(double quantityInGallons) {
		double quantityInLitres = convertGallonstoLitres(quantityInGallons);
		return purchaseWine(quantityInLitres);
	}
    
	private double convertGallonstoLitres(double gallonQuantity) {
		return gallonQuantity * 3.79;
	}
}
