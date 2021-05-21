package day01;

import java.util.ArrayList;
import java.util.List;

public class Soru01 {
    public static void main(String[] args) {
        ////uzunlugu bir ve birden buyuk olan int arrayde
        // ilk ve son index i birbirine esitse true veren methotu yaziniz
        //
        //        int nums2[] = {1, 2, 3, 1};
        //        int nums3[] = {1, 2, 1};
        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 1};
        int nums3[] = {1, 2, 1};
        System.out.println(esitMi(nums1));
        System.out.println(esitMi(nums2));
        System.out.println(esitMi(nums3));

    }

    public static boolean esitMi(int [] arr) {
        boolean sonuc=false;
     if (arr.length<1)
         sonuc=false;
     if (arr.length>=1)
     if (arr[0]==arr[arr.length-1]){
sonuc=true;
       }else
           sonuc=false;

        return true;
    }
}
