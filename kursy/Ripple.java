/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursy;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Krystian
 */
public class Ripple {
    void xrp() throws IOException {
      Document ripple = Jsoup.connect("https://coinmarketcap.com/currencies/xrp/").get();
            String xrpPriceString = ripple.getElementsByClass("cmc-details-panel-price__price").text();
                    char sign = xrpPriceString.charAt(0);
                    String fullPrice = xrpPriceString.substring(1);
                    fullPrice = fullPrice.replace(",", "");
                    double fullPriceInDouble = Double.parseDouble(fullPrice);
            Document currency = Jsoup.connect("https://kantoronline.pl/kursy-walut").get();
                    String currencyUsdString= currency.getElementById("usdbuy").text();
                    double currencyUsdDouble= Double.parseDouble(currencyUsdString);
                    double result1 = 1000/currencyUsdDouble/fullPriceInDouble;
                    double result2 = fullPriceInDouble * currencyUsdDouble;
                System.out.println("Cena XRP na ten moment wynosi: "+ fullPriceInDouble +" "+ sign);
                System.out.printf("Wartość dolara %.2f zł %n", currencyUsdDouble);
                System.out.printf("Wydając 1000zł otrzymasz: %.8f XRP %n", result1);
                System.out.printf("Chcąc kupić w PLN jednego XRP potrzebujesz: %.2f zł", result2);
        }
    
}
