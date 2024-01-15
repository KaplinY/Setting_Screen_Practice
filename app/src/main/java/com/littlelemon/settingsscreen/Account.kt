package com.littlelemon.settingsscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Account : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MyAccount() }
    }

    @Composable
    fun MyAccount(){
        Column (
            modifier = Modifier
                .padding(0.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ){
            Spacer(modifier = Modifier.height(30.dp))
            Row (modifier = Modifier
                .size(width = 378.dp, height = 40.dp)
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically){
                TextButton(onClick = { Intent(applicationContext,ProfileSettings::class.java).also {
                    startActivity(it) }}) {
                    Image(
                        painterResource(id = R.drawable.leftarrow),
                        contentDescription = "back arrow icon",
                        modifier = Modifier.size(20.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Settings", color = Color.Blue)
                }
                Spacer(modifier= Modifier
                    .weight(1f)
                    .fillMaxHeight())
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.size(width = 75.dp, height = 28.dp)) {
                    Text("Save",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.paddingFromBaseline(5.dp, 0.dp),
                        fontSize = 11.sp
                        )
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Name", fontWeight = FontWeight.Bold, modifier = Modifier.padding(18.dp),
                fontSize = 14.sp)
            MyTextField("First Name")
            MyTextField("Second Name")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Phone", fontWeight = FontWeight.Bold, modifier = Modifier.padding(18.dp),
                fontSize = 14.sp)
            MyTextField("Phone")
            Text(text = "Email", fontWeight = FontWeight.Bold, modifier = Modifier.padding(18.dp),
                fontSize = 14.sp)
            MyTextField("Email")
            Spacer(modifier=Modifier.weight(1f))
            Row(modifier = Modifier.padding(bottom = 20.dp)){
                Text("Get a copy of your data", modifier = Modifier.padding(start = 18.dp))
                Spacer(modifier=Modifier.weight(1f))
                Button(onClick = { /*TODO*/ }, contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.size(width = 75.dp, height = 28.dp)
                        .padding(end = 18.dp)) {
                    Text("Request", fontSize = 10.sp, modifier = Modifier.padding(top = 2.dp)
                    )
                }
            }

        }
    }
    @Composable
    fun MyTextField(label: String){
        var textState by remember { mutableStateOf("") }
        TextField(
            value = textState,
            onValueChange = {textState = it},
            modifier = Modifier.padding(start = 20.dp, bottom = 10.dp)
                .size(width = 350.dp, height = 50.dp),
            label = {Text(label)},
            maxLines = 1,
            shape = RoundedCornerShape(10.dp)
        )

    }
}