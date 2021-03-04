package com.me.koin.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
//    private val contactsLiveData: Map<Parameters, LiveData<Contacts>> = lazyMap { parameters ->
//        val liveData = MutableLiveData<Contacts>()
//        getContactsUseCase.loadContacts(parameters) {
//            liveData.value = it
//        }
//        return@lazyMap liveData
//    }

    val testData = MutableLiveData<String>()
    //val count = 9

    //fun updateData(update: (Int) -> Unit) = update(count)

    val test = {
        Log.e("hoho", "ASd")
    }

    // val lambda1: (String) -> Unit = { name: String -> Log.e("aa", "Hello, $name") }

    val lambda4: String.(Int) -> String = { this + it }

    //fun contacts(parameters: Parameters): LiveData<Contacts> = contactsLiveData.getValue(parameters)
//
//    fun <K, V> lazyMap(initializer: (K) -> V): Map<K, V> {
//        val map = mutableMapOf<K, V>()
//        return map.withDefault { key ->
//            val newValue = initializer(key)
//            map[key] = newValue
//            return@withDefault newValue
//        }
//    }
//
//    class GetContactsUseCase {
//        fun loadContacts(parameters: Parameters, onLoad: (Contacts) -> Unit) {
//            Log.e("parameters", parameters.namePrefix)
//            onLoad(Contacts(arrayListOf("Irene")))
//        }
//    }
//
//    inline fun <reified T> showMessage(marks: Int): T {
//        return when (T::class) {
//            Int::class -> marks as T
//            String::class -> "Congratulations! you scored more than 90%" as T
//            else -> "Please enter valid type" as T
//        }
//    }
//
//    fun main() {
//        val intMarks: Int = showMessage(70) // returning integer value
//        val stringMessage: String = showMessage(95) // returning string value
//        println("Your marks: $intMarks \nMessage: $stringMessage")
//    }
}