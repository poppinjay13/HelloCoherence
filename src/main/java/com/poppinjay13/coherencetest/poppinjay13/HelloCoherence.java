/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poppinjay13.coherencetest.poppinjay13;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedMap;
import java.util.Map;

/**
 *
 * @author Ian Odundo
 */
public class HelloCoherence {
    // ----- static methods -------------------------------------------------

    public static void main(String[] asArgs) {
        //launch DefaultCacheServer(); 
        
        NamedMap<String, String> map = CacheFactory.getCache("test");
        //map.put("English", "Hello");
        //map.put("Spanish", "Hola");
        //map.put("French", "Bonjour");

        System.out.printf("\nAccessing map \"%s\" containing %d entries\n\n",
                map.getName(),
                map.size());

        // list
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key => "+entry.getKey() + "\nVal => " + entry.getValue()+"\n\n");
        }
        
        //final size
        System.out.printf("Closing map \"%s\"\n\n",
                map.getName());
    }
}
