package com.ravenl.htmlannotator.core.handler

import com.ravenl.htmlannotator.core.TagStyler
import org.jsoup.nodes.Node

abstract class AbsStyledTextHandler : TagHandler() {

    override fun beforeChildren(
        builder: StringBuilder,
        rangeList: MutableList<TagStyler>,
        node: Node
    ) {
        if (builder.isNotEmpty()) {
            if (builder[builder.length - 1] != '\n') {
                builder.append('\n')
            }
        }
    }

    override fun handleTagNode(
        builder: StringBuilder,
        rangeList: MutableList<TagStyler>,
        node: Node,
        start: Int,
        end: Int
    ) {
        rangeList.add(getTagStyler(node, start, end))
    }

    abstract fun getTagStyler(node: Node, start: Int, end: Int): TagStyler

}