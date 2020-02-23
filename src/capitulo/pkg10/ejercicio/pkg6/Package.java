package capitulo.pkg10.ejercicio.pkg6;

public class Package {
    private Double weight;
    private ShippingMethod shippingMethod;
    private Double shippingCost;
    
    public Package(Double weight,ShippingMethod shippingMethod){
        this.weight=weight;
        this.shippingMethod=shippingMethod;
        this.shippingCost=calculateCost(weight,shippingMethod);
    }
    
    private Double calculateCost(Double weight,ShippingMethod shippingMethod){
        switch (shippingMethod) {
            case A:
                if(weight>=1.0 && weight<=8.0){
                    return 2.0;
                }
                else if(weight>=9.0 && weight<=16.0){
                    return 3.0;
                }
                else if(weight>=17.0){
                    return 4.50;
                }   break;
            case M:
                if(weight>=1.0 && weight<=8.0){
                    return 1.50;
                }
                else if(weight>=9.0 && weight<=16.0){
                    return 2.35;
                }
                else if(weight>=17.0){
                    return 3.25;
                }   break;
            case T:
                if(weight>=1.0 && weight<=8.0){
                    return .50;
                }
                else if(weight>=9.0 && weight<=16.0){
                    return 1.50;
                }
                else if(weight>=17.0){
                    return 2.15;
                }   break;
            default:
                break;
        }
        return 0.0;
    }
    
    void AdditionalCost(Double cost){
        this.shippingCost+=cost;
    }
    
    public void display(){
        System.out.println(weight+" "+shippingMethod+" "+shippingCost);
    }

    public Double getWeight() {
        return weight;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public Double getShippingCost() {
        return shippingCost;
    }
    
    
    
    }
