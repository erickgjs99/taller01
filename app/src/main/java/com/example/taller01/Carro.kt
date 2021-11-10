package com.example.taller01

class Carro (val modelo: String, val anio: String, val motor: String, val marca: String){



    fun imprime(){
        for(i in marca){
            println("La marca del auto es:"+marca)
        }
    }
}