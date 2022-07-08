//using a bubble sort algorithm in an arrylist
import java.util.ArrayList;
import java.util.*;

class Bubblesort {
    public static void main(String []args) {



        String names[] = {"right", "subdued", "trick", "crayon", "punishment", "silk", "describe","royal", "prevent", "slope"};
        String tem;
        int j = 0;



        System.out.print("Bubble sort algorithm names:");

        for( j = 0; j<names.length; j++){
            for(int i = j +1; i < names.length; i++){
                //comparing the strings
                if(names[i].compareTo(names[j]) < 0){
                    tem = names[j];
                    names[j] = names[i];
                    names[i] = tem;
                }
            }
            System.out.println(names[j]);

        }

    }

}

/*
References
        https://www.tutorialspoint.com/perform-bubble-sort-on-strings-in-java
        https://beginnersbook.com/2019/04/java-program-to-perform-bubble-sort-on-strings/
*/


