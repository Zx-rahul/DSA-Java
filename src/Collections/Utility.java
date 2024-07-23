package Collections;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E call : collection) {
            System.out.printf("%s ",call);
        }
        System.out.println();
    }
}
