package com;


import java.util.Arrays;


public class Main {


    public static void main(String[] args) {


    }


    public static int[] hesapla(int[] x) {
        int[] atanacakDizi = new int[x.length];
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = 0;

            for (int j = 0; j < i + 1; j++) {

                sum += x[j];

                atanacakDizi[i] = sum;


            }

        }
        for (int a : atanacakDizi) {
            System.out.println(a);
        }
        System.out.println(atanacakDizi);
        return atanacakDizi;
    }

    public static String karesiMi(int sayi) {

        boolean kontrol = false;

        for (int i = 0; i < sayi; i++) {

            for (int j = 0; j < sayi; j++) {

                if (Math.pow(i, 2) + Math.pow(j, 2) == sayi) {
                    kontrol = true;
                    break;
                }

            }
        }

        if (kontrol) {
            System.out.println("karesidir.");
            return "karesidir";
        } else {
            System.out.println("karesi değildir.");
            return "karesi değildir";
        }


    }

    public static String ussuMu(int sayi) {

        int bolunecek = 0;
        for (int i = 3; i < sayi; ) {


            i *= 3;

            bolunecek = i;


        }

        if (sayi / bolunecek == 1) {
            System.out.println("3'ün karesidir");
        } else {
            System.out.println("karesi değildir.");
        }
        return "deneme";
    }


    public int romanToInt(String s) {

        int toplam = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'Y':
                    toplam += 1;
                    break;
                case 'V':
                    toplam += 5;
                    break;
                case 'X':
                    toplam += 10;
                    break;
                case 'L':
                    toplam += 50;
                    break;
                case 'C':
                    toplam += 100;
                    break;
                case 'D':
                    toplam += 500;
                    break;
                case 'M':
                    toplam += 1000;
                    break;
            }
        }
        return 54;
    }

    public static String fazlaKelime(String kelime, String kelime2) {
        char[] characters = kelime.toCharArray();
        char[] characters2 = kelime2.toCharArray();
        String dondurulecekHarf = null;
        Arrays.sort(characters);
        Arrays.sort(characters2);


        for (int i = 0; i < characters2.length; i++) {

            if (i < characters.length) {


                if (characters2[i] != characters[i]) {
                    dondurulecekHarf = String.valueOf(characters2[i]);
                    break;


                }
            } else {
                dondurulecekHarf = String.valueOf(characters2[i]);
                break;
            }
        }

        System.out.println(dondurulecekHarf);
        return dondurulecekHarf;

    }

    public static int islem(int sayi) {

        int toplam = 0;
        int carpim = 1;

        while (sayi > 0) {

            toplam += sayi % 10;
            carpim *= sayi % 10;

            sayi /= 10;


        }


        return carpim - toplam;
    }

    public static int lengthOfLongestSubstring(String s) {


        String sadelesmisKelime = "";

        System.out.println("Kelimenin normal hali: " + s);

        sadelesmisKelime += s.charAt(0);

        boolean kontrol = true;

        for (int i = 0; i < s.length(); i++) {


            for (int j = 0; j < sadelesmisKelime.length(); j++)


                if (s.charAt(i) == sadelesmisKelime.charAt(j)) {
                    break;

                } else if (j == sadelesmisKelime.length() - 1) {
                    sadelesmisKelime += s.charAt(i);

                }


        }


        System.out.println(sadelesmisKelime);
        return sadelesmisKelime.length();
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];
        double sonuc = 0;

        for (int i = 0; i < mergedArray.length; i++) {

            if (i < nums1.length) {
                mergedArray[i] = nums1[i];
            } else {
                mergedArray[i] = nums2[i - nums1.length];
            }
        }

        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0) {
            sonuc = mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1];
            sonuc /= 2;
        } else {
            sonuc = mergedArray[mergedArray.length / 2];
        }


        System.out.println(sonuc);

        return sonuc;
    }

    public static int reverse(int x) {

        String a = "";
        if (x != 0) {


            int negative = 1;
            if (x < 0) {
                x *= -1;
                negative = -1;

            }

            while (x > 0) {

                a += String.valueOf(x % 10);
                x /= 10;

            }

            try {
                int sayi = Integer.parseInt(a);
                sayi *= negative;
                return sayi;
            } catch (Exception e) {
                return 0;
            }


        } else {
            return x;
        }

    }

    public static String fazlaHarfBul(String kelime1, String kelime2) {
        char[] chars = kelime1.toCharArray();
        char[] chars1 = kelime2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        String donecekHarf = "";

        for (int i = 0; i < kelime2.length(); i++) {

            if (i < chars.length) {


                if (chars[i] != chars1[i]) {
                    donecekHarf = String.valueOf(chars1[i]);
                    break;
                }

            } else {
                donecekHarf = String.valueOf(chars1[i]);
                break;
            }

        }


        System.out.println(donecekHarf);
        return donecekHarf;
    }

}
