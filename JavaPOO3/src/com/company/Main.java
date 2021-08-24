package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Roupa roupa1 = new Roupa();
        roupa1.marca = "Nike";
        roupa1.modelo ="meia";
        Roupa roupa2 = new Roupa();
        roupa2.marca = "Adidas";
        roupa2.modelo = "Camisa";

        List<Roupa> listaDeRoupas  = new ArrayList<>();
        listaDeRoupas.add(roupa1);
        listaDeRoupas.add(roupa2);

        guardaroupa guardaRoupaLoja = new guardaroupa();
        guardaRoupaLoja.guardarRoupas(listaDeRoupas);
        guardaRoupaLoja.guardarRoupas(listaDeRoupas);
        guardaRoupaLoja.guardarRoupas(listaDeRoupas);
        System.out.println(guardaRoupaLoja.mapaDeRoupa);
        guardaRoupaLoja.devolverRoupas(1);

    }
}
