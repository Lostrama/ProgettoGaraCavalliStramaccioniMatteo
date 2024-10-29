/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garacavalli1;

/**
 *
 * @author Strafamily
 */
import java.util.Random;

class Cavallo implements Runnable {
private String nome;
private int lunghezzaPercorso;
private int metriPercorsi;
private static final Random random = new Random();
public Cavallo(String nome, int lunghezzaPercorso) {
this.nome = nome;
this.lunghezzaPercorso = lunghezzaPercorso;
this.metriPercorsi = 0;
}
@Override
public void run() {
// 4. Corsa fino al completamento del percorso
while (metriPercorsi < lunghezzaPercorso) {
try {
// Ogni cavallo avanza di un passo casuale tra 1 e 10 metri
int passo = random.nextInt(10) + 1;
metriPercorsi += passo;
// Evita di superare la lunghezza del percorso

if (metriPercorsi > lunghezzaPercorso) {
metriPercorsi = lunghezzaPercorso;
}
// 5. Visualizzazione dell'avanzamento in console
System.out.println(nome + " ha percorso " + metriPercorsi + " metri.");
// Pausa per simulare il tempo tra i passi
Thread.sleep(500);
} catch (InterruptedException e) {
System.out.println(nome + " è stato interrotto!");
}
}
System.out.println(nome + " ha completato la gara!");
}
}