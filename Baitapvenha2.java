import java.util.Scanner;

public class Baitapvenha2 {
    public static String solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Phuong trinh vo so nghiem";
            }
            else {
                return "Phuong trinh vo nghiem";
            }
        } else {
            double x = -b / a;
            return "Phuong trinh co mot nghiem x = " + x;
        }
    }
    public static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return solveLinearEquation(b, c);
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phuong trinh co hai nghiem phan biet: x1 = " + x1 + " va x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phuong trinh co nghiem kep: x = " + x;
        } else {
            return "Phuong trinh vo nghiem thuc";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0) {
            System.out.println(solveLinearEquation(b, c));
        } else {
            System.out.println(solveQuadraticEquation(a, b, c));
        }
        scanner.close();
    }
}
