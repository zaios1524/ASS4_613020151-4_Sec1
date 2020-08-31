package com.example.ass4kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.ass4kotlin.DatePickerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun showDatePickerDialog(v: View) {
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")

    }

    fun showGender(view: View) {
        val selectID: Int = radioGroup.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked: RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        } catch (t: Throwable) {
            gender = ""
        }

        text_show.text =
            "Username:${edit_id.text}\nPassword: ${edit_name.text}\nGender: ${gender}\nE-mail: ${edit_mail.text}\nBirthday: ${text_date.text}"

    }

    fun reset(v: View) {
        edit_id.text.clear()
        edit_name.text.clear()
        edit_mail.text.clear()
        radioGroup.clearCheck()
        text_date.text = "mm/dd/yy"
        text_show.text = "Show Information"

    }
}