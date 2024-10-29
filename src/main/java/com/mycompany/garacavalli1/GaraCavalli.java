/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garacavalli1;

/**
 *
 * @author Strafamily
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GaraCavalli {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// 1. Inserimento della lunghezza del percorso
System.out.print("Inserisci la lunghezza del percorso in metri: ");
int lunghezzaPercorso = scanner.nextInt();
scanner.nextLine(); // Pulisce il buffer
// 2. Inserimento del numero e dei nomi dei cavalli
System.out.print("Inserisci il numero di cavalli: ");
int numeroCavalli = scanner.nextInt();
scanner.nextLine(); // Pulisce il buffer
// Creazione della lista di cavalli
List<Cavallo> cavalli = new ArrayList<>();
for (int i = 1; i <= numeroCavalli; i++) {
System.out.print("Inserisci il nome del cavallo " + i + ": ");
String nome = scanner.nextLine();
cavalli.add(new Cavallo(nome, lunghezzaPercorso));
}
System.out.println("La gara sta per iniziare!");
// 3. Partenza di tutti i cavalli
for (Cavallo cavallo : cavalli) {
new Thread(cavallo).start();
}
scanner.close();
}
}
