package com.mhs.testproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.mhs.testproject.databinding.FilterItemCardBinding
import com.mhs.testproject.tempData.FilterData

class FilterAdapter(
    private val filterList : ArrayList<FilterData>,
    private var selectedPos : Int,
    private val listener : OnClickListener
) : RecyclerView.Adapter<FilterAdapter.FilterHolder>() {

    interface OnClickListener{
        fun onFilterClick(id : Int)
    }

    inner class FilterHolder(private val binding: FilterItemCardBinding) : RecyclerView.ViewHolder(binding.root){
        @SuppressLint("NotifyDataSetChanged")
        fun bind(filter : FilterData){
            binding.tvFilterText.text = filter.filterName
            binding.tvFilterDate.text = filter.filterDate

            binding.root.setOnClickListener {
                selectedPos = adapterPosition
                listener.onFilterClick(filter.id)
                notifyDataSetChanged()
            }

            binding.civSelectedCircle.isVisible = selectedPos == adapterPosition

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterHolder {
        return FilterHolder(FilterItemCardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: FilterHolder, position: Int) {
        holder.bind(filterList[position])
    }

    override fun getItemCount(): Int {
        return filterList.size
    }
}