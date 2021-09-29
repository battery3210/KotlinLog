package jp.techacademy.azuma.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// パッケージレベルに定義した関数
fun formatMyTag(): String {
    return "[" + MY_TAG + "]"
}

// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ",3)
        val human = Human("坂元",50, "映画")
        val human_new = Human("岡本",24, "野球")

        human.think()
        human.say()
        human_new.think()
        human_new.say()
        dog.move()
        dog.say()
        Log.d("kotlintest22","犬の名前は" + dog.name + "です")
        Log.d("kotlintest22","犬の年齢は" + dog.age + "です")

        val bigdog = BigDog("ヨーゼフ",15)
        bigdog.say()
        Log.d("kotlintest23","犬の名前は" + bigdog.name + "です")
        Log.d("kotlintest23","犬の年齢は" + bigdog.age + "です")

        Dog.introduce()
        Log.d("kotlintest24",Dog.to_jp + "のクラス変数です。")

        Log.d(MY_TAG,bigdog.name + "(" + bigdog.age + "歳)" + "ワンワン2")

        Log.d("kotlintest","ログへの出力テスト")

        //整数型の変数をnumという名前で作成して10を代入する
        var num = 10
        Log.d("kotlintest2",Integer.toString(num))

        //numに50を代入する
        //変数や定数に.toString()と記述する方法もある
        num = 50
        Log.d("kotlintest3",num.toString())

        val num1 = 10+5-2*4/2
        Log.d("kotlintest4","10+5-2*4/2 " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest5","flag1&&flag2 = " + (flag1 && flag2))
        Log.d("kotlintest6","flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest7","num2<num3 = " + (num2<num3))

        num = 30
        if(num >=90){
            Log.d("kotlintest8","優")
        } else if(num >= 75){
            Log.d("kotlintest9","良")
        }else if(num >= 60){
            Log.d("kotlintest10","可")
        }else{
            Log.d("kotlintest11","不可")
        }

        val drink = 2
        when (drink){
                0 -> {
                    Log.d("kotlintest12","コーヒーを注文しました")
                }
                1 -> Log.d("kotlintest12","紅茶を注文しました")
                2 -> Log.d("kotlintest12","MILKを注文しました")
                else -> Log.d("kotlintest12","オーダーミスです")
        }

        val message = when (drink){

            0 -> "コーヒーを注文しました"
            1 -> "紅茶を注文しました"
            2 -> "MILKを注文しました"
            else -> "オーダーミスです"
        }

        Log.d("kotlintest13",message)

        var num_a = 0
        while(num_a<10){
            Log.d("kotlintest14",Integer.toString(num_a))
            num_a++
        }

        for (i in 1 until 6){
            Log.d("kotlintest15","for文の" + i + "回目")
        }

        var num_b = 1
        while(num_b < 6){
            Log.d("kotlintest16","while文の"+num_b+"回目")
            num_b++
        }

        //array<Int>型の配列が形成される
        val points  = arrayOf(10,6,15,23,17)

        for(i in points){
            Log.d("kotlintest17",i.toString())
        }


       for(i in points.indices){
           Log.d("kotlintest18",points[i].toString())
       }

        val numA = 100
        val numB = 0
        var ans = 0

        try{
            ans = numA/numB
        } catch (e : Exception){
            Log.d("kotlintest19","0で割ろうとしました")
            //例外情報からメッセージを表示
            Log.d("kotlintest20",e.message.toString())
        }finally{
            Log.d("kotlintest20","ans = " +ans.toString())
        }


        //total(50,1000)

        //total(1,1111)
        val t = total(50,1000) //ここでtotalからsumを返してもらう
        Log.d("kotlintest21",t.toString())

        val str31 = "Hello"
        val length = str31.length
        Log.d("kotlintestString",length.toString())

        val str4 = "100"
        val num4 = str4.toInt()
        Log.d("kotlintestSt2",num4.toString())

        val str1 = "Hello"
        val str2 = "world"
        val str3 = "Hello"

        if (str1.equals(str2)){
            Log.d("kotlintestSt3","str1とstr2は同じです。")
        }else{
            Log.d("kotlintestSt3","str1とstr2は違います。")
        }

        if(str1.equals(str3)){
            Log.d("kotlintestSt4","str1とstr3は同じです。")
        }else{
            Log.d("kotlintestSt4","str1とstr3は別です。")
        }

        val i = 100
        val strhund = i.toString() + "* 100 = $[i * 100]"
        Log.d("kotlintestSt165",strhund)

        val str22: String? = "kotlin"
        if(str22!=null){
            Log.d("kotlintest22",str22.length.toString())
        }

        var str23: String? = null
        if(str23?.length == null){
            Log.d("kotlintest23","結果はnull")
        }else{
            Log.d("kotlintest23","結果は" + str23.length)
        }


        var str: String? = "kotlin"
        Log.d("kotlintestSt165","str.lengthの結果は" + str!!.length)



    }




    private fun total(first: Int,last: Int): Int{
        var sum = 0
        for(i in first..last){
            sum += i
        }

        return sum
    }
}


