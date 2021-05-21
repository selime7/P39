package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Q2_Lampda02_String {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        System.out.println("dcBas= " + dcBas(list));
        yildizliYaz(list);
        System.out.println("yildizliYaz1 = " + yildizliYaz1(list));
        System.out.println("alfabedik = " + alfabedik(list));
        lSil(list);
        System.out.println("eLiListe = " + eLiListe(list));
        ucTekrar(list);
        ilkHarfBuyuk(list);
        System.out.println("uzunluk46 = " + uzunluk46(list));
    }

//=============================================
// S1: ilk harfi d ve ya c olanlari listeleyelim
    public static List<String> dcBas(List<String>l){
        return l.stream().filter(t->t.toUpperCase().startsWith("D")||t.toUpperCase().startsWith("C")).collect(Collectors.toList());
    }
//S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizliYaz(List<String>l){
         l.stream().map(t->"*"+t+"*").forEach(t-> System.out.println(t));
    }
    public static List<String> yildizliYaz1(List<String>l){
       return l.stream().map(t->"*"+t+"*").collect(Collectors.toList());
    }

//S3: alfabedik gore siralayalim list olarak
    public static List<String> alfabedik (List<String>l){
        return l.stream().map(t->t.toUpperCase()).sorted().collect(Collectors.toList());
    }

//S4: tum 'l' leri silelim yazdiralim
    public static void lSil (List<String>l){
        l.stream().map(t->t.replaceAll("l","")).forEach(t-> System.out.println(t));
    }

//S5 : icinde e olanlardan yeni bir list olusturunuz
    public static List<String> eLiListe(List<String>l){
        return l.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }
// S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public static void ucTekrar (List<String>l){
        l.stream().map(t->t.substring(0,1)+t.substring(0,1)+t).forEach(t-> System.out.println(t));
    }

// S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public static void ilkHarfBuyuk (List<String>l){
        l.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t-> System.out.println(t));
    }
// S8: uzunlugu 4 ve 6 olanlar haric bir dizi olusturunuz
    public static List<String> uzunluk46(List<String>l){
        return l.stream().filter(t->t.length()!=4&t.length()!=6).collect(Collectors.toList());
    }
}
