import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp


@Composable
fun Content(header: String, skills: String, textColor: Color) {
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
            color = textColor
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
            text = "- KMSE\n   - Apprenti DevOps\n   - Septembre 2021 - Aujourd'hui\n   - Description des responsabilités et réalisations",
            color = textColor // Couleur du texte #f5f5f5
        )
        Text(
            text = "- ProPR Consulting\n   - Développeur Web\n   - Janvier - Février 2021\n   - Développement d'un site vitrine",
            color = textColor // Couleur du texte #f5f5f5
        )
        Text(
            text = "- Veesion\n   - Technicien informatique\n   - Mai - Juillet 2020\n   - Installation de serveurs\n - Configuration de serveurs pour la détection automatique de vols en magasins",
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
            text = "- EFFICOM\n   - Master Expert en Ingénierie Informatique\n   - 2022-2024",
            color = textColor // Couleur du texte #f5f5f5
        )
        Text(
            text = "- EFFICOM\n   - Bachelor Chef de Projet Informatique\n   - 2021-2022",
            color = textColor // Couleur du texte #f5f5f5
        )
        Text(
            text = "- EFREI \n   - BTS SIO\n   - 2019-2021",
            color = textColor // Couleur du texte #f5f5f5
        )
    }
}