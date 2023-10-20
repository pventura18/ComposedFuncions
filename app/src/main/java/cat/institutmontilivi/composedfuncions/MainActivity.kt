package cat.institutmontilivi.composedfuncions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.composedfuncions.ui.theme.ComposedFuncionsTheme
import cat.institutmontilivi.composedfuncions.composables.Calculadora
import cat.institutmontilivi.composedfuncions.composables.Desplegable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedFuncionsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposedFuncionsTheme {
        var diaTriat by remember { mutableStateOf("") }
        val dies = listOf("Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge")
        Column(modifier = Modifier.padding(15.dp)){
            Calculadora()
            Spacer(modifier = Modifier.height(15.dp))
            Desplegable(opcions = dies, onSeleccionChanged = {textSeleccionat: String ->
                diaTriat = textSeleccionat
            }
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Has triat el dia: $diaTriat")
        }
    }
}