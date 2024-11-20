public class Order {
    String flavour;
    String toppings;
    String cone;
    double subtotal=0.00;

    public Order (String flavour, String toppings, String cone, double subtotal){
        this.flavour=flavour;
        this.toppings=toppings;
        this.cone=cone;
        this.subtotal=subtotal;
    }

    public double coneprice(String type){
        if(type=="Waffle"){
            subtotal+=5.00;
        }
        else subtotal +=0.00;

        return subtotal;
    }

    

}
