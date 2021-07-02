package com.beermug

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


}


//Abrindo a tela de Login após 5 segundos
//        Handler(Looper.getMainLooper()).postDelayed({
//            //Iniciar a intent
//            val mIntent = Intent(this, MainActivity::class.java)
//            startActivity(mIntent)
//            finish()
//        }, 5000)
//}