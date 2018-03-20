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
public class mean {
    
    public static void main(String[] args) {
        HashMap<Integer,Integer> DFT = new HashMap<Integer,Integer>();
        DFT.put(50, 1);
        DFT.put(60, 2);
        DFT.put(70, 1);
        DFT.put(80, 3);
        DFT.put(90, 7);
        DFT.put(100, 5);
        
        Integer totalNilai = 0;
        Integer totalFrek = 0;
        double M = 0;
        
        for (Map.Entry elemen : DFT.entrySet()){
            System.out.println("Nilai : "+elemen.getKey()+" Frekuensi : "+elemen.getValue());
            
            //update total frek dan total nilai
            Integer x = new Integer(elemen.getKey().toString());
            Integer y = new Integer(elemen.getValue().toString());
            
            totalNilai += x*y;
            totalFrek += y;
        }
        
        M = totalNilai / totalFrek;
        System.out.println("mean = "+M);
        
    }
}
