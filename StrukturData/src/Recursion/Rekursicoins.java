/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Agustina Mufidatuzzainiya (210605110144)
 */

class rekursi{
    int makeChange (int[] coins, int change) {
    int minCoins = change;
        for (int i=0; i<coins.length; i++){
            if (coins[i] == change){
                return 1;
            }
        }
        for (int i=1; i<coins.length && coins[i]<change; i++) {
            int thisCoins = makeChange(coins, coins[i] ) + makeChange(coins, change - coins[i] );
            if(thisCoins < minCoins)minCoins = thisCoins;
        }
        return minCoins;
    }
}
public class Rekursicoins {
    public static void main(String[] args) {
        rekursi r = new rekursi();
        int []coin = {3,6,9,12,15};    
        System.out.println("Jumlah Pecahan Koin : "+r.makeChange(coin,63));
    }
}
