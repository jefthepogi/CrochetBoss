package com.example.crochetboss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.crochetboss.ui.theme.CrochetBossTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CrochetBossTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewChanges() {
    CrochetBossTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            App(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .fillMaxSize()
    ) {
        BasicSearchBar()
//        Image(
//            painter = painterResource(R.drawable.ic_app_logo),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .fillMaxWidth()
//        )
        Text(
            text = "Abbreviations Master List",
            fontSize = 30.sp,
            lineHeight = 38.sp,
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        AbbreviationList()
    }
}

@Composable
fun BasicSearchBar(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf(" ") }
    val colorTheme = MaterialTheme.colorScheme

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        IconButton(
            onClick = {}, // Make the icon be interactable, e.g., recolor bg when pressed
            modifier = Modifier
                .background(
                    color = colorTheme.surfaceVariant,
                    shape = RoundedCornerShape(topStart = 6.dp, bottomStart = 6.dp)
                )
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search keyword",
                tint = colorTheme.primary
            )
        }
        BasicTextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            maxLines = 1,
            textStyle = TextStyle(
                color = colorTheme.onSurfaceVariant,
                fontSize = 24.sp,

            ),
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = colorTheme.surfaceVariant,
                    shape = RoundedCornerShape(topEnd = 6.dp, bottomEnd = 6.dp),

                )
                .padding(horizontal = 12.dp, vertical = 8.dp)
        )
    }
}

@Composable
fun AbbreviationList() {
    val listState = rememberLazyListState()
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(4.dp),
        state = listState,
        modifier = Modifier
            .fillMaxSize()
    ) {
        itemsIndexed(
            listOf("sc", "ch")
        /* each abbreviations / crochet terms
        (Make this be stored in the local database) */)
        {
            index, abbr -> ListButton(name = "tits", abbreviation = abbr)
        }

    }
}

@Composable
fun ListButton(name: String, abbreviation: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clickable(onClick = {

            })
            .fillMaxWidth()
    ) {
        Text(
            text = abbreviation,
            fontSize = 24.sp,
            textAlign = TextAlign.Start
        )
    }
}