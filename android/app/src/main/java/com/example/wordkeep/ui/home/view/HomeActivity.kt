package com.example.wordkeep.ui.home.view

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.wordkeep.R

class HomeActivity : AppCompatActivity() {

    private lateinit var etWordList: EditText
    private lateinit var btnSaveList: AppCompatButton
    private lateinit var btnCancelSave: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        initViews()
        initButtons()
    }

    /** Ініціалізація всіх елементів інтерфейсу **/
    private fun initViews() {
        etWordList = findViewById(R.id.et_word_list)
        btnSaveList = findViewById(R.id.btn_save_list)
        btnCancelSave = findViewById(R.id.btn_cancel_save)
    }

    /** Ініціалізація всіх функцій кнопок **/
    private fun initButtons() {
        btnSaveList.setOnClickListener {
            when (btnSaveList.text) {
                "Редагувати список слів" -> editWordList()
                "Зберегти список слів" -> saveWordList()
            }
        }

        btnCancelSave.setOnClickListener {
            cancelSave()
        }
    }

    private fun editWordList() {
        btnSaveList.setText("Зберегти список слів")
        btnCancelSave.visibility = View.VISIBLE
        btnSaveList.setBackgroundResource(R.drawable.bg_green_button)
    }

    private fun saveWordList() {
        btnSaveList.setText("Редагувати список слів")
        btnCancelSave.visibility = View.INVISIBLE
        btnSaveList.setBackgroundResource(R.drawable.bg_orange_button)

    }

    private fun cancelSave() {
        btnSaveList.setText("Редагувати список слів")
        btnCancelSave.visibility = View.INVISIBLE
        btnSaveList.setBackgroundResource(R.drawable.bg_orange_button)
    }
}

/**
import org.json.JSONArray

val prefs = getSharedPreferences("my_dictionary", MODE_PRIVATE)
val editor = prefs.edit()

val myList = listOf("apple", "banana", "orange")
val jsonArray = JSONArray(myList)
editor.putString("my_list", jsonArray.toString())
editor.apply()

// Чтение
val jsonString = prefs.getString("my_list", "[]")
val jsonArrayRead = JSONArray(jsonString)
val savedList = mutableListOf<String>()
for (i in 0 until jsonArrayRead.length()) {
savedList.add(jsonArrayRead.getString(i))
}

 **/