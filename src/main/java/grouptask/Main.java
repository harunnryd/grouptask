/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptask;

import java.io.IOException;

/**
 *
 * @author runwols
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        PrayerProvider provider = new FirstApiProvider();
        provider.getPrayerTime();        

        provider = new SecondApiProvider();
        provider.getPrayerTime();        

    }
}
