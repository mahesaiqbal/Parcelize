package com.mahesaiqbal.parcelize.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahesaiqbal.parcelize.R
import com.mahesaiqbal.parcelize.data.Data
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        supportActionBar?.apply {
            title = "User Info"
            setDisplayHomeAsUpEnabled(true)
        }

        val data = intent.getParcelableExtra<Data>("data_parcel")

        showUserInfo(data)
    }

    private fun showUserInfo(data: Data?) {
        dummy_string.text = data?.dummyString
        user_id.text = data?.user?.id.toString()
        name.text = data?.user?.name
        age.text = data?.user?.age.toString()
        about.text = data?.user?.about
    }
}
