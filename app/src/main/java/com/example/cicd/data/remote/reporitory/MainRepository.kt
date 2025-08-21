package com.example.cicd.data.remote.reporitory

import com.example.cicd.data.local.db.AppDao
import com.example.cicd.data.remote.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService,
    localDataSource: AppDao
) {

    suspend fun getPosts() = apiService.getPosts()

}