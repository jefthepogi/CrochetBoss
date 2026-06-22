package com.example.crochetboss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.crochetboss.ui.theme.CrochetBossTheme
import com.example.crochetboss.ui.theme.AppIcons

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen { innerPad ->
                MasterListPage(
                    modifier = Modifier.padding(innerPad)
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewChanges() {
    MainScreen { innerPad ->
        MasterListPage(
            modifier = Modifier.padding(innerPad)
        )
    }
}

@Composable
private fun MainScreen(content: @Composable (innerPad: PaddingValues) -> Unit) {
    CrochetBossTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            content(innerPadding)
        }
    }
}

@Composable
private fun MasterListPage(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .fillMaxSize()
            .padding(all = 20.dp)
    ) {
        Text(
            text = "Abbreviations Master List",
            textAlign = TextAlign.Start,
            autoSize = TextAutoSize.StepBased(
                minFontSize = 24.sp,
                maxFontSize = 26.sp
            ),
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth()
        )
        BasicSearchBar()
//        Image(
//            painter = painterResource(R.drawable.ic_app_logo),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .fillMaxWidth()
//        )
        AbbreviationList()
    }
}

@Composable
private fun BasicSearchBar(modifier: Modifier = Modifier) {
    val textState = rememberTextFieldState("")
    val myColorScheme = MaterialTheme.colorScheme

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .padding(vertical = 8.dp)
    ) {
        BasicTextField(
            state = textState,
            lineLimits = TextFieldLineLimits.SingleLine,
            textStyle = TextStyle(
                fontSize = 24.sp,
            ),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(
                    color = myColorScheme.surface,
                    shape = RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp)
                )
                .padding(vertical = 8.dp)
        )
        IconButton(
            onClick = {}, // Make the icon be interactable, e.g., recolor bg when pressed
            modifier = Modifier
                .wrapContentSize()
                .background(
                    color = myColorScheme.surface,
                    shape = RoundedCornerShape(topEnd = 20.dp, bottomEnd = 20.dp)
                )
        ) {
            Icon(
                imageVector = AppIcons.search,
                contentDescription = "Search",
                tint = myColorScheme.onSurface
            )
        }
    }
}

@Composable
private fun AbbreviationList() {
    val listState = rememberLazyListState()
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(4.dp),
        state = listState,
        modifier = Modifier
            .fillMaxSize()
    ) {
        itemsIndexed(
            listOf("sc", "ch", "buratbu")
        /* each abbreviation / crochet terms
        (Make this be stored in the local database) */)
        {
            index, abbr -> ListButton(name = "tits", abbreviation = abbr)
        }

    }
}

@Composable
private fun ListButton(name: String, abbreviation: String, modifier: Modifier = Modifier) {
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