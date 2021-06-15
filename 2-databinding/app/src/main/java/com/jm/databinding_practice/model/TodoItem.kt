package com.jm.databinding_practice.model

class TodoItem(val idx : Int, val title : String) {

    override fun toString(): String {
        return "\nid=> $idx, title=> $title"
    }
}