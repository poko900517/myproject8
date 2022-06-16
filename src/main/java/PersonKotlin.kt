package com.lemon

class PersonKotlin {
    //fun後面是方法
    fun greeting(){
        print("Hello Kotlin")
    }
}

//1st level
fun main(){
    val p = PersonKotlin()
    p.greeting()
}