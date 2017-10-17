package com.example.khalifa.kotlin01

/**
 * Created by khalifa on 10/10/17.
 */
fun main(args: Array<String>) {
    for(x in 1..5) {
        for (y in 4 downTo x){
            print(" ")
        }
        for (z in 1..x){
            print("*")
        }
        println()
    }

}