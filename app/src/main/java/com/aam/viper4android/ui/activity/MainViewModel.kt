package com.aam.viper4android.ui.activity

import android.util.Log
import androidx.compose.runtime.snapshotFlow
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aam.viper4android.ViPERManager
import com.aam.viper4android.ui.effect.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val viperManager: ViPERManager,
) : ViewModel() {
    private val TAG = "MainViewModel"

    val masterLimiterState = MasterLimiterState()
    val spectrumExtensionState = SpectrumExtensionState()
    val firEqualizerState = FIREqualizerState()
    val fieldSurroundState = FieldSurroundState()
    val differentialSurroundState = DifferentialSurroundState()
    val dynamicSystemState = DynamicSystemState()
    val tubeSimulator6N1JState = TubeSimulator6N1JState()
    val viperBassState = ViPERBassState()
    val viperClarityState = ViPERClarityState()
    val auditorySystemProtectionState = AuditorySystemProtectionState()
    val analogXState = AnalogXState()
    val speakerOptimizationState = SpeakerOptimizationState()

    init {
        observeMasterLimiter()
        observeSpectrumExtension()
        observeFIREqualizer()
        observeFieldSurround()
        observeDifferentialSurround()
        observeDynamicSystem()
        observeTubeSimulator6N1J()
        observeViPERBass()
        observeViPERClarity()
        observeAuditorySystemProtection()
        observeAnalogX()
        observeSpeakerOptimization()
    }

    private fun observeMasterLimiter() {
        snapshotFlow { masterLimiterState.outputGain }
            .onEach {
                Log.d(TAG, "observeMasterLimiter: outputGain: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { masterLimiterState.outputPan }
            .onEach {
                Log.d(TAG, "observeMasterLimiter: outputPan: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { masterLimiterState.thresholdLimit }
            .onEach {
                Log.d(TAG, "observeMasterLimiter: thresholdLimit: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeSpectrumExtension() {
        snapshotFlow { spectrumExtensionState.enabled }
            .onEach {
                Log.d(TAG, "observeSpectrumExtension: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { spectrumExtensionState.strength }
            .onEach {
                Log.d(TAG, "observeSpectrumExtension: strength: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeFIREqualizer() {
        snapshotFlow { firEqualizerState.enabled }
            .onEach {
                Log.d(TAG, "observeFIREqualizer: enabled: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeFieldSurround() {
        snapshotFlow { fieldSurroundState.enabled }
            .onEach {
                Log.d(TAG, "observeFieldSurround: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { fieldSurroundState.surroundStrength }
            .onEach {
                Log.d(TAG, "observeFieldSurround: surroundStrength: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { fieldSurroundState.midImageStrength }
            .onEach {
                Log.d(TAG, "observeFieldSurround: midImageStrength: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeDifferentialSurround() {
        snapshotFlow { differentialSurroundState.enabled }
            .onEach {
                Log.d(TAG, "observeDifferentialSurround: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { differentialSurroundState.delay }
            .onEach {
                Log.d(TAG, "observeDifferentialSurround: delay: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeDynamicSystem() {
        snapshotFlow { dynamicSystemState.enabled }
            .onEach {
                Log.d(TAG, "observeDynamicSystem: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { dynamicSystemState.deviceType }
            .onEach {
                Log.d(TAG, "observeDynamicSystem: deviceType: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { dynamicSystemState.dynamicBassStrength }
            .onEach {
                Log.d(TAG, "observeDynamicSystem: dynamicBassStrength: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeTubeSimulator6N1J() {
        snapshotFlow { tubeSimulator6N1JState.enabled }
            .onEach {
                Log.d(TAG, "observeTubeSimulator6N1J: enabled: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeViPERBass() {
        snapshotFlow { viperBassState.enabled }
            .onEach {
                Log.d(TAG, "observeViPERBass: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { viperBassState.bassMode }
            .onEach {
                Log.d(TAG, "observeViPERBass: bassMode: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { viperBassState.bassFrequency }
            .onEach {
                Log.d(TAG, "observeViPERBass: bassFrequency: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { viperBassState.bassGain }
            .onEach {
                Log.d(TAG, "observeViPERBass: bassGain: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeViPERClarity() {
        snapshotFlow { viperClarityState.enabled }
            .onEach {
                Log.d(TAG, "observeViPERClarity: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { viperClarityState.clarityMode }
            .onEach {
                Log.d(TAG, "observeViPERClarity: clarityMode: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { viperClarityState.clarityGain }
            .onEach {
                Log.d(TAG, "observeViPERClarity: clarityGain: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeAuditorySystemProtection() {
        snapshotFlow { auditorySystemProtectionState.enabled }
            .onEach {
                Log.d(TAG, "observeAuditorySystemProtection: enabled: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeAnalogX() {
        snapshotFlow { analogXState.enabled }
            .onEach {
                Log.d(TAG, "observeAnalogX: enabled: $it")
            }
            .launchIn(viewModelScope)

        snapshotFlow { analogXState.level }
            .onEach {
                Log.d(TAG, "observeAnalogX: level: $it")
            }
            .launchIn(viewModelScope)
    }

    private fun observeSpeakerOptimization() {
        snapshotFlow { speakerOptimizationState.enabled }
            .onEach {
                Log.d(TAG, "observeSpeakerOptimization: enabled: $it")
            }
            .launchIn(viewModelScope)
    }
}