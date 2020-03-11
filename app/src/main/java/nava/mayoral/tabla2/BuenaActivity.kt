package nava.mayoral.tabla2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buena.*

class BuenaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buena)

        btnRegresar.setOnClickListener {
            val BuenaInt = Intent(this,MainActivity::class.java)
            startActivity(BuenaInt)
        }
    }
}
