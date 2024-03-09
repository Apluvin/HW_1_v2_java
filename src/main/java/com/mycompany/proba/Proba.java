/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proba;
import java.util.Scanner;

/**
 *
 * @author Jginyue B760M
 */
public class Proba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Балковский Александр, РИБО-02-22, вариант 2");

        System.out.print("Введите название производителя телефона: ");
        String inputManufacturer = scanner.nextLine();
        
        System.out.print("Версия телефона: ");
        String inputVersion = scanner.nextLine();

        Telephone phone = new Telephone(inputManufacturer,inputVersion);
        Salesperson salesperson = new Salesperson();
        salesperson.modify(phone);

        System.out.println("Название производителя телефона: " + phone.manufacturer + ", версия: " + phone.version);
    }
}
