package com.seine.main.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.qin.common.base.MyApplication
import com.qin.common.ktx.string
import com.qin.common.theme.*
import com.seine.main.R
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrawerAppComponent()
        }
    }

//    fun setMyContent(
//        parent: CompositionContext? = null,
//        content: @Composable () -> Unit
//    ) {
//        setContent(parent) {
//            MyTheme(MyApplication.isDarkTheme, content)
//        }
//    }
}

@Composable
fun DrawerAppComponent() {
    MyTheme(MyApplication.isDarkTheme) {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        ModalDrawer(
            drawerState = drawerState,
            gesturesEnabled = true,
            drawerElevation = 100.dp,
            drawerContent = {
                DrawerContent()
            },
            drawerBackgroundColor = MyTheme.colors.uiFloated
        ) {
            val (currentScreen, selectScreen) = remember { mutableStateOf(AppScreen.RoomScreen) }
            Column(modifier = Modifier.fillMaxSize()) {
                RoomTable(drawerState)
            }
        }
    }
}


@Composable
fun DrawerContent() {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .background(MyTheme.colors.error)
    ) {
        Text(text = "哦的方式", modifier = Modifier.fillMaxSize())
    }
}


@Composable
fun RoomTable(drawerState: DrawerState) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MyTheme.colors.brand)
    ) {
        Image(
            painter = painterResource(id = R.mipmap.main_default_header),
            contentDescription = "",
            modifier = Modifier
                .padding(5.dp)
                .size(50.dp)
                .clip(CircleShape)
                .clickable { MainScope().launch { drawerState.open() } },
            contentScale = ContentScale.Crop
        )
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .width(IntrinsicSize.Max)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable { },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = string(R.string.main_table_room_related),
                    style = TextStyle(
                        color = MyTheme.colors.gradient6_2[0],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = W800
                    )
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable { },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = string(R.string.main_table_room_all),
                    style = TextStyle(
                        color = MyTheme.colors.gradient6_2[0],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = W800
                    )
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(MyTheme.colors.uiFloated)
                    .clickable { },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = string(R.string.main_table_room_explore),
                    style = TextStyle(
                        color = MyTheme.colors.gradient6_2[0],
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = W800
                    )
                )
            }
        }
        Image(
            painter = painterResource(id = R.mipmap.main_room_search),
            contentDescription = "",
            modifier = Modifier
                .padding(5.dp)
                .fillMaxHeight()
                .width(28.dp)
                .clip(CircleShape)
                .clickable { context.startActivity(Intent(context, UserInfoActivity::class.java)) },
            contentScale = ContentScale.FillWidth
        )
    }
}

enum class AppScreen {
    RoomScreen,
    MessageScreen,
    MomentScreen,
}


