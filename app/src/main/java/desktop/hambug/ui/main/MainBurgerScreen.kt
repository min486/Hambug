package desktop.hambug.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import desktop.hambug.R
import desktop.hambug.ui.theme.preBoldTitle3

@Composable
fun MainBurgerScreen(navController: NavHostController) {
//    Text(text = "burger")


//    val tabs = listOf("Tab 1", "Tab 2", "Tab 3")
    val tabs = listOf("프랜차이즈", "수제버거")

//    val contentScreens = listOf(
//        { ExampleScreen1() },
//        { ExampleScreen2() },
//        { ExampleScreen3() }
//    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TabRowComponent(
            tabs = tabs,
//            contentScreens = contentScreens,
            contentScreens = listOf(
                { ExampleScreen1() },
                { ExampleScreen2() }
            ),
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Composable
fun TabRowComponent(
    tabs: List<String>,
    contentScreens: List<@Composable () -> Unit>,
    modifier: Modifier = Modifier,
) {
    // State to keep track of the selected tab index
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    // Column layout to arrange tabs vertically and display content screens
    Column(modifier = modifier.fillMaxSize()) {
        // TabRow composable to display tabs
        TabRow(
            selectedTabIndex = selectedTabIndex,
//            containerColor = containerColor,
            containerColor = Color.Transparent,
//            contentColor = contentColor,
            contentColor = Color.Black,
            indicator = { tabPositions ->
//                TabRowDefaults.Indicator(
//                    modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
//                    color = indicatorColor
//                )

                // 선택된 탭 아래 라인표시
                TabRowDefaults.PrimaryIndicator(
                    modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    color = Color.Red,
                    width = 40.dp
                )
//                TabRowDefaults.SecondaryIndicator(
//                    color = Color.Yellow,
//                    height = 10.dp
//                )
            },
            // 탭 아래 기본 회색라인 제거
            divider = {},
//            modifier = Modifier.border(10.dp, Color.Yellow)
//            modifier = Modifier.width(200.dp)
            modifier = Modifier.wrapContentWidth()
        ) {
            // Iterate through each tab title and create a tab
            tabs.forEachIndexed { index, tabTitle ->
                Tab(
//                    modifier = Modifier.padding(all = dimen_16dp),
                    modifier = Modifier.padding(all = 16.dp),
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
//                    selectedContentColor = Color.Yellow
                ) {
                    // Text displayed on the tab
                    Text(text = tabTitle)
                }
            }
        }

        // Display the content screen corresponding to the selected tab
        contentScreens.getOrNull(selectedTabIndex)?.invoke()
//        contentScreens[selectedTabIndex]
    }
}

@Composable
fun ExampleScreen1() {

    val listState = rememberLazyListState()

    Column(

    ) {
//        Text(
//            text = "test11",
//            style = preBoldTitle3
//        )

        Spacer(modifier = Modifier.height(40.dp))

        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
    //            .background(Color.White)
    //            .background(color = Color(0xFFFFE2E2))
                .background(color = Color(0xFFeeeeee))
                .padding(horizontal = 16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "프랜차이즈 버거 정보",
                    style = preBoldTitle3
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
    //                    .background(Color.Yellow),
    //                    .background(color = Color(0xFFf1a7b5)),
                        // 사이트 참고한 색
    //                    .background(color = Color(0xFFFFE2E2))
                        // 추천받은 색
    //                    .background(color = Color(0xFFf7c3c0))
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.White)
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
    //                        .padding(16.dp)
    //                        .background(color = Color(0xFFf8d3d1))
                    ) {
                        Text(
                            text = "롯데리아"
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "매장 수 : 약 1000개"
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.lotte2),
                        contentDescription = null,
    //                    contentScale = ContentScale.Fit,
                        modifier = Modifier.size(80.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ExampleScreen2() {
    Column(

    ) {
        Text(
            text = "test22",
            style = preBoldTitle3
        )
    }
}