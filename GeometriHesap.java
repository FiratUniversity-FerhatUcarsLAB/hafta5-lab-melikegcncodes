/*
 * Ad Soyad: Melike Gücin
 * Ogrenci No: 240541081
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 *
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        double kareAlani = side * side;

        return kareAlani; // Degistirin
    }

    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double a) {
        // Cevre = 4 * kenar
        double kareCevresi = 4 * a;
        return kareCevresi; // Degistirin
    }

    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        double dikdortgenAlani = width * height;
        return dikdortgenAlani; // Degistirin
    }

    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        double dikdortgenCevresi = 2 * (width + height);
        return dikdortgenCevresi; // Degistirin
    }

    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz
        double daireAlani = Math.PI * radius * radius;
        return daireAlani; // Degistirin
    }

    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        double daireCevresi = 2 * Math.PI * radius;
        return daireCevresi; // Degistirin
    }

    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        double ucgenAlani = (base * height) / 2;
        return ucgenAlani; // Degistirin
    }

    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        double ucgenCevresi = (a + b + c);
        return ucgenCevresi; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();

        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();

        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();

        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();

        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yükseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("Kenar1 (cm): ");
        double side1 = input.nextDouble();
        System.out.print("Kenar2 (cm): ");
        double side2 = input.nextDouble();
        System.out.print("Kenar3 (cm): ");
        double side3 = input.nextDouble();


        // HESAPLAMALARI YAP - Metotlari cagir











        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        // Alan ve cevre yazdir
        System.out.printf("  Alan   : %.2f cm²\n" , calculateSquareArea(squareSide));
        System.out.printf("  Cevre  : %.2f cm\n" , calculateSquarePerimeter(squareSide));


        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        // Alan ve cevre yazdir
        System.out.printf("  Alan  : %.2f cm²\n" , calculateRectangleArea(rectWidth, rectHeight));
        System.out.printf(" Cevre  : %.2f cm\n" ,  calculateRectanglePerimeter(rectWidth, rectHeight));


        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        // Alan ve cevre yazdir
        System.out.printf(" Alan  : %.2f cm²\n" , calculateCircleArea(radius));
        System.out.printf(" Cevre : %.2f cm\n" , calculateCircleCircumference(radius));


        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        // Alan ve cevre yazdir
        System.out.printf("  Alan : %.2f cm²\n" ,  calculateTriangleArea(base, height));
        System.out.printf("  Cevre: %.2f cm\n" , calculateTrianglePerimeter(side1, side2, side3));

        System.out.println("========================================");

        input.close();
    }
}
