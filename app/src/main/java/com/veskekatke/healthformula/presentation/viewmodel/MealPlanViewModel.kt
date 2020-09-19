package com.veskekatke.healthformula.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.veskekatke.healthformula.data.models.mealPlan.MealPlan

class MealPlanViewModel : ViewModel() {
    private val mealPlan : MutableLiveData<MealPlan> = MutableLiveData()

    private var mp : MealPlan = MealPlan(
        1,
        "Neki plan",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    )

    init {
        mealPlan.value = mp
    }

    fun getMealPlan() : LiveData<MealPlan> {
        return mealPlan
    }

}