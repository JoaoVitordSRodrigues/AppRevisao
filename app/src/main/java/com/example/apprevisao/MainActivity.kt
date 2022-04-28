package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { compareNums() }
    }

    private fun compareNums() {
        val edtNumber1: EditText = findViewById(R.id.edtNumber1)
        val edtNumber2: EditText = findViewById(R.id.edtNumber2)


        if (edtNumber1.length() != 0) {
            if (Integer.parseInt(edtNumber1.text.toString()) > Integer.parseInt(edtNumber2.text.toString())) {
                Toast.makeText(this, "Campo 1 é maior que o Campo 2!", Toast.LENGTH_LONG).show()

            } else if (Integer.parseInt(edtNumber2.text.toString()) > Integer.parseInt(edtNumber1.text.toString())) {
                Toast.makeText(this, "Campo 2 é maior que o Campo 1!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Campo 1 é igual ao Campo 2!", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Insira algum número!!!", Toast.LENGTH_SHORT).show()
        }
    }
}
