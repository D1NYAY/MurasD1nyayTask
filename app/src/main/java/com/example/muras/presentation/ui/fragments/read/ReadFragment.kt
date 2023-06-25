package com.example.muras.presentation.ui.fragments.read

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.muras.R
import com.example.muras.databinding.FragmentReadBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReadFragment : Fragment() {

    private val binding by viewBinding(FragmentReadBinding::bind)
    private val readViewModel by lazy {
        ViewModelProvider(this)[ReadViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_read, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}