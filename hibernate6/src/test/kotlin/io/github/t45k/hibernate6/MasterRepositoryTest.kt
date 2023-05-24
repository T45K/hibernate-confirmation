package io.github.t45k.hibernate6

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MasterRepositoryTest {

    @Autowired
    lateinit var sut: MasterRepository

    @Test
    fun test() {
        assertDoesNotThrow { sut.select() }
        assertNotNull(sut.select())
    }
}
