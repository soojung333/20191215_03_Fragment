package com.soojung.a20191215_03_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.soojung.a20191215_03_fragment.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : BaseFragment(){
    override fun setupEvents() {

    }

    override fun setValues() {
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()

        okBtn.setOnClickListener {
            Toast.makeText(activity, "${nameEdt.text.toString()} / ${nickNameEdt.text.toString()}", Toast.LENGTH_SHORT).show()
        }
    }

}

