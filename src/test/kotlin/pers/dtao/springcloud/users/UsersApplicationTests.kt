package pers.dtao.springcloud.users

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import javax.sql.DataSource

@SpringBootTest
class UsersApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Autowired
    private val dataSource: DataSource? = null

    @Test
    fun hikariConnectionPoolIsConfigured() {
        assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource?.javaClass?.name ?: "")
    }
}
