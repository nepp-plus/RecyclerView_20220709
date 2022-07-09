package com.neppplus.recyclerview_20220709.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.recyclerview_20220709.R
import com.neppplus.recyclerview_20220709.datas.StudentData

class StudentRecyclerAdapter(
    val mContext: Context,
    val mList: ArrayList<StudentData>
) : RecyclerView.Adapter<StudentRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {

//        멤버변수로 row 의 id값으로 태그 찾아오기
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

//        함수 추가 => 데이터를 받아서 실 데이터 반영 함수

        fun bind( data: StudentData ) {
            txtName.text = data.name
            txtAddress.text = "(${data.address})"
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

//        어떤 xml을 끌어와서 => MyViewHolder에 넣어서 리턴할 것인가 : LayoutInflater 활용

        val row = LayoutInflater.from(mContext).inflate( R.layout.student_list_item, parent, false )
        return MyViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

//        위치에 맞게 재사용성이 이미 처리된 상태로 holder를 가져옴.
//        코딩 입장 : holder의 내용물만 세팅하면 완료.

        holder.bind( mList[position] )

    }


//    총 몇개의 아이템인가 => mList의 size 변수 활용

    override fun getItemCount() = mList.size

}