package dev.jameshill.clockapplication

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextClock
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Creating a variable called tClock and assigning it to the TextClock object with the id
        textClock. */
        val tClock: TextClock = findViewById(R.id.textClock)
        /* Creating a variable called showTime and assigning it to the Button object with the id
        displayButton. */
        val showTime :Button = findViewById(R.id.displayButton)

        tClock.visibility = View.INVISIBLE

        showTime.setOnClickListener {
            //Toast.makeText(this, "you pressed the button",Toast.LENGTH_LONG).show()
            Log.i("EVENT", "CLICKED BUTTON")
            /* Making the clock visible for 3 seconds and then invisible again. */
            tClock.visibility = View.VISIBLE
            Handler().postDelayed(Runnable {
                tClock.visibility = View.INVISIBLE
            },3000)


        }
    }
}