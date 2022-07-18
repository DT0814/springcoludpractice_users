package pers.dtao.springcloud.users.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import pers.dtao.springcloud.users.dao.entity.UserEntity

@Repository
@Component
interface UserRepository : JpaRepository<UserEntity, Long>