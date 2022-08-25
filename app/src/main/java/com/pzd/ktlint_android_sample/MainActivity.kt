package com.pzd.ktlint_android_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pzd.ktlint_android_sample.ui.theme.KtlintandroidsampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KtlintandroidsampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    LazyListView()
                }
            }
        }
    }
}

@Composable
fun LazyListView() {
    val messages = remember { mutableListOf("Hello", "Hi", "How are things?") }
    // val messages = listOf("A", "B", "C")
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(messages) { message ->
                MessageRow(message)
            }
        }
    }
}

@Composable fun MessageRow(message: String) {
    Text(text = message)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KtlintandroidsampleTheme {
        LazyListView()
    }
}
