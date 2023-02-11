package com.aam.viper4android.ui.effect

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.painterResource
import com.aam.viper4android.EffectCard
import com.aam.viper4android.R
import com.aam.viper4android.ui.ValueSlider

@Composable
fun SpectrumExtensionEffect() {
    var enabled by remember { mutableStateOf(false) }
    EffectCard(
        icon = painterResource(R.drawable.ic_vse),
        name = "Spectrum extension",
        enabled = enabled,
        onEnabledChange = { enabled = it }) {
        var strength by rememberSaveable { mutableStateOf(10) }  // TODO: Move to state
        Column {
            ValueSlider(
                title = "Strength",
                summaryUnit = "%",
                value = strength,
                onValueChange = { strength = it },
                valueRange = 0..100
            )
        }
    }
}