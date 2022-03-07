import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class apidemo {

	public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1,2,3,4,5,6);
    /* for(int i=1; i<=6; i++) {
    	 System.out.println(i);
     }
     Iterator<Integer> ivalues = values.iterator();
     while(ivalues.hasNext()) {
    	 System.out.println(ivalues.next());
     }*/
     for(int i : values) {
    	 System.out.println(i);
     }
	}

}