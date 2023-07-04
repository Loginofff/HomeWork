public class Contract extends Document {
    private  Double sum;


    public  Contract (String name, String createdDate, double sum){
        super(name, createdDate);
        this.sum = sum;
    }


    public boolean isValid() {
        return sum >= 0;
    }

    public double getSum(){
        return sum;
    }
}
