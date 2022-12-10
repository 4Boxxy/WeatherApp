package com.example.gachiweather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gachiweather.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}