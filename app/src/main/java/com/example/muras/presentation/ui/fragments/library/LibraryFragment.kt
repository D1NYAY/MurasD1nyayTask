package com.example.muras.presentation.ui.fragments.library

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.muras.R
import com.example.muras.databinding.FragmentLibraryBinding

class LibraryFragment : Fragment() {

    private val binding by viewBinding(FragmentLibraryBinding::bind)
    private val libraryViewModel by lazy {
        ViewModelProvider(this)[LibraryViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }
}