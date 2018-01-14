/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarlistacriterios;

import java.util.Comparator;

/**
 *
 * @author Maria Teresa
 */
public class NumbersComparator implements Comparator<Integer>  {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (-1)*o1.compareTo(o2);
    }
    
    
    
}
