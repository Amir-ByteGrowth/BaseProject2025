package com.example.cicd.ui.activity

//import androidx.hilt.lifecycle.ViewModelInject
import com.example.cicd.utils.NetworkHelper
import com.example.cicd.baseclasses.BaseViewModel
import com.example.cicd.data.remote.reporitory.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : BaseViewModel() {


}
