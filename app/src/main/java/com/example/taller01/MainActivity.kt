package com.example.taller01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
        fun main() {
            /*
            *Ejercicio 1
            */
            mayorEdad()
            /*
            *Ejercicio 2
            */
            tablaMultiplicar()
            /*
            *Ejercicio 3
            */
            listadoOrdenado()
            /*
           *Ejercicio 4
           */
            ejercicioCarro()
            /*
            Ordenar una lista manualmente
             */
            ordenarLista()
            /*
            Validar si una cedula es legitima
            */
            certificarCedula()
        }

    private fun listadoOrdenado() {
        val listadoEstudiantes = arrayListOf<String>()
        listadoEstudiantes.addAll(listOf("JOAN MANUEL BRICEÑO QUILAMBAQUI", "JEFERSON EDUARDO CUEVA REATIGUI","JORDY DAVID ESPARZA RIVERA",
            "RICARDO ISRAEL FREIRE CARRION", "SANTIAGO DAVID GARCIA JAEN", "EDGAR FABIAN GUAMO MOROCHO",
            "ERICK GONZALO JARAMILLO SOTO", "DANIEL MARCELO MEDINA OJEDA", "IAN CARLOS ORTEGA LEON",
            "DAVID ANDRES PILLCO YARUQUI", "LUIS FERNANDO QUIZHPE ESPINOSA","SHOMIRA NATALY ROSALES ALBERCA",
            "DAVID ALEXANDER SALAZAR SOLORZANO \n"))
        println(listadoEstudiantes)

        listadoEstudiantes.sort()
        println(listadoEstudiantes)
    }

    private fun tablaMultiplicar() {
        val factor = 7
        for(i in 0..10){
            println("$factor * $i = ${factor*i}")
        }
        println("\n")
        for(i in 10 downTo(0)){
            println("$factor * $i = ${factor*i}")
        }
    }

    private fun mayorEdad() {
        for(i in 15..30){
            if(i >= 18){
                println("$i Es mayor de edad")
            }else{
                println("$i Es menor de edad")
            }
        }
    }

    private fun ejercicioCarro(){
        val carro01 = Carro(modelo = "Versa", anio = "2012", motor = "1.6", marca = "Nissan")
        print(carro01.motor)
        carro01.imprime()
    }


    private fun ordenarLista(){
        val listaNumerosTexto = arrayOf<Int>(2,14,27,34,21,5,2,96,45,21,56,42)
        val cantidad = listaNumerosTexto.size
        val listaNumeros=IntArray(cantidad)

        for (i in (0 until cantidad)){
            listaNumeros[i]=listaNumerosTexto[i].toInt()
        }
        var temporal = 0
        for(i in (0 until cantidad-1)){
            for(j in (0 until cantidad-1)){
                if(listaNumeros[j]>listaNumeros[j+1]){
                    temporal=listaNumeros[j]
                    listaNumeros[j]=listaNumeros[j+1]
                    listaNumeros[j+1]=temporal
                }
            }
        }
        for (i in (0 until cantidad)){
            println(listaNumeros[i])
        }
    }

    private fun certificarCedula() {
        val cedulaErick = "1104401078"
        var multiplicarResultados = 0
        var cadenaResultado = ""
        var sumarResultadosSuma = 0
        var superior = 0
        val listaMultiplicar = arrayListOf(2,1,2,1,2,1,2,1,2)
        val sumarListaCedula = arrayListOf<Int>()
        val listaCedula = arrayListOf<Int>()
        val resultadosSuma = arrayListOf<Int>()


        for (i in cedulaErick){
            listaCedula.add(Character.getNumericValue(i))
        }


        for (i in 0 until listaMultiplicar.size){
            multiplicarResultados = listaCedula[i] * listaMultiplicar[i]
            if (multiplicarResultados >= 10){
                cadenaResultado = multiplicarResultados.toString()
                resultadosSuma.add(Character.getNumericValue(cadenaResultado[0])+
                        Character.getNumericValue(cadenaResultado[1]))
            }else{
                resultadosSuma.add(multiplicarResultados)
            }
        }
        sumarResultadosSuma = resultadosSuma.sum()
        superior = sumarResultadosSuma - (sumarResultadosSuma % 10) + 10;


        if((superior-sumarResultadosSuma) == listaCedula.last()){
            println("La cedula $cedulaErick es válida")
        }else{
            println("La cedula $cedulaErick es inválida")
        }

    }

}