package com.veskekatke.healthformula.presentation.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.veskekatke.healthformula.R

class MyMealPlanFragment : Fragment(R.layout.fragment_mymealplan){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.findViewById<NavigationView>(R.id.navView)?.setCheckedItem(R.id.myMealPlan)
    }
}