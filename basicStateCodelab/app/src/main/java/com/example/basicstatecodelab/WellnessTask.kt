package com.example.basicstatecodelab

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Created by Tehleel Mir
 * Date: 21.11.2022
 * Time: 10:06
 *
 * Description:
 */

data class WellnessTask(
    val id: Int,
    val label: String,
    private val initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)
}