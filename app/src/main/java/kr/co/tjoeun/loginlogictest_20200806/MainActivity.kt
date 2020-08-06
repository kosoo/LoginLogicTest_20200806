package kr.co.tjoeun.loginlogictest_20200806

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val userId = userId.text.toString()
            if (userId == "admin@test.com" && userId == "qwer") {
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인실패.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
