package day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q3_Lampda03_Arrays {
    public static void main(String[] args) {

    // Arraylerde Stream kullanabilmek icin 2 yol vardir

// 1) Stream <Integer> isim=StreamOf(cevrilecek olan)
// 2) Arrays.stream(arr).

    Integer arr [] ={1,5,-5,6,12,-8,9,3,4};
    int arr1 [] ={1,5,-5,6,12,-8,9,3,4};

        System.out.println("liste = " + liste(arr));
        System.out.println("liste1 = " + liste1(arr));
        System.out.println("topla = " + topla(arr));
        System.out.println("toplam1 = " + toplam1(arr1));
        ort(arr1);


    }
//S1: arrayin elemanlarini bir liste yazdiralim
    public static List<Integer> liste(Integer[]arr){
       return Arrays.stream(arr).collect(Collectors.toList());

    }
    public static List<Integer> liste1(Integer[]arr){
        Stream<Integer> arrlist=Stream.of(arr);
        return arrlist.collect(Collectors.toList());
    }


//S2: Arrayin elemanlarini toplamini bulalim
    public static int topla(Integer[]arr){
        return Arrays.stream(arr).reduce(0,(x,y)->x+y);
    }
    public static int toplam1(int[]arr1){
        return Arrays.stream(arr1).sum();
    }
// S3: Array in elemanlarinin ortalamasini bulalim yazdir
    public static void ort(int[] arr1){
        Arrays.stream(arr1).average().ifPresent(t-> System.out.println("ortalama =" +t));
    }

}
