/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursy;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Krystian
 */
public class Kursy {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Kryptowaluty do wybobru: BTC, ETH, LTC, LSK, XRP");
        System.out.println("Podaj nazwę kryptowaluty");
        String crypto = scan.nextLine();
        Bitcoin btc = new Bitcoin();
        Ethereum eth = new Ethereum();
        Litecoin ltc = new Litecoin();
        Lisk lsk = new Lisk();
        Ripple xrp = new Ripple();
switch (crypto) {
    case "btc" -> btc.btc();
    case "BTC" -> btc.btc();
    case "bitcoin" -> btc.btc();
    case "Bitcoin" -> btc.btc();
    case "eth" -> eth.eth();
    case "ETH" -> eth.eth();
    case "ethereum" -> eth.eth();
    case "Ethereum" -> eth.eth();
    case "ltc" -> ltc.ltc();
    case "LTC" -> ltc.ltc();
    case "litecoin" -> ltc.ltc();
    case "Litecoin" -> ltc.ltc();
    case "lsk" -> lsk.lsk();
    case "Lsk" -> lsk.lsk();
    case "lisk" -> lsk.lsk();
    case "Lisk" -> lsk.lsk();
    case "xrp" -> xrp.xrp();
    case "Xrp" -> xrp.xrp();
    case "ripple" -> xrp.xrp();
    case "Ripple" -> xrp.xrp();
    default -> System.out.println("Wprowadziłeś nieprawidłowo nazwę lub w bazie nie znajduje się dana kryptowaluta");
                }


        }
}
