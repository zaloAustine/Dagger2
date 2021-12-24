package com.zalocoders.dagger2.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zalocoders.dagger2.R
import com.zalocoders.dagger2.commponents.DaggerCarComponent
import com.zalocoders.dagger2.kotlin.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
	
	@Inject
	lateinit var car:Car
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val component = DaggerCarComponent.create()
		car = component.getCar()
		
		car.drive()
	}
}