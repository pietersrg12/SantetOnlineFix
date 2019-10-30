package id.co.santetonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val santet = findViewById<Button>(R.id.santet)
     val target = findViewById<EditText>(R.id.isi_target)

        santet.setOnClickListener {
            Toast.makeText(
                this,
                "SADAR WOI,MANA ADA SANTET ${target.text.toString()} CUMA BUTUH USAHA LEBIH DARI LO !",
                LENGTH_LONG
            ).show()
        }
    }
}
