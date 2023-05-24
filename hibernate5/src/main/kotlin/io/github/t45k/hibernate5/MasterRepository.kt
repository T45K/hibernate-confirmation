package io.github.t45k.hibernate5

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface MasterRepository : JpaRepository<Master, Int> {

    @Query("from Master a inner join Status b on a.seq = b.foreignKey")
    fun select(): Master?
}
