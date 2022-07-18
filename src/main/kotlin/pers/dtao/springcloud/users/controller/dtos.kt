package pers.dtao.springcloud.users.controller

import pers.dtao.springcloud.users.service.bo.CreateUserBO

class CreateUserDTO(val name: String, val address: String)

class ResponseUserDTO(val id: Long, val name: String, val address: String)

fun CreateUserDTO.toBO(): CreateUserBO {
    return CreateUserBO(name = this.name, address = this.address)
}

