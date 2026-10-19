package com.example.tess

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tess.databinding.ActivityChitietkhoanchiBinding // Đảm bảo đúng tên file XML của bạn

class ChiTietKhoanChiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChitietkhoanchiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChitietkhoanchiBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val bundle = intent.extras
        if (bundle != null) {
            val tenkhoan = bundle.getString("tenkhoan")
            val ghichu = bundle.getString("ghichu")
            val sotien = bundle.getString("sotien")
            binding.hienthichitiet.text = tenkhoan
            binding.hiengc.text=ghichu
            binding.hienst.text=sotien
        }
        binding.bntback.setOnClickListener {
            finish()
        }
    }
}