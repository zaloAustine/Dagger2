package com.zalocoders.dagger2.kotlin

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels){
	companion object{
		private const val TAG = "Car"
	}
	
	fun drive(){
	Log.d(TAG,"Drive")
	}

}

