package desktop.hambug.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import desktop.hambug.R

private val preMedium = FontFamily(
    Font(R.font.pretendard_medium)
)

private val preSemiBold = FontFamily(
    Font(R.font.pretendard_semibold)
)

private val preBold = FontFamily(
    Font(R.font.pretendard_bold)
)

// 큰 타이틀 - Bold
val preBoldBigTitle = TextStyle(
    fontFamily = preBold,
    fontSize = 34.sp,
    lineHeight = 41.sp,
    letterSpacing = -(0.4).sp
)

// 제목1 - Bold
val preBoldTitle1 = TextStyle(
    fontFamily = preBold,
    fontSize = 28.sp,
    lineHeight = 34.sp,
    letterSpacing = -(0.1).sp
)

// 제목2 - Bold
val preBoldTitle2 = TextStyle(
    fontFamily = preBold,
    fontSize = 22.sp,
    lineHeight = 28.sp,
    letterSpacing = -(0.1).sp
)

// 제목3 - Bold
val preBoldTitle3 = TextStyle(
    fontFamily = preBold,
    fontSize = 20.sp,
    lineHeight = 25.sp,
    letterSpacing = -(0.1).sp
)

// 본문1 - Medium
val preMediumBody1 = TextStyle(
    fontFamily = preMedium,
    fontSize = 16.sp,
    lineHeight = 21.sp,
    letterSpacing = -(0.2).sp
)

// 본문1 - Bold
val preBoldBody1 = TextStyle(
    fontFamily = preBold,
    fontSize = 16.sp,
    lineHeight = 21.sp,
    letterSpacing = -(0.2).sp
)

// 본문2 - Medium
val preMediumBody2 = TextStyle(
    fontFamily = preMedium,
    fontSize = 14.sp,
    lineHeight = 19.sp,
    letterSpacing = -(0.2).sp
)

// 본문2 - Bold
val preBoldBody2 = TextStyle(
    fontFamily = preBold,
    fontSize = 14.sp,
    lineHeight = 19.sp,
    letterSpacing = -(0.2).sp
)

// 본문3 - Medium
val preMediumBody3 = TextStyle(
    fontFamily = preMedium,
    fontSize = 12.sp,
    lineHeight = 17.sp,
    letterSpacing = -(0.2).sp
)

// 본문3 - Bold
val preBoldBody3 = TextStyle(
    fontFamily = preBold,
    fontSize = 12.sp,
    lineHeight = 17.sp,
    letterSpacing = -(0.2).sp
)

// 본문4 - Medium
val preMediumBody4 = TextStyle(
    fontFamily = preMedium,
    fontSize = 10.sp,
    lineHeight = 15.sp,
    letterSpacing = -(0.2).sp
)

// 본문4 - Bold
val preBoldBody4 = TextStyle(
    fontFamily = preBold,
    fontSize = 10.sp,
    lineHeight = 15.sp,
    letterSpacing = -(0.2).sp
)

// 버튼S - SemiBold
val preSemiBoldButtonS = TextStyle(
    fontFamily = preSemiBold,
    fontSize = 10.sp,
    letterSpacing = -(0.2).sp
)

// 버튼M - SemiBold
val preSemiBoldButtonM = TextStyle(
    fontFamily = preSemiBold,
    fontSize = 12.sp,
    letterSpacing = -(0.2).sp
)

// 버튼L - SemiBold
val preSemiBoldButtonL = TextStyle(
    fontFamily = preSemiBold,
    fontSize = 14.sp,
    letterSpacing = -(0.2).sp
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)