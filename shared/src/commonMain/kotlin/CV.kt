import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable
fun CV() {
    val textColor = Color(0xFFF5F5F5)
    val sidebarColor = Color(0xFFCFCFCF)
    val sidebarTextColor = Color.Black

    var header by remember { mutableStateOf("Timothée Riou") }
    var aboutMe by remember {
        mutableStateOf("\nÉtudiant en Master Expert informatique. Je suis à l’écoute, responsable, autonome et motivé. J’ai le sens des responsabilités. Ayant occupé un profil DevOps lors de mes années d'alternance, je désire en faire mon futur métier.")
    }
    var skills by remember {
        mutableStateOf(
            "- Génération de déploiement d'environnements\n" +
                    "- Développement Bash/zsh\n" +
                    "- Développement Scala\n" +
                    "- Développement React.js\n" +
                    "- Administration de SGBD\n" +
                    "- Paramétrage ERP\n" +
                    "- UI Design\n"
        )
    }

    val sidebarInfo = SidebarInfo("À propos de moi", aboutMe, sidebarColor, sidebarTextColor)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF333333))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Sidebar(sidebarInfo)
            Content(header, skills, textColor)
        }
    }
}
