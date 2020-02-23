package capitulo.pkg10.ejercicio.pkg6;

public class InsuredPackage extends Package{

    public InsuredPackage(Double weight, ShippingMethod shippingMethod) {
        super(weight, shippingMethod);
        if(super.getShippingCost()>=0 && super.getShippingCost()<=1){
            super.AdditionalCost(2.45);
        }
        else if(super.getShippingCost()>=1.01 && super.getShippingCost()<=3.00){
            super.AdditionalCost(3.95);
        }
        else if(super.getShippingCost()>=3.01 ){
            super.AdditionalCost(5.55);
        }
    }
    

    
}
