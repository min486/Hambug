package desktop.hambug.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    Text(text = "burger")

    val listState = rememberLazyListState()

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