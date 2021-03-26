package com.seine.main.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.qin.common.base.MyApplication
import com.qin.common.theme.MyTheme

class UserInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfoPage()
        }
    }
}

@Composable
fun UserInfoPage() {
    MyTheme(MyApplication.isDarkTheme) {
        Surface(
            modifier = Modifier
                .background(MyTheme.colors.uiBackground)
                .fillMaxSize()
        ) {
            Row {
                Button(onClick = {
                    MyApplication.isDarkTheme = !MyApplication.isDarkTheme
                }) {

                }
            }
        }
    }
}