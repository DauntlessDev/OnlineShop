package com.dauntlessdev.onlineshop.Services

import com.dauntlessdev.onlineshop.Model.Category
import com.dauntlessdev.onlineshop.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslope Graphic  Beanie ", "$18", "hat1"),
        Product("Devslope Hat Black ", "$28", "hat2"),
        Product("Devslope Hat White ", "$20", "hat3"),
        Product("Devslope Hat Snapback ", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslope Hoodie  Beanie ", "$18", "hoodie1"),
        Product("Devslope Hoodie Black ", "$28", "hoodie2"),
        Product("Devslope Hoodie White ", "$20", "hoodie3"),
        Product("Devslope Hoodie Snapback ", "$22", "hoodie4")
    )
    val shirt = listOf(
        Product("Devslope Shirt  Black ", "$28", "shirt1"),
        Product("Devslope Shirt Gray ", "$38", "shirt2"),
        Product("Devslope Hoodie White ", "$25", "shirt3"),
        Product("Devslope KickMe", "$24", "shirt4")
    )
}