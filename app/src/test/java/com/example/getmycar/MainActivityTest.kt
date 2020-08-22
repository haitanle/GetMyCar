package com.example.getmycar

import android.os.Build
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainActivityTest {

    @Test
    fun canLaunchMainActivity(){
        val scenario = launchActivity<MainActivity>()
    }

}