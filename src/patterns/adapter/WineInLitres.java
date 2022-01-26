package patterns.adapter;

public class WineInLitres implements WineInLitresInterface {
    
	public Wine purchaseWine(double quantityInLitres) {
		System.out.println("Purchasing " + quantityInLitres + " litres of Wine");
		return new Wine(quantityInLitres);
	}
}
