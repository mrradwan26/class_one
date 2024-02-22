package JavaLearning;

import java.sql.SQLOutput;

public class GetPrice {
    public static void main(String[] args) {
        String str="The price of the shirt is 500 BDT and VAT is 75 BDT";
        str=str.replaceAll("[^\\d]", " ");
        str=str.trim();
        System.out.println(str);
        str = str.replaceAll(" +", " ");
        System.out.println(str);
        String[] arr=(str.split(" "));
        double shirt_price=Double.parseDouble(arr[0]);
        double vat=Double.parseDouble(arr[1]);
        double total=shirt_price+vat;
        System.out.println("Total price is "+ total);
    }
}
