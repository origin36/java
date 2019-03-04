/*******************************************************************************
 * WDSaleCheck.java
 * Daniel Wight
 *
 * Program that validates a sale in dollars and cents with a $ and .(period).
 ******************************************************************************/

/**
 *
 * @author Daniel J Wight
 */
public class WDSaleCheck {

    private String sale;
    private int dollars;
    private int cents;
    private String errorMsg = null;

    public WDSaleCheck(String sale){ //overloaded constructor
        this.sale = sale; //sale input
        if(sale.charAt(0) != ('$')){ //execute if '$' is not the first char of sale String
            try{
                throw new Exception("Invalid sale format missing \"$\" - " + this.sale + "\n");
            } //end try
            catch(Exception e){
                errorMsg = e.getMessage();
            } //end catch
        } //end if
        else if(!sale.contains(".")){ //execute if sale String doesnt contain '.'
            try{
                throw new Exception("Invalid sale format missing \".\" - " + this.sale + "\n");
            } //end try
            catch(Exception e){
                errorMsg = e.getMessage();
            } //end catch
        } //end else if
        else{ //execute if sale String has '$' at position 0 and contains '.'
            try{
                this.setDollars(Integer.parseInt(sale.substring((sale.indexOf("$") + 1), sale.indexOf("."))));
            } //end try
            catch(NumberFormatException nfe){ //error block if integer cannot be parsed from dollar
                errorMsg += ("Invalid dollar format - " + nfe.getMessage() + "\n");
            } //end catch
            try{ //try block for parsing an integer from the cents portion of sale
                this.setCents(Integer.parseInt(sale.substring(sale.indexOf('.') + 1)));
            } //end try
            catch(NumberFormatException nfe){ //error block if integer cannot be parsed from dollar
                errorMsg += ("Invalid cents format - " + nfe.getMessage() + "\n");
            } //end catch
        } //end else
    } //end WDSaleCheck
    public WDSaleCheck(){ //default constructor
        this(null);
    }
    //accessors
    public String getSale(){
        return this.sale;
    }
    public int getDollars(){
        return this.dollars;
    }
    public int getCents(){
        return this.cents;
    }
    public String getErrorMsg(){
        return errorMsg;
    }
    public double getCentsDouble(){ //created variable to convert cents to currency cents
        return Double.parseDouble(sale.substring(sale.indexOf('.')))*100; //create double from cent String and multiply by 100
    }
    //mutators
    public void setSale(String sale){
        this.sale = sale;
    }
    public final void setDollars(int dollars){
        this.dollars = dollars;
    }
    public final void setCents(int cents){
        this.cents = cents;
    }
    public void setErrorMsg(String error){
        this.errorMsg = error;
    }
    //print methods
     public void printNumeric() { //formatted print line
        System.out.printf("$%d.%2.0f\n", this.getDollars(), this.getCentsDouble());
    }
    public void printAlphabetic() { //formatted print line
        System.out.printf("%d dollars and %2.0f cents\n", this.getDollars(), this.getCentsDouble());
    }
} //end class