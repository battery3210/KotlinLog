package jp.techacademy.azuma.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    var hobby: String
    //var hobby: String? = null


    constructor(name: String, age: Int, hobby: String): super(name,age){
        this.hobby = hobby
    }

    //Animalクラスのメソッドをoverride
    override fun say(){
        Log.d("kotlintestHuman","私の名前は" + this.name + "です。年は" + this.age + "歳です。" )
    }

    //Thinkableインターフェースのメソッドをoverride
    override fun think(){
        Log.d("kotlintestthink","私は" + this.hobby + "について考える。")
    }



}