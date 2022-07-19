package pers.dtao.springcloud.users.service.impl

import org.springframework.stereotype.Service
import pers.dtao.springcloud.users.dao.UserRepository
import pers.dtao.springcloud.users.service.UserService
import pers.dtao.springcloud.users.service.bo.CreateUserBO
import pers.dtao.springcloud.users.service.bo.ResponseUserBO
import pers.dtao.springcloud.users.service.bo.toEntity
import java.util.*
import javax.transaction.Transactional

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {
    override fun createUser(createUserBO: CreateUserBO): Optional<Long> {
        return try {
            val saveUser = userRepository.save(createUserBO.toEntity())
            if (saveUser.id != null) {
                Optional.of(saveUser.id!!)
            } else {
                Optional.empty()
            }
        } catch (e: java.lang.Exception) {
            Optional.empty()
        }
    }

    @Transactional
    override fun getUserByPage(): List<ResponseUserBO> {
        return userRepository.findAll().map { ResponseUserBO(id = it.id!!, name = it.name, address = it.address) }
    }
}