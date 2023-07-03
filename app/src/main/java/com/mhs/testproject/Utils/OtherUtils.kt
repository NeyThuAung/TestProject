package com.mhs.testproject.Utils

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.NumberFormat
import java.util.*

fun isNoDecimalValue(double: Double): Boolean = (double % 1) == 0.0

//create OtherUtils Object Kotlin File for ks format

fun removeDecimalValueWithFormat(double: Double):String{
    val nf: NumberFormat = NumberFormat.getInstance(Locale("en", "US"))
    nf.maximumFractionDigits = 10
    return nf.format(double)//String.format("%,f", s).split(".")[0]
}

fun Double.getFinalFormat() =
    if (isNoDecimalValue(this)) {
        removeDecimalValueWithFormat(this)
    } else {
        decimalFormat(this)
    }


fun decimalFormat(number: Double): String {
    val symbols = DecimalFormatSymbols(Locale.US)
    val decimalFormat = DecimalFormat("#,###,###,###.##",symbols)
    return decimalFormat.format(number)
}