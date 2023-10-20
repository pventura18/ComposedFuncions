package cat.institutmontilivi.composedfuncions.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun PreviewDesplegable(){
    val dies = listOf("DG", "DL", "DM", "DC", "DJ", "DV", "DS")
    Desplegable(opcions = dies, onSeleccionChanged = {String -> {} })
}

@Composable
fun Desplegable(
    modifier : Modifier = Modifier,
    opcions: List<String>,
    onSeleccionChanged : ((String) -> Unit),
) {
    var desplegat by remember { mutableStateOf(false) }
    var opcioTriada by remember { mutableStateOf(0) }

    Column() {
        Row(
            modifier = modifier
        ) {

            Text(
                text = opcions[opcioTriada],
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(15))
                    .background(Color.Black)
                    .height(40.dp)
                    .align(Alignment.CenterVertically)
            )
            IconButton(
                onClick = { desplegat = !desplegat },
                modifier = modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(15))
                    .background(Color.Green)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Obre desplegable"
                )
            }
        }

        if (desplegat) {
            Column(
                modifier = modifier.background(Color.LightGray)
            ) {
                opcions.mapIndexed { index, valor ->
                    Text(text = valor,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .clip(RoundedCornerShape(percent = 5))
                            .background(
                                color =
                                if (index == opcioTriada)
                                    Color.Yellow
                                else
                                    Color(246,217,190)
                            )
                            .clickable {
                                opcioTriada = index
                                desplegat = false
                                onSeleccionChanged(opcions[opcioTriada])
                            }
                            .fillMaxWidth()

                    )


                }
            }
        }
    }
}
