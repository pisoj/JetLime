/*
* MIT License
*
* Copyright (c) 2024 Pushpal Roy
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*
*/
package com.pushpal.jetlime.ui.timelines

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pushpal.jetlime.JetLimeColumn
import com.pushpal.jetlime.JetLimeDefaults
import com.pushpal.jetlime.JetLimeEventDefaults
import com.pushpal.jetlime.ui.data.Item
import com.pushpal.jetlime.ui.data.getCharacters
import com.pushpal.jetlime.ui.timelines.event.VerticalEventContent

@ExperimentalAnimationApi
@Composable
fun VerticalDynamicTimeLine(modifier: Modifier = Modifier) {
  val listState = rememberLazyListState()
  val items = remember { mutableStateListOf<Item>() }
  val allCharacters = getCharacters().distinct()

  Scaffold(
    floatingActionButton = {
      Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
      ) {
        FloatingActionButton(
          modifier = Modifier.wrapContentSize(),
          onClick = {
            if (items.size < allCharacters.size) {
              val newItem = allCharacters[items.size]
              if (!items.contains(newItem)) {
                items.add(newItem)
              }
            }
            Log.e("VerticalDynamicTimeLine","Items: ${items.toList()}")
          },
          containerColor = MaterialTheme.colorScheme.secondaryContainer,
          contentColor = MaterialTheme.colorScheme.secondary,
        ) {
          Icon(Icons.Filled.Add, "Add item")
        }
        FloatingActionButton(
          modifier = Modifier.wrapContentSize(),
          onClick = {
            if (items.isNotEmpty()) {
              items.removeAt(items.size - 1)
            }
            Log.e("VerticalDynamicTimeLine","Items: ${items.toList()}")
          },
          containerColor = MaterialTheme.colorScheme.secondaryContainer,
          contentColor = MaterialTheme.colorScheme.secondary,
        ) {
          Icon(Icons.Filled.Delete, "Remove item")
        }
      }
    },
  ) { paddingValues ->
    Surface(
      modifier = modifier
        .padding(paddingValues)
        .fillMaxSize(),
    ) {
      JetLimeColumn(
        modifier = Modifier.padding(32.dp),
        listState = listState,
        style = JetLimeDefaults.columnStyle(
          lineBrush = JetLimeDefaults.lineGradientBrush(),
        ),
      ) {
        items.forEach { item ->
          JetLimeEvent(
            style = JetLimeEventDefaults.eventStyle(),
          ) {
            VerticalEventContent(item = item)
          }
        }
      }
    }
  }
}

@ExperimentalAnimationApi
@Preview("Preview VerticalDynamicTimeLine")
@Composable
private fun PreviewSimpleVerticalDynamicTimeLine() {
  VerticalDynamicTimeLine()
}
