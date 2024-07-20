package Java.Introduccion.Practicas.Bucles.While_;

public class Break_ {
    public static void main (String[] args) {
    
        /*
        Tambien puede utilizarse break para terminar los bucles. 
        Run: 1, 2, 3, 4. Esto terminara el bucle cuanto x alcnce el valor 4. 
       
         */
        int x = 1;
        
        while (x < 10) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            x ++;
        }
    }
}
