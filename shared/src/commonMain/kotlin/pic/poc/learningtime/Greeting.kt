package pic.poc.learningtime

import kotlinx.coroutines.delay

class Greeting {
    private val platform: Platform = getPlatform()

    suspend fun greeting(): String {
        delay(2000) // Fingindo operação assíncrona
        return "Faaaala povo do ${platform.name}!"
    }
}