package pic.poc.learningtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform