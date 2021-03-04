package com.me.koin.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.me.koin.R
import com.me.koin.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(), LifecycleOwner {

    companion object {
        fun newInstance() = MainFragment()
    }

    val data: (value: Int) -> Unit = {
        Log.e("it", it.toString())
    }

    private lateinit var bindingView: MainFragmentBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingView = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        return bindingView.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        bindingView.bt.setOnClickListener {
            //viewModel.updateData(data)
            //viewModel.lambda1("as")
            viewModel.testData.value = "irene"
        }
        bindingView.bt1.setOnClickListener {
            Log.e("viewModel", viewModel.testData.value!!)
        }
        viewModel.testData.observe(viewLifecycleOwner, {
            Log.e("it", it)
        })
    }
}