fun main() {
    // write your code here
    val character = java.util.Scanner(System.`in`).next().first()
    print(character.isUpperCase() || character.isDigit() && character != '0')
}