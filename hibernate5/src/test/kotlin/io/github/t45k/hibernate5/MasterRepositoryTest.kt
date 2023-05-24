package io.github.t45k.hibernate5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.dao.IncorrectResultSizeDataAccessException

@SpringBootTest
class MasterRepositoryTest {

    @Autowired
    lateinit var sut: MasterRepository

    @Test
    fun test() {
        assertThrows<IncorrectResultSizeDataAccessException> { sut.select() }
    }
}
