package com.mahesaiqbal.parcelize.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahesaiqbal.parcelize.R
import com.mahesaiqbal.parcelize.data.Data
import com.mahesaiqbal.parcelize.data.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Home"

        // Ketika btn click me di klik, maka akan mengirim data parcel yang berisi custom data ke activity tujuan
        // Yaitu UserInfoActivity
        btn_click_me.setOnClickListener {
            val intent = Intent(this, UserInfoActivity::class.java)
            intent.putExtra("data_parcel", Data("Halo!", User(1, "Mahesa", 18, "Lalala")))
            startActivity(intent)
        }
    }
}
