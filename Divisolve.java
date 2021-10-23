
package DesafioProgramacion;

import java.math.BigInteger;


public class Divisolve {

    final static BigInteger M = new BigInteger("2021");

    public static BigInteger compute(long n) {
        int[] dic = new int[M.intValue()]; //crea un array que contiene todo el espacio de la solucion
        for (int i = 0; i < dic.length; i++) { 
            //en cada cliclo se guardara en la posicion que corresponde al resto anterior el resultado de n mas el acarreo 
            String st = "";
            st = st + i + n;
            BigInteger bg = new BigInteger(st).mod(M);
            dic[i] = bg.intValue();
        }
        String s ;
        int r = 0;
        //se calcula el resto de dividir n entre 2021, el cociente rrepresenta la cantidad de vueltas completas que hay que dar al array para encontrar la solucion
        //y el resto es la posicion del array en donde estaria la respuesta 
        //como la vuelta empieza y termina en 0 con ver que hay en la posicion r despues de step pasos alcanza para descubrir la solucion
        BigInteger step = new BigInteger(String.valueOf(n)).mod(M);
       
        for (long i = 0;i < step.intValue() ;i++) {
            //se recorre dic hasta la posicion que 
            r = dic[r];
        }
        s = String.valueOf(r);

        
        return new BigInteger(s);

    }

}
