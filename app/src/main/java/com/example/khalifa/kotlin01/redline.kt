package com.example.khalifa.kotlin01

/**
 * Created by khalifa on 30/09/17.
 */
fun main(array: Array<String>){
    print("Masukkan nama : ")
    var name = readLine()
    print("masukkan umur : ")
    var age = readLine()!!.toInt()
    print("masukkan department : ")
    var department:String?
    department= readLine()
    println("name:" + name)
    println("age:" + age)
    println("department:" + department)
    val pi:Double=3.4
    println("pi:" + pi)

}