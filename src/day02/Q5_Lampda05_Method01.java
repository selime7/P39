package day02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Q5_Lampda05_Method01{
        public static void yaz(int n){
            System.out.print(n+" ");
        }
        ///////////////////////////////////////////
        public static void yazString(String s){
            System.out.print(s+" ");
        }
        ////////////////////////////////
        public static boolean tekMi(int n){
            return n%2!=0;
        }
        //////////////////////////////////////////
        public static boolean ciftMi(int n){
            return n%2==0;
        }
        //////////////////////////////////////////
        public static boolean negatifMi(int n){
            return n<0;
        }
        //////////////////////////////////////////
        public static boolean pozitifMi(int n){
            return n>0;
        }
        //////////////////////////////////////////
        public static int kareBul(int n){
            return n*n;
        }
        public static int kupBul(int n){
            return n*n*n;
        }
        //////////////////////////////////////////
        public static boolean EbasliyorMu(String S){
            return S.startsWith("E");
        }


        public static void yaz2(IntStream S) {
            System.out.println(S+ " ");
        }
        public static int top (int a,int b){
            return a+b;
        }



public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);

    tekYazdir(intL);
    System.out.println("ciftCarpim= " + ciftCarpim(intL));
    System.out.println("kareTop = " + kareTop(intL));
    System.out.println("kupMax = " + kupMax(intL));

}
        // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    public static void tekYazdir(List<Integer>l){
            l.stream().filter((Q5_Lampda05_Method01::tekMi)).forEach(Q5_Lampda05_Method01::yaz);
    }
        // S2: ciftlein carpimini bulalim
    public static Optional<Integer> ciftCarpim (List<Integer>l){
           return l.stream().filter(Q5_Lampda05_Method01::ciftMi).reduce(Math::multiplyExact);
    }
        // S3: negatiflerin kare toplamlarini  bulalim
    public static Optional<Integer> kareTop (List<Integer>l){
            return l.stream().filter(Q5_Lampda05_Method01::negatifMi).
                    map(Q5_Lampda05_Method01::kareBul).reduce(Q5_Lampda05_Method01::top);
    }
        // S4: pozitiflerin kup max   bulalim
    public static Optional<Integer> kupMax(List<Integer>l){
            return l.stream().filter(Q5_Lampda05_Method01::pozitifMi).
                    map(Q5_Lampda05_Method01::kupBul).reduce(Math::max);
    }
        }