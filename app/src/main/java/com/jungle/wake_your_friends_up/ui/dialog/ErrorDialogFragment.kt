package com.jungle.wake_your_friends_up.ui.dialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.jungle.wake_your_friends_up.R
import com.jungle.wake_your_friends_up.core.BaseDialogFragment
import com.jungle.wake_your_friends_up.databinding.FragmentErrorDialogBinding


class ErrorDialogFragment(
    private val fragmentManager: FragmentManager
) : BaseDialogFragment<FragmentErrorDialogBinding>(R.layout.fragment_error_dialog) {

    override val bindingInflater: (LayoutInflater) -> FragmentErrorDialogBinding
        get() = FragmentErrorDialogBinding::inflate

    override fun setupUi() {

    }

    fun show(){
        show(fragmentManager, TAG)
    }

}