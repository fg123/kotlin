// IGNORE_BACKEND: JVM_IR
fun test() {
    if (false) {
        try {
            println("Hello Kotlin")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

// 0 INVOKE