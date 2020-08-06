package com.company;

public class Cola {
    Nodo inicio;
    Nodo fin;
    int tamano;

    public Cola(){
        inicio=null;
        fin=null;
        tamano=0;
    }

    public boolean estaVacio(){
        if(inicio==null && fin==null){
            return true;
        }else {
            return false;
        }
    }

    public void encolar(Object obj){
        Nodo nodo = new Nodo(obj);
        if(estaVacio()){
            inicio=nodo;
            fin=nodo;
        }else{
            fin.setSiguiente(nodo);
            fin=nodo;
        }
        tamano++;
    }

    public Object eliminar(){
        Object aux = inicio.getValor();
        inicio = inicio.getSiguiente();
        tamano--;
        return aux;
    }

    public Object getCabeza(){
        return inicio.getValor();
    }

    public int getTamano() {
        return tamano;
    }

    public void mostrarCola(){
        Nodo aux= inicio;

        while (aux!=null){
            System.out.println(aux.getValor());
            aux=aux.getSiguiente();
        }
    }
}
