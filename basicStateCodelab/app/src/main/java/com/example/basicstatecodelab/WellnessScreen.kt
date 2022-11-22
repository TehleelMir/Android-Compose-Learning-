package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * Created by Tehleel Mir
 * Date: 19.11.2022
 * Time: 14:38
 *
 * Description:
 */

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellNessViewModel: WellnessViewModel = viewModel()
) {
    var count by remember {
        mutableStateOf(0)
    }
    Column(modifier = modifier) {
        WaterCounter(count = count) {
            count++
        }
        WellnessTaskList(
            list = wellNessViewModel.tasks,
            onCloseTask = { task -> wellNessViewModel.removeTask(task) },
            onCheckedTask = { task, checked ->
                wellNessViewModel.changeTaskChecked(task, checked)
            }
        )
    }
}