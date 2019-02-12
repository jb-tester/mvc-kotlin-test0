package com.mytests.spring.kotlin.mvckotlintest0

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 ********************************
 * Created by Irina.Petrovskaya on 10/1/2018.
 * Project: mvc-kotlin-test0
 ********************************
 */
private const val MYCONST1 = "constants"
private const val MYCONST2 = "test000"
@Controller
@RequestMapping("/pathvariables/{class_level_var}")
class ControllerWithPathVariables {


    @ModelAttribute("ma1")
    fun ma1() = "controller-level model attribute1"

    @ModelAttribute
    fun ma2() = "noname controller-level model attribute"

    @GetMapping("/{p0:[a-zA-z]+}")
    fun test0(model: Model, @PathVariable p0:String, @PathVariable("class_level_var") clv:String):String{
        model.asMap()["attr01"] = "attr01"
        model.addAttribute("attr02", p0)
        model.asMap()["attr03"] = clv
        return "test0"
    }

    @GetMapping("/{my_version:\\d\\.\\d\\.\\d}")
    fun test00(@PathVariable(name ="my_version") vers:String, @PathVariable("class_level_var") clv:String, @ModelAttribute util: UtilComponent):ModelAndView{
        val modelAndView = ModelAndView("test00")
        modelAndView.addObject("version", vers)
        return modelAndView
    }

    @GetMapping("/$MYCONST1/{$MYCONST2}")
    fun test000(model: Model, @PathVariable("$MYCONST2") pathvar: String, @PathVariable("class_level_var") clv: String): String {

        model.addAttribute("attr0003",clv)
        model.addAttribute("attr0004", pathvar)
        return "test000"
    }
}