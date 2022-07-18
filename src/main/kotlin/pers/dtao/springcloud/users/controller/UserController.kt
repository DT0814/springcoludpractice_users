package pers.dtao.springcloud.users.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import pers.dtao.springcloud.users.service.UserService
import pers.dtao.springcloud.users.service.bo.ResponseUserBO
import java.util.*

@RestController
@RequestMapping("user")
class UserController(val userService: UserService) {
    @GetMapping("hello")
    fun sayHello(): ResponseEntity<String> {
        return ResponseEntity.ok("success")
    }

    @PostMapping
    fun addUser(@RequestBody createUserDTO: CreateUserDTO): ResponseEntity<String> {
        val res: Optional<Long> = userService.createUser(createUserDTO.toBO())
        return if (res.isPresent) {
            ResponseEntity.ok("success")
        } else {
            ResponseEntity.ok("failed")
        }
    }

    @GetMapping("user-list")
    fun getAllUser(): ResponseEntity<List<ResponseUserDTO>> {
        val res: List<ResponseUserBO> = userService.getUserByPage()
        return ResponseEntity.ok(res.map { ResponseUserDTO(id = it.id, name = it.name, address = it.address) })
    }

}

