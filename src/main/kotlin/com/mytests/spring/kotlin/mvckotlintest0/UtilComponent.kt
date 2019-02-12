package com.mytests.spring.kotlin.mvckotlintest0

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class UtilComponent {

    var id: String = "model attribute added using @ModelAttribute-annotated parameter of UtilComponent type"

    @Bean
    fun util2Component():Util2Component{
        return Util2Component();
    }
}