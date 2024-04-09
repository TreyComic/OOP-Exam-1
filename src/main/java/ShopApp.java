public class ShopApp {

    public boolean isAFit(Customer customerSize, Cloth clothingItemSize){
    if(customerSize != null && clothingItemSize != null) {
        if (customerSize.toString() == clothingItemSize.toString()) {
            return true;
        }
        else{
            return false;
        }
    }
    return false;
    }
    public double calculateSubTotal(Cloth[] itemPrices){
        for(int i = 0; i > itemPrices.length; i++){

        }
        return 0;
    }
    public void printClassNamesOfPayableEntities(Payable[] classificationOfEmployee){

    }
}
