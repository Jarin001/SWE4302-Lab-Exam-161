public class Order {
    String flavour;
    String toppings;
    String cone;
    double subtotal=0.00;
    double tax ;
    double total = 0.00;

    public Order (String flavour, String toppings, String cone, double subtotal, double tax, double total){
        this.flavour=flavour;
        this.toppings=toppings;
        this.cone=cone;
        this.subtotal=subtotal;
        this.tax=tax;
        this.total=total;
    }

    public double coneprice(String type){
        if(type=="Waffle"){
            subtotal+=5.00;
        }
        else subtotal +=0.00;

        return subtotal;
    }

    public double flavour(String f){
        if(f=="Marshmallow"){

        }

        return subtotal;
    }

}
