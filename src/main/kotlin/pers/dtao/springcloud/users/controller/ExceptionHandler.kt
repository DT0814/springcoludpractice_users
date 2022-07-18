package pers.dtao.springcloud.users.controller

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.method.HandlerMethod


@ControllerAdvice
class ErrorControllerAdvice {
    @ExceptionHandler(RuntimeException::class)
    fun handlerError(ex: RuntimeException, hm: HandlerMethod) {
        println("统一异常处理")
        println(ex.message) //异常信息
        println(hm.bean.javaClass) //哪个类下
        println(hm.method.name) //在哪个方法的
    }
}