package com.seine.main.ui.activity

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.viewpager.widget.ViewPager
import com.qin.common.base.MyApplication
import com.qin.common.ktx.string
import com.qin.common.theme.*
import com.seine.main.R
import com.seine.main.ui.AppMainScreen
import com.seine.main.ui.Pager
import com.seine.main.ui.convertAppMainScreen
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrawerAppComponent()
        }
    }
}

@Composable
fun DrawerAppComponent() {
    MyTheme(MyApplication.isDarkTheme) {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        ModalDrawer(
            drawerState = drawerState,
            gesturesEnabled = true,
            drawerContent = {
                DrawerContent()
            },
            drawerBackgroundColor = MyTheme.colors.uiFloated
        ) {

//            val (currentScreen, selectScreen) = remember { mutableStateOf(AppMainScreen.RoomRelatedJoined) }
//            Column(modifier = Modifier.fillMaxSize()) {
//                TopNavigationBar(drawerState)
//                Surface(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(MyTheme.colors.error)
//                        .weight(1f)
//                ) {
//                    CenterBody()
//                }
//                BottomNavigationBar(currentScreen, selectScreen)
//            }
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
fun TopNavigationBar(drawerState: DrawerState) {
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

@Composable
fun CenterBody() {

}

@Composable
fun BottomNavigationBar(currentScreen: AppMainScreen, selectScreen: AppMainScreen.() -> Unit) {
    val appScreen = currentScreen.convertAppMainScreen()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .clickable { selectScreen.invoke(AppMainScreen.RoomRelatedJoined) },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id =
                    if (appScreen == AppMainScreen.Room) R.mipmap.main_room_select else R.mipmap.main_room
                ),
                contentDescription = "",
                modifier = Modifier
                    .padding(0.dp, 5.dp, 0.dp, 0.dp)
                    .size(24.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = string(R.string.main_table_room),
                style = TextStyle(
                    color = if (appScreen == AppMainScreen.Room) Cyan_00D8C9 else Gray_8E8E93,
                    fontSize = 11.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = W800
                )
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .clickable { selectScreen.invoke(AppMainScreen.MomentFollowing) },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id =
                    if (appScreen == AppMainScreen.Moment) R.mipmap.main_moment_select else R.mipmap.main_moment
                ),
                contentDescription = "",
                modifier = Modifier
                    .padding(0.dp, 5.dp, 0.dp, 0.dp)
                    .size(24.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = string(R.string.main_table_moment),
                style = TextStyle(
                    color = if (appScreen == AppMainScreen.Moment) Cyan_00D8C9 else Gray_8E8E93,
                    fontSize = 11.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = W800
                )
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .clickable { selectScreen.invoke(AppMainScreen.MessageList) },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id =
                    if (appScreen == AppMainScreen.Message) R.mipmap.main_message_select else R.mipmap.main_message
                ),
                contentDescription = "",
                modifier = Modifier
                    .padding(0.dp, 5.dp, 0.dp, 0.dp)
                    .size(24.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = string(R.string.main_table_message),
                style = TextStyle(
                    color = if (appScreen == AppMainScreen.Message) Cyan_00D8C9 else Gray_8E8E93,
                    fontSize = 11.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = W800
                )
            )
        }
    }
}



