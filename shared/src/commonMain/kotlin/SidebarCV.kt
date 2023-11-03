import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class SidebarInfo(
    val title: String,
    val aboutMe: String,
    val sidebarColor: Color,
    val sidebarTextColor: Color
)
@Composable
fun Sidebar(sidebarInfo: SidebarInfo) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .background(sidebarInfo.sidebarColor)
            .padding(16.dp)
            .fillMaxWidth(1f / 3f)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = imageResources("profile-pic.png"),
                contentDescription = "Profile picture",
                modifier = Modifier
                    .size(150.dp)
            )

            Text(
                text = "À propos de moi",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = sidebarInfo.sidebarTextColor
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = sidebarInfo.aboutMe,
                color = sidebarInfo.sidebarTextColor
            )
        }
    }
}



