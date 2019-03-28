package com.example.aclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user1= User("rami",34023)
        var user2= User("rami",34023)

        var user_msg: String

        if (user1==user2)
            user_msg = "Both User are Equal"
        else
            user_msg = "Both User are Different"

        btn.setOnClickListener { tv.text =  user_msg}


    }
}
data class User (var name:String, var id:Int){

}
