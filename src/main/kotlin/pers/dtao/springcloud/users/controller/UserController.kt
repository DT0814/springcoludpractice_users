package pers.dtao.springcloud.users.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.StringJoiner

@RestController
@RequestMapping("user")
class UserController {
    @GetMapping("hello")
    fun sayHello(): ResponseEntity<String> {
        return ResponseEntity.ok("success")
    }
}