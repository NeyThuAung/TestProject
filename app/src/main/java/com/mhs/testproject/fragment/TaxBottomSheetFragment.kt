package com.mhs.testproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mhs.testproject.R
import com.mhs.testproject.adapter.FilterAdapter
import com.mhs.testproject.databinding.FragmentTaxBottomSheetBinding
import com.mhs.testproject.tempData.filterList


class TaxBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding : FragmentTaxBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTaxBottomSheetBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}