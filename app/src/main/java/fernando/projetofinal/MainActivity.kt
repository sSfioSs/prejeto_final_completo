package fernando.projetofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainCalcularImc.setOnClickListener {
            val mIntent = Intent(this, ImcActivity::class.java)
                startActivity(mIntent)


        }
    }
}