package com.example.shaaji.ipv4

fun main(args: Array<String>){

val ctet1 = 192
val octet2 = 168
val octet3 = 1
val octet4 = 100
val cdir = 24

 val ipv4basic = IPv4(octet1, octet2, octet3, octet4, cdir)
 
 println("The subnet Mask is ${ipv4basic.getMask()}")
 
 println("The Wild Card is ${ipv4basic.getWildCard()}")
 
 println("The Binary Representation is ${ipv4basic.getBinary()}")


}
