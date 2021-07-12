package com.etwicaksono.iscan.views

import android.content.Context
import android.widget.Toast
import com.etwicaksono.iscan.model.TokoModel

interface ITokoView {
//    untuk get data
    fun onSuccessGet(data:TokoModel?)
    fun onFailedGet(msg:String)
}