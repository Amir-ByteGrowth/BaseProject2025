package com.example.cicd.ui.secondfragment

import com.example.cicd.BR
import com.example.cicd.R
import com.example.cicd.baseclasses.BaseFragment
import com.example.cicd.databinding.LayoutSecondBinding

class SecondFragment : BaseFragment<LayoutSecondBinding, SecondViewModel>() {

    override val layoutId: Int
        get() = R.layout.layout_second
    override val viewModel: Class<SecondViewModel>
        get() = SecondViewModel::class.java
    override val bindingVariable: Int
        get() = BR.viewModel
}