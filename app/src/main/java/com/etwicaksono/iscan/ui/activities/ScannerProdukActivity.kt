package com.etwicaksono.iscan.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etwicaksono.iscan.databinding.ActivityScannerProdukBinding

class ScannerProdukActivity : AppCompatActivity() {

    companion object{
        const val NAMA_TOKO = "nama_toko"
    }

    private lateinit var binding:ActivityScannerProdukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityScannerProdukBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}