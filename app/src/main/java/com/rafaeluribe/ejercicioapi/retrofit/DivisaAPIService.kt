package com.rafaeluribe.ejercicioapi.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DivisaAPIService {

    @GET("latest?apikey=FJkkJ7OG8PDfVif7qqnbB39R1O97oduijm8spYJQ")
    fun obtenerDivisa(@Query("base_currency") base_currency: String,
                      @Query("date") date:String): Call<Divisa>
}