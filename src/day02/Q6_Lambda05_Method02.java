package day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q6_Lambda05_Method02 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");

        buyukyaz(l);
        System.out.println();
        System.out.println("=============================================================");
        uzunlukSirala(l);
        System.out.println("=============================================================");
        EileBas(l);

    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    public static void buyukyaz(List<String>l){
        l.stream().map(String::toUpperCase).forEach(Q5_Lampda05_Method01::yazString);
    }


    //S2: Stringleri uzunluklarina gore siralayip yaziniz
public static void uzunlukSirala (List<String>l){
        l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
}


    //S3: E ILE Baslayanlari yazdiralim
    public static void EileBas (List<String>l){
        l.stream().filter(Q5_Lampda05_Method01::EbasliyorMu).forEach(System.out::println);
    }

}

