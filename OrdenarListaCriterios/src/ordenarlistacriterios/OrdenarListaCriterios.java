
package ordenarlistacriterios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListaCriterios {

    public static void main(String[] args) {
      
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9); 
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        
        NumbersComparator nc =new NumbersComparator();
        Collections.sort(numbers, nc);
    }
    
}
