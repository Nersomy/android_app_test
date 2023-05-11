package com.example.myapplication01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // здесь происходит инициализация активности и создание пользовательского интерфейса
    }
    override fun onStart() {
        super.onStart()
        // активность становится видимой, но еще не готова для взаимодействия с пользователем
    }

    override fun onResume() {
        super.onResume()
        // активность становится активной и готова для взаимодействия с пользователем
    }

    override fun onPause() {
        super.onPause()
        // активность теряет фокус, но остается видимой на экране
    }

    override fun onStop() {
        super.onStop()
        // активность становится невидимой для пользователя
    }

    override fun onDestroy() {
        super.onDestroy()
        // активность уничтожается и освобождаются все связанные с ней ресурсы
    }

    override fun onRestart() {
        super.onRestart()
        // активность перезапускается после того, как была остановлена, но не уничтожена
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // сохранение данных, необходимых для восстановления состояния активности
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // восстановление сохраненных данных
    }


}