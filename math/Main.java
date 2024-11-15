public class Main {
    static void kg_value(String kg, int kg_price, int quantity) {

        int final_price = kg_price * quantity;
        System.out.println(kg + "price is " + final_price);

    }

    static void kg_to_gram(int kg_quantity, int kg_price, int g_quantity) {
        int kg_to_gram_val = 1000 * kg_quantity;
        // Calculate the price per gram
        double price_per_gram = (double) kg_price / kg_to_gram_val;
        System.out.println(kg_quantity + "kg" + " price : " + kg_price);
        System.out.println(g_quantity + "m" + " price : "+price_per_gram*g_quantity);
        // System.out.println("kg to gram :" + kg_to_gram_val);
        System.out.println("1 gram value : " + price_per_gram);

    }

    static void price(int total_price , int number_of_p , int quantity_of_p){
        double convert = (double) total_price / number_of_p;
        if(quantity_of_p >= 1){
            System.out.println(quantity_of_p+" peces price :"+quantity_of_p*convert);
        }else{
            System.out.println("1 peces price : "+convert);
        }
    }
    public static void main(String[] args) {
        // int kg_price = 40;

        // kg_to_gram(2, kg_price, 200);
        // kg_value("1kg",kg_price,5);
        price(10, 50, 2);


    }


}