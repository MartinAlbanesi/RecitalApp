package main.kotlin.repositories

import main.kotlin.data.User

object UserRepository {

    private val users = mutableListOf<User>()

    init {
        users.add(User(1504L, "MARTIN_ALBANESI", "abc4321", "Martin", "Albanesi", 3500000.50, "2024/05/13"))
        users.add(User(2802L, "Fran25", "contraseña123", "Franco German", "Mazafra", 200000.50, "2021/01/20"))
        users.add(User(1510L, "jonaURAN", "@12345", "Jonatan", "Uran", 120000.0, "2018/04/15"))
    }

    fun login(): User? {
        return null
    }

}