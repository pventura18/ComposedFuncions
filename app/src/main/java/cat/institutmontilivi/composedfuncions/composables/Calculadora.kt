package cat.institutmontilivi.composedfuncions.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun PreviewCalculadora(){
    Calculadora()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calculadora(
    modifier : Modifier = Modifier
) {
    var pantalla by remember { mutableStateOf("0") }
    var memoria by remember { mutableStateOf(0) }
    var estaEditant by remember { mutableStateOf(false) }
    var signe by remember { mutableStateOf("+") }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(10.dp)
    ){
        Text(text = pantalla,
            color = Color.Red,
            fontSize = 40.sp,
            textAlign = TextAlign.End,
            modifier = modifier.fillMaxWidth()
                .clip(RoundedCornerShape(percent = 15))
                .background(Color.White)
                .padding(10.dp)
            )
        Row(modifier = modifier
            .fillMaxWidth()){
            Column(modifier = modifier
                .weight(3f)){
                Row(modifier = modifier
                    ){
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "1"
                            }
                            else{
                                pantalla += "1"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "1",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "2"
                            }
                            else{
                                pantalla += "2"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "2",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "3"
                            }
                            else{
                                pantalla += "3"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "3",
                            color = Color(31, 35, 57)
                        )
                    }
                }
                Row(modifier = modifier
                    ){
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "4"
                            }
                            else{
                                pantalla += "4"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "4",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "5"
                            }
                            else{
                                pantalla += "5"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "5",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "6"
                            }
                            else{
                                pantalla += "6"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "6",
                            color = Color(31, 35, 57)
                        )
                    }
                }
                Row(modifier = modifier
                    ){
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "7"
                            }
                            else{
                                pantalla += "7"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "7",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "8"
                            }
                            else{
                                pantalla += "8"
                            }
                        },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "8",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant){
                                estaEditant = true
                                pantalla = "9"
                            }
                            else{
                                pantalla += "9"
                            }
                                  },
                        modifier = modifier
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "9",
                            color = Color(31, 35, 57)
                        )
                    }
                }
                Row(modifier = modifier
                    ){
                    Button(
                        onClick = {
                            if(signe == "=") {
                                signe = "+"
                                memoria = 0
                            }
                            if(!estaEditant) pantalla = "0"
                            else pantalla += "0"
                                  },
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "0",
                            color = Color(31, 35, 57)
                        )
                    }
                }
            }
            Column(modifier = modifier
                .weight(1f)){
                Button(
                    onClick = {
                        if(signe == "+") memoria += pantalla.toInt()
                        else if(signe == "-") memoria -= pantalla.toInt()
                        pantalla = memoria.toString()
                        signe = "+"
                        estaEditant = false
                    },
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))
                ) {
                    Text(
                        fontSize = 40.sp,
                        text = "+",
                        color = Color(31, 35, 57)
                    )
                }
                Button(
                    onClick = {
                        if(signe == "+") memoria += pantalla.toInt()
                        else if(signe == "-") memoria -= pantalla.toInt()
                        pantalla = memoria.toString()
                        signe = "-"
                        estaEditant = false
                              },
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))
                ) {
                    Text(
                        fontSize = 40.sp,
                        text = "-",
                        color = Color(31, 35, 57)
                    )
                }
                Button(
                    onClick = {
                        if(signe == "+") memoria += pantalla.toInt()
                        else if(signe == "-") memoria -= pantalla.toInt()
                        pantalla = memoria.toString()
                        signe = "="
                        estaEditant = false
                              },
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))
                ) {
                    Text(
                        fontSize = 40.sp,
                        text = "=",
                        color = Color(31, 35, 57)
                    )
                }
                Button(
                    onClick = {
                              pantalla = "0"
                        estaEditant = false
                        memoria = 0
                              },
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))
                ) {
                    Text(
                        fontSize = 40.sp,
                        text = "C",
                        color = Color(31, 35, 57)
                    )
                }
            }
        }
    }
}