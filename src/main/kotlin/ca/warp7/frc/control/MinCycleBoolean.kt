package ca.warp7.frc.control

class MinCycleBoolean(private val minCycles: Int = 1) {
    private var lastValue = false
    private var cycleCount = 0

    fun update(newValue: Boolean): Boolean {
        if (newValue) cycleCount++
        else cycleCount = 0
        return cycleCount >= minCycles
    }
}