package com.mhs.testproject.bottomSheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mhs.testproject.R
import com.mhs.testproject.adapter.FilterAdapter
import com.mhs.testproject.databinding.FragmentShopdooraFilterBinding
import com.mhs.testproject.tempData.filterList


class ShopdooraFilterFragment : BottomSheetDialogFragment(),FilterAdapter.OnClickListener {

    private lateinit var binding : FragmentShopdooraFilterBinding

    private lateinit var filterAdapter: FilterAdapter

    override fun getTheme() = R.style.BottomSheetDialogTheme

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentShopdooraFilterBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        filterAdapter = FilterAdapter(filterList,0,this)
        binding.recFilter.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            adapter = filterAdapter
        }

    }

    override fun onFilterClick(id: Int) {

    }
}