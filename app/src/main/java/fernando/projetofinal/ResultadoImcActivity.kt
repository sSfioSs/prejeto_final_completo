package fernando.projetofinal

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_imc.*

class ResultadoImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

      /*  val sharedPrefs = getSharedPreferences("imcu", MODE_PRIVATE)

        val IMCur = sharedPrefs.getString("IMC", "")
        val IMCu = "$IMCur"
        val imc = IMCu.toInt()
       val IMC = IMCu.toFloat()

        if(IMC < 18){
            txvResultadoInfo.text = ("abaixo do normal")
        }else if(IMC >18 && IMC <25){
            txvResultadoInfo.text = ("normal")
        }else if (IMC > 25){
            txvResultadoInfo.text = ("acima do normal")
        }

        txvResultadoValor.text = "seu imc é $imc"*/


    }
}