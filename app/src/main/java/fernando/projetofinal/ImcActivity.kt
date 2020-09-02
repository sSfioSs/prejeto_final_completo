package fernando.projetofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imc.*

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        btnImcCalcular.setOnClickListener {

            var altura = edtImcAltura.text.toString()
            var peso = edtImcPeso.text.toString()

            if (altura.isEmpty() || peso.isEmpty() ){
                Toast.makeText(this, "Preemcha suas informações", Toast.LENGTH_SHORT).show()
            }else {
               var atr =  altura.toFloat()
               var ps = peso.toFloat()
                var alt = atr * atr
                var imc = ps / alt
                var iMC = imc.toInt()
                txvImcOperacao.text = "$altura de altura   $peso kg"
                if(imc < 18){
                   txvImcInfo.text = ("seu IMC é $iMC está abaixo do normal")
                }else if(imc >18 && imc <25){
                   txvImcInfo.text = ("seu IMC é $iMC está normal")
                }else if (imc > 25){
                   txvImcInfo.text = ("seu IMC é $iMC está acima do normal")
                }
                btnImcLimpartxt.setOnClickListener{
                    edtImcAltura.text.clear()
                    edtImcPeso.text.clear()
                    txvImcInfo.text = ""
                    txvImcOperacao.text = ""
                }



               /* var sharedPrefs = getSharedPreferences( "imcu", Context.MODE_PRIVATE )
                val editsharedprefs = sharedPrefs.edit()
                editsharedprefs.putString("IMC", imcr)
                editsharedprefs.apply()
                val mIntent = Intent(this, ResultadoImcActivity::class.java)
                mIntent.putExtra("INTENT_IMC", imcr)
                startActivity(mIntent)*/



            }



        }


    }
}