package utils

object Convert {
    fun stringToInt(): Int = readlnOrNull()?.trim()?.toIntOrNull() ?: 0
}