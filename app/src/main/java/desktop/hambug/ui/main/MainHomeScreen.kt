package desktop.hambug.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import desktop.hambug.R
import desktop.hambug.ui.theme.HambugRed
import desktop.hambug.ui.theme.HambugYellow

@Composable
fun MainHomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        // 배너
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "banner",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(20.dp))

        // 이동버튼 2개
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = {  },
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(16.dp),
                colors = ButtonDefaults.buttonColors(
                  containerColor = HambugRed
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(92.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight()
                    ) {
                        Text(
                            text = "버거정보",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "프랜차이즈 &",
                            fontSize = 12.sp
                        )
                        Text(
                            text = "수제버거 정보",
                            fontSize = 12.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Image(
                        painter = painterResource(id = R.drawable.burger),
                        contentDescription = "burger",
                        alignment = Alignment.CenterEnd,
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Button(
                onClick = {  },
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = HambugYellow
                ),
                modifier = Modifier
                    .weight(1f)
                    .height(92.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight()
                    ) {
                        Text(
                            text = "커뮤니티",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "햄버그",
                            fontSize = 12.sp
                        )
                        Text(
                            text = "사용자들과 소통",
                            fontSize = 12.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Image(
                        painter = painterResource(id = R.drawable.community),
                        contentDescription = "community",
                        modifier = Modifier.fillMaxHeight()
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}

//@Preview(showBackground = true, backgroundColor = 0xFF00FF00)
@Preview(showBackground = true)
@Composable
fun MainHomeScreenPreview() {
//    MainHomeScreen()
}