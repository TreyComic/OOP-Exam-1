public class Business {
    String nameOfBusiness = "";
    int quantitySupplied = 0;
    double productPrice = 0;
    public Business(String nameOfBusiness, int quantitySupplied, double productPrice){
        if(nameOfBusiness != null && quantitySupplied >= 0 && productPrice >= 0) {
            this.nameOfBusiness = nameOfBusiness;
            this.productPrice = productPrice;
            this.quantitySupplied = quantitySupplied;
        }
        else {
            System.out.println("Error! Invalid quantities and / or Prices for " + nameOfBusiness);
        }
    }
}
