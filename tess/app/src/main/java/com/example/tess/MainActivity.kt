package com.example.tess

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tess.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bntxemchitiet.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("tenkhoan",binding.tenkhoan.text.toString())
            bundle.putString("sotien",binding.sotien.text.toString())
            bundle.putString("ghichu",binding.ghichu.text.toString())
            val intent = Intent(this, ChiTietKhoanChiActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        binding.btnthemkhoanchi.setOnClickListener {

        }
    }
}