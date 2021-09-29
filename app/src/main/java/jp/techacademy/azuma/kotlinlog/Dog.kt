package jp.techacademy.azuma.kotlinlog

import android.util.Log

open class Dog: Animal, Movable{


    //コンパニオンオブジェクト
    companion object{
        val to_jp = "犬"

        fun introduce(){
            Log.d("kotlintest","これは犬クラスです。")
        }
    }


    constructor(name: String, age: Int): super(name,age){

    }

    //Animalクラスのメソッドをoverride
    override fun say(){
        Log.d("kotlintest22",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //Movableインターフェースのメソッドをoverride
    override fun move(){
        Log.d("kotlintestmove",this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }





}