package com.ravenl.htmlannotator.compose.styler

import androidx.compose.ui.text.AnnotatedString

class ImageAnnotatedStyler(private val imageUrl: String, start: Int, end: Int) :
    AnnotatedTagStyler(start, end) {

    override fun addStyle(builder: AnnotatedString.Builder) {
        builder.addStringAnnotation("img", imageUrl, start, end)
    }
}