package ProgramTriangulo.ProgramProduct;

import java.util.Locale;
import java.util.Scanner;

public class mainProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.setName(sc.nextLine());
        System.out.print("Price: ");
        product.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n",product.getName(), product.getPrice(),product.getQuantity(), product.totalValueInStock());

        System.out.print("Enter the number of product to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n",product.getName(), product.getPrice(),product.getQuantity(), product.totalValueInStock());

        System.out.print("Enter the number of product to be removed from stock: ");
        product.removerProducts(sc.nextInt());

        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n",product.getName(), product.getPrice(),product.getQuantity(), product.totalValueInStock());

        sc.close();
    }
}
