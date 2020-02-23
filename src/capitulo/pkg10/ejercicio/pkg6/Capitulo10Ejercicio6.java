package capitulo.pkg10.ejercicio.pkg6;

public class Capitulo10Ejercicio6 {

    public static void main(String[] args) {
        Package p1=new Package(5.0,ShippingMethod.A);
        Package p2=new Package(5.0,ShippingMethod.T);
        Package p3=new Package(5.0,ShippingMethod.M);
        Package p4=new Package(15.0,ShippingMethod.A);
        Package p5=new Package(15.0,ShippingMethod.T);
        Package p6=new Package(15.0,ShippingMethod.M);
        Package p7=new Package(21.0,ShippingMethod.A);
        Package p8=new Package(21.0,ShippingMethod.T);
        Package p9=new Package(21.0,ShippingMethod.M);
        InsuredPackage ip1=new InsuredPackage(15.0,ShippingMethod.A);
        InsuredPackage ip2=new InsuredPackage(5.0,ShippingMethod.M);
        InsuredPackage ip3=new InsuredPackage(21.0,ShippingMethod.T);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();
        p8.display();
        p9.display();          
        ip1.display();
        ip2.display();
        ip3.display();
        
    }
    
}
