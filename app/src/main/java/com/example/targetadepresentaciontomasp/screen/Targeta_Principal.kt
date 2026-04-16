package com.example.targetadepresentaciontomasp.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.targetadepresentaciontomasp.R
import androidx.compose.runtime.*
import coil.compose.AsyncImage
import androidx.compose.foundation.lazy.*
import androidx.compose.ui.text.style.TextAlign


@Composable
@Preview(showBackground = true)
fun TaretaDePresentacion(){
    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0xff808080)),
        contentAlignment = Alignment.Center,
        ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {

            Card(
                modifier = Modifier
                    .fillMaxWidth(0.85f),
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(Color(0xffE3E3E3))

            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.yo),
                        contentDescription = "yo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(150.dp)
                            .padding(10.dp)
                            .clip(RoundedCornerShape(16.dp))


                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Column() {

                        Text(
                            modifier = Modifier.padding(vertical = 16.dp),
                            text = "Tomás Poveda Trujillo ",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(
                            text = "Estudiante de Ingenieria de Sistemas ",
                            fontSize = 16.sp,
                            color = Color.DarkGray
                        )
                        Text(
                            text = "5to Semestre",
                            fontSize = 16.sp,
                            color = Color.DarkGray
                        )
                        Text(
                            text = "tomasPoveda11@gmail.com",
                            fontSize = 16.sp,
                            color = Color.DarkGray
                        )
                        Text(
                            text = "11-Octubre-2005",
                            fontSize = 16.sp,
                            color = Color.DarkGray
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.size(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.85f),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(
                        Color(0xffE3E3E3)
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Acordeon(
                        "Biografia",
                        "Nacido el 11 de Octubre del 2005,reside en Cajicá"
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Acordeon(
                        "Estudios",
                        "Entre los estudios se encuantran",
                        listOf(
                            "Primaria en el colegio Soto Mayór",
                            "Graduado de Secundaria con tecnico en instalación y mantenimiento de material industrial(sena) ",
                            "Actualmente realizando un pregrado en ingenieria de sistemas y computación en la universidad de cundinamarca (extención chia)"

                        )
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Acordeon(
                        "Mis Hobbies",
                        "Algunos de mis hobbies son:",
                        listOf(
                            "Pokemón TCG:Me gusta jugar cartas y multiples juegos de estrategia donde ocupo la probabilidad y estrategia como parte del juego",
                            "Trombon: Soy Trombonista megusta mucho mi instrumento y a su vez me gusta escuchar musica ",
                            "videojuegos: Si hay algo que hago todos los diás es jugar videojuegos aunque se 1 partida de 10 minutos",
                            "Lego: Me encanta armar legos es lo mejor que hay en la vida"
                        ),
                        listOf(
                            "https://kotaku.com/app/uploads/2022/10/d68416597a1904a583c5fab6e0e42245.jpg",
                            "https://i.ytimg.com/vi/ePWR-eQgCQU/maxresdefault.jpg",
                            "https://catnessgames.com/wp-content/uploads/2024/12/tipos-videojuegos-consolas-y-plataformas.jpg",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGVe64SfoSQDdiNFSZjoX4SJ7UZ2e0qSZ6EQ&s"
                        )

                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Acordeon(
                        "Pasatiempos",
                        "Entre mis pasatiempos tengo: ",
                        listOf(
                            "Escuchar musica de todo tipo (Menos reguetón)",
                            "Leer foros",
                            "Cocinar"
                        )
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Acordeon(
                        "Deportes",
                        "Ha realizado multiples de portes en los que se encuentran",
                        listOf(
                            "Ciclismo",
                            "Natación",
                            "Taekwondo",
                            "Tenis",
                            "Baloncesto",
                            "Futbol"
                        ),
                        listOf(
                            "https://umamexico.com/wp-content/uploads/2018/04/bodqueSanLucas.jpg",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAvBswabIcX9JAJJUs0UcSkJffnWkmGAIt5w&s",
                            "https://media.gq.com.mx/photos/61338d4d10757bfa84db816c/master/pass/taekwondo.jpg",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-pLYAW5UhiCfy3QsslHpeD2LaKh_DUEY2Mw&s",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW6yvEoH76EHTNVqu3nHtZE35IynNfFdm17A&s",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROuJIoufr72wL8dh0cUshKJb-m0p0xyLLhtw&s")

                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Acordeon(
                        "Mis gustos",
                        "Algunos de mis gustos serian: ",
                        listOf(
                            "El café de calidad",
                            "Los Animales ",
                            "La Tecnologia"
                        ),
                        listOf(
                            "https://coycoacademia.com/wp-content/uploads/2024/04/tendencias-barismo-2024-1.jpg",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdEz1gmQz52Ve2d6emvU_455r22d6X4VlcDg&s",
                            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlZWS4D8bkxRd3sMjza8fzi_bXAfP6isJcww&s",
                            "https://www.yarquitectura.com/wp-content/uploads/2023/06/que-es-arquitectura-de-computadoras.jpg",
                            "https://as2.ftcdn.net/jpg/04/75/87/35/1000_F_475873501_PRn6k6DlVIBy3vUbIcnc6INGCZVbdGSy.jpg")
                    )
                }

            }
        }
    }
}

@Composable
fun Acordeon(titulo: String,contenido:String,lista: List<String> = emptyList(), imagenes: List<String> = emptyList()){
    var expanded by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxWidth()
            .clickable{expanded =! expanded}
            .padding(vertical = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically){
            Text(
                text=titulo,
                modifier = Modifier.weight(1f),
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                fontSize = 20.sp
            )
            Text(
                text= if (expanded) "▲" else "▼",
                fontSize = 20.sp
            )
        }

        AnimatedVisibility(visible = expanded) {
            Column() {
                Text(text = contenido,
                    textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top= 8.dp)
                    .fillMaxWidth(),
                color = Color.DarkGray)
                if (lista.isNotEmpty()){
                    Spacer(modifier = Modifier.height(8.dp))
                    lista.forEach { item ->
                        Row(modifier = Modifier.padding(vertical = 2.dp)){
                            Text(
                                text = "♠",
                                fontSize = 16.sp)
                            Text(
                                item,
                                textAlign = TextAlign.Justify,
                                color = Color.DarkGray,
                                fontSize = 16.sp)
                        }
                    }

                }
                if (imagenes.isNotEmpty()){
                    Spacer(modifier = Modifier.height(16.dp))
                    Galeriaweb(imagenes)

                }


            }
        }
    }

}

@Composable
fun Galeriaweb(imagenes: List<String>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(imagenes){ url->
            AsyncImage(
                model = url,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp)
                    .clip(RoundedCornerShape(12.dp))
            )

        }
    }
}