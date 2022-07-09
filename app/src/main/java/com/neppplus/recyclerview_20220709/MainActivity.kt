package com.neppplus.recyclerview_20220709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.neppplus.recyclerview_20220709.adapters.StudentRecyclerAdapter
import com.neppplus.recyclerview_20220709.databinding.ActivityMainBinding
import com.neppplus.recyclerview_20220709.datas.StudentData

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter: StudentRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        임시방편 : 서버 통신 X, 코드에 직접 타이핑해서 목록 추가

        mStudentList.add( StudentData("김철수", "서울시 동대문구") )
        mStudentList.add( StudentData("이영희", "서울시 서대문구") )
        mStudentList.add( StudentData("박민수", "서울시 중구") )

        mAdapter = StudentRecyclerAdapter( mContext, mStudentList )
        binding.studentRecyclerView.adapter = mAdapter

//        리싸이클러뷰의 특징 -> 단순 세로 정렬 뿐 아니라, 여러 형태로 표현 가능.
//        어떤 형태로 보여줄건지도 설정 해야 화면에 데이터가 나옴.

        binding.studentRecyclerView.layoutManager = LinearLayoutManager( mContext )

    }
}