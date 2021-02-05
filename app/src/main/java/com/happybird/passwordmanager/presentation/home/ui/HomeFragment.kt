package com.happybird.passwordmanager.presentation.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.happybird.passwordmanager.databinding.FragmentHomeBinding
import com.happybird.passwordmanager.presentation.home.viewmodel.HomeViewModel

class HomeFragment: Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        retainInstance = true

        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(
                requireActivity().application
            )
        ).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rvPasswords.run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //Clear reference to adapter to avoid hidden circular reference
        binding.rvPasswords.adapter = null
    }
}