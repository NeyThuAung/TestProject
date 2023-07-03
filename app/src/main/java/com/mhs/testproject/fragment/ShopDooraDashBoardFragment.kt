package com.mhs.testproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mhs.testproject.R
import com.mhs.testproject.adapter.MemberPointHistoryAdapter
import com.mhs.testproject.databinding.FragmentShopDooraDashBoardBinding
import com.mhs.testproject.tempData.memberPointHistoryList


class ShopDooraDashBoardFragment : Fragment(),MemberPointHistoryAdapter.OnItemSelectListener {

    private lateinit var binding : FragmentShopDooraDashBoardBinding
    private lateinit var memberPointHistoryAdapter: MemberPointHistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentShopDooraDashBoardBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        memberPointHistoryAdapter = MemberPointHistoryAdapter(memberPointHistoryList,this)
        binding.recPointHistory.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            adapter = memberPointHistoryAdapter
        }
    }

    override fun onItemSelect(pos: Int) {

    }

}