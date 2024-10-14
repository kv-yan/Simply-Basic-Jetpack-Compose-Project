package symply.homework.travelulu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import symply.homework.travelulu.commonpresentation.ui.theme.BasicJetpackComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicJetpackComposeProjectTheme {
                MainScreen()
            }
        }
    }
}
