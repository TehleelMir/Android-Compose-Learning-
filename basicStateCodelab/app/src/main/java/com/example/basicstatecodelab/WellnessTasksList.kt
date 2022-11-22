package com.example.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

/**
 * Created by Tehleel Mir
 * Date: 21.11.2022
 * Time: 10:09
 *
 * Description:
 */

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean) -> Unit
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { item -> item.id }
        ) {item ->
            WellnessTaskItem(
                taskName = item.label,
                onClose = { onCloseTask(item) },
                checked = item.checked,
                onCheckedChange = { checked -> onCheckedTask(item, checked) }
            )
        }
    }
}