/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistika;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bagoes
 */
public class Statistika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,Integer> DFT = new HashMap<Integer,Integer>();
        
        int a [] = {65,66,67,68,69,70,70,70,70,71
                   ,71,71,72,72,72,72,72,72,73,73
                   ,73,74,74,74,74,74,74,74,75,75
                   ,75,75,75,76,77,78,79,79,80,82}; 
        for (int i = 0; i < a.length; i++) {
            Integer nilai = a[i];
            
            Integer frekuensi = DFT.get(nilai);
            if (DFT.containsKey(nilai)) {
                DFT.replace(nilai, frekuensi+1);
            }
            else{
                DFT.put(nilai, 1);
            }
                    
        }
        for (Map.Entry elemen : DFT.entrySet()){
            System.out.println("Nilai : "+elemen.getKey()+" Frekuensi : "+elemen.getValue());
        }
    }
    
}
