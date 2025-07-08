package enums

import enums.Level.*
import enums.Role.*

fun main() {

    val r1 = USER

    println(r1.canDelete())
    println(r1.name)
    println(r1.level)

}

enum class Role(val level: Level) {
    USER(BASIC) {
        override fun canDelete(): Boolean = false

    },
    MODERATOR(MEDIUM) {
        override fun canDelete(): Boolean = false
    },
    ADMIN(HIGH) {
        override fun canDelete(): Boolean = true
    };

    abstract fun canDelete(): Boolean
}

enum class Level {
    BASIC,
    MEDIUM,
    HIGH;
}