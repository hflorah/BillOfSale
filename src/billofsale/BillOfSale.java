/*
 * Bennie
 * BillOfSale.java
 * This program calculates the change of a bill of sale
 * February 27,2018
 */
package billofsale;

/**
 *
 * @author huangsiwen
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cost,taxes,total,change;
        cost=12.49;
        taxes=cost*0.13;
        total=20.0;
        change=total-(cost+taxes);
        
        System.out.println("change=$"+change+"\npurchased price=$"+cost+"\ntotal=$"+total+"\ntaxes=$"+taxes);
    }
    
}
