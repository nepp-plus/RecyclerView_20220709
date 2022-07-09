package com.neppplus.recyclerview_20220709.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.recyclerview_20220709.datas.StudentData

class StudentRecyclerAdapter(
    val mContext: Context,
    val mList: ArrayList<StudentData>
) : RecyclerView.Adapter<StudentRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

}