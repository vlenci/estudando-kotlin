package nullable

fun main () {
    /*
     * EXERCÍCIO 1 — Entrada segura de idade
     *
     * Escreva um programa que:
     * 1. Peça ao usuário para digitar sua idade.
     * 2. Use `readLine()` e `toIntOrNull()` para tentar converter a entrada.
     * 3. Se o usuário digitar um valor inválido (ou nada), o programa deve usar a idade padrão de 18 anos.
     *
     * Exiba no final:
     * - "Idade registrada: X"
     */
    print("Digite sua idade: ")
    print(
        "Idade registrada: ${
            readln()
                .toIntOrNull()
                ?: 18
        }"
    )

    println()

    /*
 * EXERCÍCIO 2 — Soma com entrada opcional
 *
 * Escreva um programa que:
 * 1. Peça ao usuário dois números (um por vez).
 * 2. Use `toDoubleOrNull()` para converter cada entrada.
 * 3. Se algum dos números for inválido ou nulo, use 0.0 como valor padrão.
 *
 * No final, exiba:
 * - "Soma dos valores: X"
 *
 * Requisitos:
 * - Use o operador Elvis (`?:`) para aplicar os valores padrão.
 * - Não use `!!`.
 */

    val num1 = readln().toDoubleOrNull() ?: 0.0
    val num2 = readln().toDoubleOrNull() ?: 0.0

    println("Soma dos valores: ${num1 + num2}")

    /*
 * EXERCÍCIO DESAFIO — Analisador de Números e Operações
 *
 * Escreva um programa que:
 *
 * 1. Leia um número do usuário (pode ser decimal ou inteiro).
 *    - Se a entrada for inválida, use 0.0 como valor padrão.
 *
 * 2. Leia uma operação desejada: "dobro", "metade", "inverso" ou "quadrado".
 *
 * 3. Com base na operação digitada, aplique a transformação:
 *    - "dobro"    → multiplica por 2
 *    - "metade"   → divide por 2
 *    - "inverso"  → 1 / número  (mas evite divisão por zero)
 *    - "quadrado" → eleva ao quadrado
 *
 * 4. Se a operação for inválida, exiba a mensagem: "Operação inválida".
 *
 * 5. Exiba o resultado formatado com duas casas decimais.
 *
 * Requisitos:
 * - Use `toDoubleOrNull()` para validar a entrada do número.
 * - Use `when` como expressão.
 * - Use `?:` para valores padrão e segurança contra `null`.
 * - Trate divisão por zero com segurança.
 */

    val num = readln().toDoubleOrNull() ?: 0.0

    val op = readln()

    when (op) {
        "dobro" -> println(num * 2.0)
        "metade" -> println(num / 2.0)
        "inverso" -> if (num != 0.0) println(1 / num) else println("Não é possível divisão por zero")
        "quadrado" -> println(num * num)
        else -> println("Operação inválida")
    }


}