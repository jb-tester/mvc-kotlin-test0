package com.mytests.spring.kotlin.mvckotlintest0

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 ********************************
 * Created by Irina.Petrovskaya on 10/1/2018.
 * Project: mvc-kotlin-test0
 ********************************
 */
@Controller
@RequestMapping("/pathvariables/{class_level_var}")
class ControllerWithPathVariables {


    @GetMapping("/{p0:[a-zA-z]+}")
    fun test0(model: Model, @PathVariable p0:String, @PathVariable("class_level_var") clv:String):String{
        model.asMap()["attr01"] = "attr01"
        model.addAttribute("attr02", p0)
        model.asMap()["attr03"] = clv
        return "test0"
    }

    @GetMapping("/{version:\\d\\.\\d\\.\\d}")
    fun test00(@PathVariable version:String,  @PathVariable("class_level_var") clv:String):ModelAndView{
        val modelAndView = ModelAndView("test00")
        modelAndView.addObject("version", version)
        return modelAndView
    }
}