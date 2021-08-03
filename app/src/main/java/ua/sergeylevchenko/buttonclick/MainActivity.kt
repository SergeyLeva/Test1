package ua.sergeylevchenko.buttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


               // ставлю себе 3 балла за урок. Тем не мение , много чего новго узнал.

               class MainActivity : AppCompatActivity() {


               private var counter: Int = 0  //неразобрался пока что куда и как его оформлять

               override fun onCreate(savedInstanceState: Bundle?) {
               super.onCreate(savedInstanceState)
               setContentView(R.layout.activity_main)
               val textView: TextView = findViewById(R.id.textView)
               val button: Button = findViewById(R.id.button)
               button.setOnClickListener {
                   textView.text = "Мяу  мяу"

                   //не понимаю ( пока что ) как правильно добавлять к кнопкам функционал.( на курсе скрутно обо всем расписано, а многое упущено, что плохо для новичка)
                   val button_counter: Button = findViewById(R.id.button_counter)
                   button_counter.setOnClickListener {
                       textView.text = "Я насчитал ${++counter} котов"
                   }

                   val wiskas: Button = findViewById(R.id.wiskas)
                      wiskas.setOnClickListener {
                       textView.text = "ам-ням-ням"
                   }

               }
           }
       }

