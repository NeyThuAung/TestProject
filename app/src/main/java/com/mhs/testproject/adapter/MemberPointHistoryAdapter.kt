package com.mhs.testproject.adapter


import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mhs.testproject.R
import com.mhs.testproject.Utils.getFinalFormat
import com.mhs.testproject.databinding.PointHistoryItemCardBinding
import com.mhs.testproject.tempData.MemberPointData


class MemberPointHistoryAdapter(
    private var memberPointList : ArrayList<MemberPointData>,
    private val listener : MemberPointHistoryAdapter.OnItemSelectListener
) : RecyclerView.Adapter<MemberPointHistoryAdapter.MemberPointHolder>(){
    interface OnItemSelectListener{
        fun onItemSelect(pos:Int)
    }
    inner class MemberPointHolder(private val binding: PointHistoryItemCardBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(memberPointList : MemberPointData){

            Glide.with(itemView)
                .load(memberPointList.profileImage)
                .placeholder(R.drawable.iv_profie_cus)
                .centerCrop()
                .into(binding.ciMemberImage)

            binding.tvName.text= memberPointList.customerName

            if (!memberPointList.isReceive){
                binding.tvPoint.setTextColor(itemView.resources.getColor(R.color.red))
                binding.tvPoint.text = "-"+memberPointList.point.toDouble().getFinalFormat()+" pts"
            }else{
                binding.tvPoint.setTextColor(Color.parseColor("#FFB001"))
                binding.tvPoint.text = "+"+memberPointList.point.toDouble().getFinalFormat()+" pts"

            }
            binding.tvTime.text = memberPointList.time

            when(memberPointList.configMemberPointTypeId){
                1->{
                    binding.civIndicator.setImageResource(R.drawable.iv_point_receive)
                }
                2->{
                    binding.civIndicator.setImageResource(R.drawable.iv_point_redemption)
                }
                3->{
                    binding.civIndicator.setImageResource(R.drawable.iv_level_increase)
                }
                4->{
                    binding.civIndicator.setImageResource(R.drawable.iv_point_scan)
                }
                5->{

                }
                6->{

                }
                7->{
                    binding.civIndicator.setImageResource(R.drawable.iv_level_decrease)
                }
                8->{
                    binding.civIndicator.setImageResource(R.drawable.iv_point_deduct)
                }
            }

            binding.root.setOnClickListener {
                listener.onItemSelect(adapterPosition)
//                val memberPointDetailFragment = MemberPointDetailFragment()
//                val fragmentManager = (it.context as FragmentActivity).supportFragmentManager
//                memberPointDetailFragment.show(fragmentManager,memberPointDetailFragment.TAG)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberPointHolder {
        return MemberPointHolder(PointHistoryItemCardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MemberPointHolder, position: Int) {
        holder.bind(memberPointList[position])
    }

    override fun getItemCount(): Int {
        if (memberPointList.size > 10){
            return 10
        }else
            return memberPointList.size
    }

}