package pers.dtao.springcloud.users.service

import pers.dtao.springcloud.users.controller.ResponseUserDTO
import pers.dtao.springcloud.users.service.bo.CreateUserBO
import pers.dtao.springcloud.users.service.bo.ResponseUserBO
import java.util.*

interface UserService {
    fun createUser(createUserBO: CreateUserBO): Optional<Long>
    fun getUserByPage(): List<ResponseUserBO>
}