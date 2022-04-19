package com.rafaeluribe.ejercicioapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rafaeluribe.ejercicioapi.databinding.ActivityMainBinding
import com.rafaeluribe.ejercicioapi.retrofit.Divisa
import com.rafaeluribe.ejercicioapi.retrofit.DivisaAPIService
import com.rafaeluribe.ejercicioapi.retrofit.RestEngine
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnBuscar.setOnClickListener {
            if (b.txtDivisa.text.toString() != ""){
                b.progressBar.visibility = View.VISIBLE
                traerDatos(b.txtDivisa.text.toString(), b.txtFecha.text.toString())
            }
            else{
                Toast.makeText(applicationContext,
                "Complete los campos!!", Toast.LENGTH_SHORT).show()

            }
        }
    }

    private fun traerDatos(divisa: String, date : String){
        CoroutineScope(Dispatchers.IO).launch {
            val llamada: DivisaAPIService = RestEngine.getRestEngine().create(DivisaAPIService::class.java)
            val resultado: Call<Divisa> = llamada.obtenerDivisa(divisa, date)
            val d:Divisa? = resultado.execute().body()

            if (d != null){
                runOnUiThread{
                    b.txtNombre.text = "Nombre: " + d.data
                    b.txtValor.text = "Valor: $ " + d.data
                    runOnUiThread { b.progressBar.visibility = View.GONE }

                }
            }
            else{
                runOnUiThread { Toast.makeText(applicationContext,
                    "No se encontraron resultados...",
                    Toast.LENGTH_SHORT).show()
                    b.progressBar.visibility = View.GONE
            }
        }
    }
  }
}