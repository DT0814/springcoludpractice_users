package pers.dtao.springcloud.users.service.bo

import pers.dtao.springcloud.users.dao.entity.UserEntity


class CreateUserBO(val name: String, val address: String)
class ResponseUserBO(val id: Long, val name: String, val address: String)

fun CreateUserBO.toEntity(): UserEntity {
    return UserEntity(this.name, this.address)
}