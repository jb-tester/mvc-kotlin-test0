package com.mytests.spring.kotlin.mvckotlintest0

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

/**
 ********************************
 * Created by Irina.Petrovskaya on 10/1/2018.
 * Project: mvc-kotlin-test0
 ********************************
 */
@Controller
@RequestMapping("/pathvariables/{class_level_var}")
class ControllerWithPathVariables {

    @RequestMapping("/{p0}")
    fun test0(model: Model, @PathVariable("p0") p0:String, @PathVariable("class_level_var") clv:String ):String{
        model.asMap()["attr01"] = "attr01"
        model.addAttribute("attr02", p0)
        model.asMap()["attr03"] = clv
        return "test0"
    }
}