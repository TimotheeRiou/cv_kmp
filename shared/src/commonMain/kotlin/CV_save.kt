import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.text.KeyboardType
import androidx.compose.material.Divider
import androidx.compose.material.Text
//import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CV2() {
    val textColor = Color(0xFFF5F5F5)
    val sidebarColor = Color(0xFFCFCFCF)
    val sidebarTextColor = Color.Black

    var header by remember { mutableStateOf("Timothée Riou") }
    var aboutMe by remember { mutableStateOf("\nÉtudiant en Master Expert informatique. Je suis à l’écoute, responsable, autonome et motivé. J’ai le sens des responsabilités. Ayant occupé un profil DevOps lors de mes années d'alternance, je désire en faire mon futur métier.") }
    var skills by remember { mutableStateOf("- Génération de déploiement d'environnements\n" +
            "- Développement Bash/zsh\n" +
            "- Développement Scala\n" +
            "- Développement React.js\n" +
            "- Administration de SGBD\n" +
            "- Paramétrage ERP\n" +
            "- UI Design\n",) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF333333)) // Couleur de fond FF333333
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            // Sidebar à gauche
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(sidebarColor) // Couleur de la sidebar #434553
                    .padding(16.dp)
                    .fillMaxWidth(1f / 3f) // La largeur prend un tiers de l'écran
            ) {
                Text(
                    text = "À propos de moi",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = sidebarTextColor // Couleur du texte de la sidebar en noir
                )

                Spacer(modifier = Modifier.height(8.dp)) // Ajoute un espace vertical
                Text(
                    text = aboutMe,
                    color = sidebarTextColor // Couleur du texte de la sidebar en noir
                )
            }

            // Contenu principal à droite
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text(
                    text = header,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp),
                    color = textColor // Couleur du texte #f5f5f5
                )

                Divider(color = textColor) // Couleur de la ligne de séparation

                Text(
                    text = "Compétences",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp),
                    color = textColor // Couleur du texte #f5f5f5
                )
                Text(
                    text = skills,
                    color = textColor // Couleur du texte #f5f5f5
                )

                Text(
                    text = "Expériences professionnelles",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp),
                    color = textColor // Couleur du texte #f5f5f5
                )
                Text(
                    text = "1. Nom de l'entreprise\n   - Titre du poste\n   - Dates d'emploi\n   - Description des responsabilités et réalisations",
                    color = textColor // Couleur du texte #f5f5f5
                )
                Text(
                    text = "2. Nom de l'entreprise\n   - Titre du poste\n   - Dates d'emploi\n   - Description des responsabilités et réalisations",
                    color = textColor // Couleur du texte #f5f5f5
                )

                Text(
                    text = "Formations",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp),
                    color = textColor // Couleur du texte #f5f5f5
                )
                Text(
                    text = "1. Nom de l'institution\n   - Titre de la formation\n   - Année d'obtention",
                    color = textColor // Couleur du texte #f5f5f5
                )
                Text(
                    text = "2. Nom de l'institution\n   - Titre de la formation\n   - Année d'obtention",
                    color = textColor // Couleur du texte #f5f5f5
                )
            }
        }
    }
}
