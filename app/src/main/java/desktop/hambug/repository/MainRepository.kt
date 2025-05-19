package desktop.hambug.repository

import javax.inject.Inject

class MainRepository @Inject constructor() {
    fun getMessage(): String = "test from repository"
}