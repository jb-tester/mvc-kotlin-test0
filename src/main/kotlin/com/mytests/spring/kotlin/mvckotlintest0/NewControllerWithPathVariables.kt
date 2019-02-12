package com.mytests.spring.kotlin.mvckotlintest0

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

private const val MY_CONST1 = "/constants"
private const val MY_CONST2 = "test000"
@Controller
class NewControllerWithPathVariables {

    @GetMapping("$MY_CONST1"+"/{$MY_CONST2}")
    fun test000(model: Model, @PathVariable() test000:String):String{
        model.addAttribute("attr0004",test000)
        model.addAttribute("attr0003", test000)
        return "test000"
    }
}
