/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author jvm
 */
public class ReaderCreator {
    public Reader returnNewReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Добавление новой читателя-----");
        Reader reader = new Reader();
        System.out.println("Идентификатор  читателя (целое число):");
        reader.setId(scanner.nextLong());
        System.out.println("Имя читателя:");
        reader.setName(scanner.nextLine());
        System.out.println("Фамилия читателя:");
        reader.setSurname(scanner.nextLine());
        System.out.println("Телефон:");
        reader.setPhone(scanner.nextLine());
        System.out.println("Город проживания читателя:");
        reader.setCity(scanner.nextLine());
        return reader;
    }
}
