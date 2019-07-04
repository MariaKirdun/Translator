package com.manya.translator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(FRAME_CONTAINER, MainFragment())
            .commit()
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.learnWordsButton -> replaceFragment(WordFragment())
            R.id.quizButton -> replaceFragment(QuizFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(FRAME_CONTAINER, fragment)
            .addToBackStack(null)
            .commit()
    }


    companion object {
        private const val FRAME_CONTAINER = R.id.fragmentContainer
    }

}
