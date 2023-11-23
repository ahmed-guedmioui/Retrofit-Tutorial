package com.ahmedapps.retrofit.data

import com.ahmedapps.retrofit.data.model.Products
import retrofit2.http.GET

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
interface Api {

    @GET("products")
    suspend fun getProductsList(): Products

    companion object {
        const val BASE_URL = "https://dummyjson.com/"
    }


//    @GET("products/{type}")
//    suspend fun getProductsList(
//        @Path("type") type: String,
//        @Query("page") page: Int,
//        @Query("api_key") apiKey: String
//    ): Products

}