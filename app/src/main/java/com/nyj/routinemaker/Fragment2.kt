package com.nyj.routinemaker

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1.*
import android.widget.CalendarView
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import kotlinx.android.synthetic.main.fragment2.*


class Fragment2 : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //xml과 연결
        val view = inflater.inflate(R.layout.fragment2, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClickListener()
    }

    fun setOnClickListener(){
        calendarView.setOnDateChangeListener{view, year, month, dayofMonth ->

            val intent = Intent(activity, AddPlan_Activity::class.java)
            intent.putExtra("year", year)
            intent.putExtra("month", month)
            intent.putExtra("day", dayofMonth)
            startActivity(intent)

        }

    }
}