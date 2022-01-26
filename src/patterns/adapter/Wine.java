package patterns.adapter;

public class Wine {
    
    private double winePrice;

    public Wine(double quantityLitres){
        this.winePrice = Math.round((quantityLitres * 19.99) * 100.0) / 100.0;
        System.out.println("Your wine order today is " + winePrice + " USD.");
        System.out.println("Thank you, come again!");
       
    }   


}
