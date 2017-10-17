package com.example.khalifa.kotlin01

/**
 * Created by khalifa on 02/10/17.
 */
fun main (args:Array<String>){
    println("-------Kalkulator--------")
    println("enter n1:")
    var n1:Float= readLine()!!.toFloat()
    println("enter n2:")
    val n2:Float= readLine()!!.toFloat()
    var sum: Float?
    sum=n1+n2
    print("Sum:" + sum)
}