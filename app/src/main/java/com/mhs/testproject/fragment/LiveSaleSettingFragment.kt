package com.mhs.testproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mhs.testproject.R
import com.mhs.testproject.bottomSheet.ShopdooraFilterFragment
import com.mhs.testproject.databinding.FragmentLiveSaleSettingBinding


class LiveSaleSettingFragment : Fragment() {

    private lateinit var binding: FragmentLiveSaleSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLiveSaleSettingBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClickEvents()
    }

    private fun onClickEvents() {

        binding.mbBottomSheet.setOnClickListener {
            val shopdooraFilterFragment = ShopdooraFilterFragment()
            shopdooraFilterFragment.show(childFragmentManager,"ShopdooraFilterFragment")
        }

        binding.mbGotoDashBoard.setOnClickListener {
            findNavController().navigate(R.id.action_liveSaleSettingFragment_to_dashboardFragment)
        }

//        binding.llRbPercent.setOnClickListener {
//            binding.rbPercent.isChecked = true
//            binding.rbAmount.isChecked = false
//            binding.tvPcs.text = "%"
//        }
//
//        binding.llRbAmount.setOnClickListener {
//            binding.rbPercent.isChecked = false
//            binding.rbAmount.isChecked = true
//            binding.tvPcs.text = "amt"
//        }

        binding.ivBack.setOnClickListener {
            requireActivity().finish()
        }

    }

}