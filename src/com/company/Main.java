package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// coleciones

        //arreglos en java
        /*String universidades [];
        universidades = new String[5];
        //declaracion de arreglo en una sola linea
        String universidades [] = new String[5];
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UADM";
        universidades[3] = "UNAM";
        universidades[4] = "UPN";
        /*universidades[5] = "IPN";
        universidades[6] = "TESCO";

        //for each en java
        for (String universidad: universidades){
            System.out.println(universidad);
        }

        //colecciones
        Set<String> frutas = new HashSet<>(3);
        //dar valor 3 indica que reserve espacio de memoria para almenos 3 datos
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        //caracteristicas:
        // - No puede contener elementos duplicados
        // - Almacena elementos en una tabla de hash, pero no guarda un orden especifico de los elementos

        for (String fruta: frutas){
            System.out.println(fruta);
        }

        System.out.println("\nTreeset\n");

        Set<String> Frutas = new TreeSet<>();
        Frutas.add("Mango");
        Frutas.add("Fresa");
        Frutas.add("Pera");
        Frutas.add("Uva");

        for (String frutotas: Frutas){
            System.out.println(frutotas);
        }

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(12);
        numeros.add(5);

        for (int numero: numeros){
            System.out.println(numero);
        }

        System.out.println("\nLinkedHashSet\n");

        Set<String> Frutitas = new LinkedHashSet<>();
        Frutitas.add("Mango");
        Frutitas.add("Fresa");
        Frutitas.add("Pera");
        Frutitas.add("Uva");

        for (String frutos: Frutitas){
            System.out.println(frutos);
        }

        //prueba de rendimiento de los tipos de colecciones tipo SET

        System.out.println("Carlos Chavarria - Ya se quemó la compu de tan veloz");

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));*/

        // -------------- coleciones tipo list ------------------
        /*System.out.println("\nCollection ArrayList\n");
        List<String> frutas2 = new ArrayList<>();
        // List si permite tener elementos duplicados
        // Brinda métodos adicionales como el de busqueda
        // es menos eficiente
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Uva");

        for (String fruta2 : frutas2) {
            System.out.println(fruta2);
        }

        //imprimiendo un valor especifico
        System.out.println("valor obtenido : " + frutas2.get(3));

        //obteniendo un valor por indice buscandolo por valor
        int indice = frutas2.indexOf("Fresa");
        System.out.println(frutas2.get(indice));

        // -------------- coleciones tipo Linkedlist ------------------
        System.out.println("\nCollection LinkedList\n");
        List<String> frutas3 = new LinkedList<>();
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Uva");

        for (String fruta3 : frutas3) {
            System.out.println(fruta3);
        }*/

        // ----------------- MAP --------------------
        Map<Integer,String> universidades = new HashMap<>();
        //Asocia claves con valores, similar a SQL, no puede haber una clave repetida.
        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(5, "TESCO");

        System.out.println(universidades.get(3));
        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }
    }
}
