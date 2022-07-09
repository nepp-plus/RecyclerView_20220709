package com.neppplus.recyclerview_20220709.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.recyclerview_20220709.R
import com.neppplus.recyclerview_20220709.datas.StudentData

class StudentRecyclerAdapter(
    val mContext: Context,
    val mList: ArrayList<StudentData>
) : RecyclerView.Adapter<StudentRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

//        어떤 xml을 끌어와서 => MyViewHolder에 넣어서 리턴할 것인가 : LayoutInflater 활용

        val row = LayoutInflater.from(mContext).inflate( R.layout.student_list_item, parent, false )
        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }


//    총 몇개의 아이템인가 => mList의 size 변수 활용

    override fun getItemCount() = mList.size

}