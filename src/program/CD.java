package program;
public class CD {
    private double price;
    private String title;    
    
    public void SetTitle(String title){
        this.title = title;
    }
    public String GetTitle(){
        return this.title;        
    }  
    public void SetPrice(double price){
        this.price = price;
    }
    public double GetPrice(){
        return this.price;
    }
    @Override
    public String toString() {
        String nl = System.getProperty("line.separator");        
        return this.getClass().getSimpleName() + nl + " Price " + this.price + nl + " Title " + this.title;       
    }
}
