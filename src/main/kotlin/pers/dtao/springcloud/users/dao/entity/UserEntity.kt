package pers.dtao.springcloud.users.dao.entity

import javax.persistence.*

@Entity
@Table(
    name = "users",
    indexes = [Index(name = "idx_users_u_name", columnList = "u_name")]
)
class UserEntity(
    @Column(name = "u_name", nullable = false, length = 20)
    val name: String,
    @Column(name = "u_address", nullable = false, length = 200)
    val address: String
) {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
}

