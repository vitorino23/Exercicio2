package cesario.vitor.exercicio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercicio2.*

class Exercicio2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio2)

        btCalcular.setOnClickListener {
            val idade = etIdade.text.toString().toDouble()
            if (idade > 18){
                tvCategoria.text = "Categoria: Adulto"
            } else if (idade > 14){
                tvCategoria.text = "Categoria: Juvenil B"
            } else if (idade > 11){
                tvCategoria.text = "Categoria: Juvenil A"
            } else if (idade > 8){
                tvCategoria.text = "Categoria: Infantil B"
            } else if (idade > 5){
                tvCategoria.text = "Categoria: Infantil A"
            } else {
                tvCategoria.text = "Sem categoria"
            }
        }
    }
}
