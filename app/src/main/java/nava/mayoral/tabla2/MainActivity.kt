package nava.mayoral.tabla2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var resultado = 0
    val ope  = arrayOf("+","-","*")
    var random = ope.random()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        multiplicar()
        if (random == "+"){
            btnVerificar.setOnClickListener{

                if (etRespuesta.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }
        if (random == "-"){
            btnVerificar.setOnClickListener{

                if (etRespuesta.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }

        if (random == "*"){
            btnVerificar.setOnClickListener{

                if (etRespuesta.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }

    }


    fun m(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

    fun verificarRespuesta(){
        if (random == "+"){
            btnVerificar.setOnClickListener{
                if (etRespuesta.text.isNotEmpty()){
                    if (etRespuesta.getText().toString().toInt()==resultado){

                        val miIntent = Intent(this,BuenaActivity::class.java)
                        startActivity(miIntent)

                    }else{
                        val miIntent = Intent(this,MalaActivity::class.java)
                        startActivity(miIntent)
                          

                    }
                    randoM()
                }else{
                    m("Ingrese una respuesta")
                }
            }
        }
        if (random == "-"){
            btnVerificar.setOnClickListener{
                if (etRespuesta.text.isNotEmpty()){
                    if (etRespuesta.getText().toString().toInt()==resultado){

                        val miIntent = Intent(this,BuenaActivity::class.java)

                        startActivity(miIntent)
                    }else{
                        val miIntent = Intent(this,MalaActivity::class.java)
                        miIntent.putExtra("info",resultado)
                        startActivity(miIntent)

                    }
                    randoM()
                }else{
                    m("Ingrese una respuesta")
                }
            }
        }

        if (random == "*"){
            btnVerificar.setOnClickListener{
                if (etRespuesta.text.isNotEmpty()){
                    if (etRespuesta.getText().toString().toInt()==resultado){
                        val miIntent = Intent(this,BuenaActivity::class.java)
                        startActivity(miIntent)

                    }else{
                        val miIntent = Intent(this,MalaActivity::class.java)
                        startActivity(miIntent)

                    }
                    randoM()
                }else{
                    m("Ingrese una respuesta")
                }

            }
        }
    }

    fun multiplicar(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvOperacion.text = "$num1 x $num2 = ?"
        resultado=num1*num2
        etRespuesta.text.clear()
    }
    fun sumar(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvOperacion.text = "$num1 + $num2 = ?"
        resultado=num1+num2
        etRespuesta.text.clear()
    }

    fun restar(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvOperacion.text = "$num1 - $num2 =?"
        resultado=num1-num2
        etRespuesta.text.clear()
    }
    fun randoM(){
        random = ope.random()
        if (random == "+"){
            sumar()
        }
        if (random == "-"){
            restar()
        }

        if (random == "*"){
            multiplicar()
        }
    }
    private fun initUI() {


    }
}

