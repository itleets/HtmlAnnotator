package com.ravenl.htmlannotator.view.handler

import com.fleeksoft.ksoup.nodes.Node
import com.ravenl.htmlannotator.core.css.model.CSSDeclaration
import com.ravenl.htmlannotator.core.handler.TagHandler
import com.ravenl.htmlannotator.core.model.TextStyler
import com.ravenl.htmlannotator.view.styler.ParagraphEndStyler
import com.ravenl.htmlannotator.view.styler.ParagraphStartStyler

open class ParagraphHandler(private val extraLine: Boolean) : TagHandler() {


    open override fun addTagStylers(
        list: MutableList<TextStyler>,
        node: Node,
        cssDeclarations: List<CSSDeclaration>?
    ) {
        with(list) {
            add(ParagraphStartStyler(extraLine))
            add(ParagraphEndStyler(extraLine))
        }
    }
}