package com.zalocoders.dagger2.commponents

import com.zalocoders.dagger2.kotlin.Car
import dagger.Component

@Component
interface CarComponent {
	fun getCar(): Car
}