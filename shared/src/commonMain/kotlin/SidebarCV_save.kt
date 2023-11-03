import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Sidebar2(aboutMe: String, sidebarColor: Color, sidebarTextColor: Color) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .background(sidebarColor)
            .padding(16.dp)
            .fillMaxWidth(1f / 3f)
    ) {
        Text(
            text = "À propos de moi",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = sidebarTextColor
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = aboutMe,
            color = sidebarTextColor
        )
    }
}