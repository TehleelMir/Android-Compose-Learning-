package com.example.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

/**
 * Created by Tehleel Mir
 * Date: 21.11.2022
 * Time: 11:49
 *
 * Description:
 */

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() {
            return _tasks
        }

    fun removeTask(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        tasks.find { it.id == item.id }?.let {task ->
            task.checked = checked
        }
    }

    private fun getWellnessTasks() = List(30) {
        WellnessTask(it, "Task # $it")
    }
}