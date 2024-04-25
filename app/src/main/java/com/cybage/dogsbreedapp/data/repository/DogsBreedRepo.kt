package com.cybage.dogsbreedapp.data.repository

import com.cybage.dogsbreedapp.data.api.DogsBreedApi
import javax.inject.Inject

class DogsBreedRepo @Inject constructor(
   private val dogsBreedApi:DogsBreedApi)
{
suspend fun getDogsBreed():List<DogsBreed>{
    return dogsbreedApi.getDogsBreed()
}
}