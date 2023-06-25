package com.example.muras.presentation.ui.fragments.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.muras.R
import com.example.muras.databinding.FragmentProfileBinding
import com.example.muras.domain.module.FavoritesBooks
import com.example.muras.presentation.ui.base.BaseFragment
import com.example.muras.presentation.ui.fragments.ProfileAdapter
import com.example.muras.presentation.ui.fragments.library.LibraryFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment() {

    private val binding by viewBinding(FragmentProfileBinding::bind)
    private val viewModel by viewModels<ProfileViewModel>()
    private lateinit var profileAdapter: ProfileAdapter
    private val list = arrayListOf<FavoritesBooks>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        profileAdapter = ProfileAdapter(list)
    }
    fun initAdapter(){
        binding.rvBooks.apply { layoutManager = LinearLayoutManager(requireContext())
        adapter = profileAdapter

        }

    }
    fun initRequests() {
        viewModel.getFavorites()
    }
    fun notifySubscribers() {
        val favList = list
        viewModel.getFavoriteState.collectState(
            onLoading = {

                binding.rvBooks.isVisible = false
            },
            onError = {
                //Toast.makeText(requireContext(), it.message, Toast.LENGTH_LONG).show()
            },
            onSuccess = { favs ->

                binding.rvBooks.isVisible = true
                binding.rvBooks.adapter = profileAdapter
                list.clear()
                list.addAll(favList)
                profileAdapter.notifyItemChanged(list.lastIndex)
            }
        )
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        initRequests()
        notifySubscribers()

    }
    /*private fun onBookClick(id:Int){
       findNavController().navigate(R.id.)
    }
    */

}