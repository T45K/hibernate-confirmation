package io.github.t45k.hibernate5

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class Hibernate5Application

fun main(args: Array<String>) {
	runApplication<Hibernate5Application>(*args)
}
