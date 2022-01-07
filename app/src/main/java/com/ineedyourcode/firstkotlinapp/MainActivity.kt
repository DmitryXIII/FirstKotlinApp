package com.ineedyourcode.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var btnChangeText: Button? = null
    private var txtHello: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //кликлисенер на кнопке
        setContentView(R.layout.activity_main)
        btnChangeText = findViewById(R.id.btn_change_text)
        txtHello = findViewById(R.id.txt_hello)

        btnChangeText?.setOnClickListener(View.OnClickListener {
            txtHello?.text =
                if (txtHello?.text.toString() == getString(R.string.hello_world)) {
                    getString(R.string.hello_kotlin)
                } else {
                    getString(R.string.hello_world)
                }
        })

        //функция верхнего уровня
        val btnGetCurrentTime : Button = findViewById(R.id.btn_change_current_time)
        val txtGetCurrentTime : TextView = findViewById(R.id.txt_current_time)
        btnGetCurrentTime.setOnClickListener(View.OnClickListener { txtGetCurrentTime.text = getCurrentTime().toString() })

        //вывод данных через цикл
        //класс типа object
        val btnPrintCats : Button = findViewById(R.id.btn_print_cats)
        val txtPrintCats : TextView = findViewById(R.id.txt_print_cats)

        btnPrintCats.setOnClickListener(View.OnClickListener {
            for (cat in Repository.getListOfCats()) {
                txtPrintCats.text = "${txtPrintCats.text} $cat\n"
            }
        })

        //вывод полей Data-класса
        val car = Car("Audi" ,"Germany")
        val txtDataClassFields : TextView = findViewById(R.id.txt_data_from_data_class)
        val txtDataClassFields2 : TextView = findViewById(R.id.txt_data_from_data_class_2)
        var newCar = car.copy(brand = "BMW")

        txtDataClassFields.text = "brand: \"${car.brand}\", country: \"${car.country}\""
        txtDataClassFields2.text = "brand: \"${newCar.brand}\", country: \"${newCar.country}\""
    }
}