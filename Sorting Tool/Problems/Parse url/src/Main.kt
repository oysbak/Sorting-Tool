fun main() {
    // write your code here
    val url = readLine()!!
    val parameters = url.split('?')[1].split('&')
    var password: String? = null
    for (parameter in parameters) {
        val keyValue = parameter.split('=').toMutableList()
        if (keyValue[1].trim().length == 0) {
            keyValue[1] = "not found"
        }
        if (keyValue[0] == "pass") {
            password = keyValue[1]
        }
        println("${keyValue[0]} : ${keyValue[1]}")
    }
    if (password != null) {
        println("password : $password")
    }
}
