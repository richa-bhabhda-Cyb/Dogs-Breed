package com.cybage.dogsbreedapp.data.api

import com.cybage.dogsbreedapp.data.api.ApiConstants.END_POINT
import retrofit2.http.GET


interface DogsBreedApi {
    @GET(END_POINT)
    suspend fun getDogsBreed():List<DogsBreed>

}