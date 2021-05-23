package day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4_Lampda04_MultiArrays {
    public static void main(String[] args) {
        //multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
//1) lamda kullanarak
// Arrays.stream(str).flatMap(t->Arrays.stream(t))
//2 method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc","Erik"}
        };
        System.out.println("liste = " + liste(arr));
        doubleYazdir(arr);
        yildizEkle(arr);


    }
    // S1 : tum elemanlari list yapayim

    public static List<String>liste(String[][] arr){
        return Arrays.stream(arr).flatMap(t->Arrays.stream(t)).collect(Collectors.toList());
    }
    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim yazdiralim
    public static void doubleYazdir(String[][]arr){
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.startsWith("E")).
                map(t->t+t).forEach(t-> System.out.println(t));
    }

    //k ile bitenlerin sonuna '*' ekleyelim
    public static void yildizEkle(String [][] arr){
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).
                filter(t->t.toLowerCase().endsWith("k")).map(t->t+"*").
                forEach(t-> System.out.println(t));
    }
}
