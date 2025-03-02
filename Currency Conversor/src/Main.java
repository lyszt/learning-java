import java.util.Scanner;

class Currency {
    double dollar_rate;
    String country;
    public static double convert(Currency origin, Currency target){
        return (origin.dollar_rate / target.dollar_rate );
    }
}
public class Main {
    public static void main(String[] args) {
        Currency real = new Currency();
        real.dollar_rate = 0.17;
        real.country = "Brazil";
        Currency euro = new Currency();
        euro.dollar_rate = 1.04;
        euro.country = "European Union";
        String conversion_result = String.format("%.2f", Currency.convert(real,euro));
        System.out.println("Um real equivale a " + conversion_result + " euros");
    }
}





