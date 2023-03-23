
/*
 * Author/modified by:  Akpoguma Oghenerukevwe
 * Professor:Dave Houtman
 * Date: 1st December, 2022
 * Description: Lab Exam 02 (22F) Section 323
 */

 /*
  * This class represents a container of Gasoline
  */
public class Gasoline{
    private double volume;          // volume of gasoline in litres
    private double pricePerLitre;   // price per litre of gasoline in cents

    /*
     * No argument constructor
     */
    public Gasoline(){
        volume = 0;
        pricePerLitre = 0;
    }

    /*
     * accessor for volume
     */
    public double getVolume(){
        return volume;
    }

    /*
     * mutator for volume
     */
    public void setVolume(double volume){
        this.volume = volume;
    }

        /*
     * accessor for pricePerLitre
     */
    public double getPricePerLitre(){
        return pricePerLitre;
    }

    /*
     * mutator for pricePerLitre
     */
    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }

    /*
     * worker method for total price
     */
    public double calculateTotalPrice(){
         return (volume * pricePerLitre);
    }

    /*
     * worker method to check the range of the total price, whether is too high, low or within range.
     */
    public String checkTotalPrice(){
        String report = null;
        String value = null;
        double totalPrice;
        
        
        if ( calculateTotalPrice() <0) {
        	value = "total price invalid";
        }else if (calculateTotalPrice()>10000) {
        	value = "total price too high";
        }else if (calculateTotalPrice() >= 0 && calculateTotalPrice() <= 10000) {
        	value = "total price within range";
        }
        
        report = ("Check TotalPrice reports:" + value);
       
        return report; 
    }

}

