package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class guardaroupa {

    Integer dicionario = 0;
    Map<Integer, Roupa> mapaDeRoupa = new HashMap<>();



    public Integer guardarRoupas(List<Roupa> listaDeRoupas){
        for (int i = 0;i < listaDeRoupas.size(); i++){
            Roupa a = listaDeRoupas.get(i);
            mapaDeRoupa.put(dicionario, a);
        }
        return this.dicionario++;

    }
    public  void monstraRoupa(){

    }
    public List<Roupa> devolverRoupas(Integer numero){
        List<Roupa> devolucao = null;
       for (Integer i = 0; i < mapaDeRoupa.size(); i++){
           mapaDeRoupa.get(numero);
           System.out.println(mapaDeRoupa.containsKey(i));
           if (numero.equals(mapaDeRoupa.keySet())){
               devolucao = (List<Roupa>) mapaDeRoupa.get(numero);
           }
        }
        System.out.println("teste");
        System.out.println(devolucao);
        return devolucao;

        
    }

}
