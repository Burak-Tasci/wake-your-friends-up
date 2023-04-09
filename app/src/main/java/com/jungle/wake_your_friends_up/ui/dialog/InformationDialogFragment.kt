package com.jungle.wake_your_friends_up.ui.dialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.jungle.wake_your_friends_up.R
import com.jungle.wake_your_friends_up.core.BaseDialogFragment
import com.jungle.wake_your_friends_up.databinding.FragmentInformationDialogBinding


class InformationDialogFragment(
    private val fragmentManager: FragmentManager
) : BaseDialogFragment<FragmentInformationDialogBinding>(R.layout.fragment_information_dialog) {

    override val bindingInflater: (LayoutInflater) -> FragmentInformationDialogBinding
        get() = FragmentInformationDialogBinding::inflate

    override fun setupUi() {
        binding.btnOk.setOnClickListener {
            dismiss()
        }
    }

    fun show(){
        show(fragmentManager, TAG)
    }



}