package com.example.khalifa.kotlin01

/**
 * Created by khalifa on 02/10/17.
 */
fun main(args:Array<String>){
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

//proses
    var year=2017
    var Age:Int?
    Age=year-DOB

    println("your age is $Age years")
}