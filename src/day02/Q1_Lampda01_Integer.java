package day02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_Lampda01_Integer {
    public static void main(String[] args) {
        /*
        Skip () bize eleman atlamayi saglar ara islemdir
         veriable olarak long alir ornegin skip(3)ilk 3 elemani atlar

 */

/*
    Limit
Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
 sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
 Stream içerisinde dönen çok sayıda veri var
ancak sen bize şu kadarını göster diyoruz.
     */

 /*
     AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.
     */

/*
    AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
 bu şarta uyması durumunda true dönecektir.

     */

 /*
NoneMatch: Şarta göre Stream içindeki hiç bir
 elemanın şartı sağlamaması durumunda true dönecektir.
     */
        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(-8);
        list.add(-2);
        list.add(-12);
        list.add(0);
        list.add(1);
        list.add(12);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(8);

        yazlist(list);
        System.out.println();
        negYaz(list);
        System.out.println();
        System.out.println( pozList(list));
        System.out.println();
        System.out.println(kareList(list));
        System.out.println();
        System.out.println("kareTekrarsiz " + kareTekrarsiz(list));
        System.out.println();
        kucuktenBuyuge(list);
        System.out.println();
        buyuktenKucuge(list);
        System.out.println("kupBirlerBas(list) = " + kupBirlerBas(list));
        System.out.println("kupBirlerBasBesOlmayan = " + kupBirlerBasBesOlmayan(list));
        System.out.println("elemanTop(list) = " + elemanTop(list));
        System.out.println("negKare(list) = " + negKare(list));
        System.out.println("bestenBuyukVarMi = " + bestenBuyukVarMi(list));
        System.out.println("sifirdanKucukMu = " + sifirdanKucukMu(list));
        System.out.println("yuzeEsitYok(list)=" + yuzeEsitYok(list));
        System.out.println("sifiraEsitYok = " + sifiraEsitYok(list));
        System.out.println("ilkBesElTop = " + ilkBesElTop(list));
        System.out.println("sonBesElTop = " + sonBesElTop(list));


    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz
    public static void yazlist(List<Integer>l){
        l.stream().forEach(t-> System.out.print(t+" "));
    }
    //S2: sadece negatif olanlari yazdir
    public static void negYaz(List<Integer>l){
        l.stream().filter(t->t<0).forEach(t-> System.out.print(t+" "));
    }
    //S3: pozitif olanlardan yeni bir liste olustur
    public static List<Integer> pozList(List<Integer>l){
        return l.stream().filter(t->t>0).collect(Collectors.toList());
    }
    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static List<Integer> kareList(List<Integer>l){
        return l.stream().map(t->t*t).collect(Collectors.toList());
    }
    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    public static List<Integer> kareTekrarsiz(List<Integer>l){
        return l.stream().map(t->t*t).distinct().collect(Collectors.toList());
    }
    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void kucuktenBuyuge(List<Integer>l){
        l.stream().sorted().forEach(t-> System.out.print(t+" "));
    }
    //S7: listin elemanlarini buyukten kucuge siralayalim
    public static void buyuktenKucuge(List<Integer>l){
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));

    }
    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlarin listesi
    public static List<Integer> kupBirlerBas(List<Integer>l){
        return l.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }
    //S9: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olmayan
    public static List<Integer> kupBirlerBasBesOlmayan(List<Integer>l) {
        return l.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
    }
        // S10 :list elemanlarini toplamini bulalim
    public static int elemanTop(List<Integer>l){
        return l.stream().reduce(0,(x,y)->x+y);
    }
    // S11 : peek ornegi cozelim
    public static List<Integer> negKare(List<Integer>l){
        return l.stream().filter(t->t<0).peek(t-> System.out.print("negatif sayi: " + t)).
                map(t->t*t).peek(t-> System.out.println(" karesi : " +t)).
                collect(Collectors.toList());
    }
    // S12 : listeden 5 den buyuk  sayi var mi
    public static boolean bestenBuyukVarMi(List<Integer>l){
        return l.stream().anyMatch(t->t>0);
    }
    // S13 : listin tum elemanlari sifirdan kucukmu
    public static boolean sifirdanKucukMu(List<Integer>l){
        return l.stream().allMatch(t->t<0);
    }
    // S14: listin 100 e esit elemani yok
    public static boolean yuzeEsitYok(List<Integer>l){
        return l.stream().noneMatch(t->t==100);
    }
    // S15: listin sifira esit elemani yok
    public static boolean sifiraEsitYok(List<Integer>l){
        return l.stream().noneMatch(t->t==0);
    }
    // S16 : limit
    // listenin ilk 5 elemanini topla
    public static int ilkBesElTop(List<Integer>l){
       return l.stream().limit(5).reduce(0,(x,y)->x+y);
    }
    //S17: skip
    //dizinin son bes elemaninin  listele
    public static long sonBesElTop(List<Integer>l){
        long n=l.size()-5;
        return l.stream().skip(n).reduce(0,(x,y)->x+y);
    }
}
