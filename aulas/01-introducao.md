# Introdução a Linguagem Kotlin

## O que é Kotlin?

Kotlin é uma linguagem moderna, criada pela JetBrains, e é **oficialmente suportada pela Google para o desenvolvimento de apps Android**. Ela é concisa, segura e fácil de aprender, especialmente se você já viu alguma linguagem como Java, JavaScript ou C#.

👉 [Link do Kotlinlang](https://kotlinlang.org/)  
👉 [Playground Kotlin](https://play.kotlinlang.org/)

### "Hello, world!" em Kotlin

```kotlin
fun main() {
    println("Olá, mundo!")
}
```

## 📦 1. Tipos de Dados

Kotlin é uma linguagem **estaticamente tipada**, ou seja, você precisa informar (ou o Kotlin irá deduzir) qual é o tipo da variável.

### 🔹 Principais tipos:

| Tipo      | Exemplo             |
| --------- | ------------------- |
| `Int`     | `val idade = 20`    |
| `Double`  | `val pi = 3.14`     |
| `Boolean` | `val ligado = true` |
| `String`  | `val nome = "Ana"`  |

### 🔸 `val` vs `var`:

* `val`: valor **imutável** (como `const`)
* `var`: valor **mutável**

```kotlin
val nome = "João" // não pode mudar depois
var idade = 18    // pode mudar
idade = 19
```

## ➕ 2. Operadores

Kotlin usa operadores bem parecidos com outras linguagens.

### Operadores aritméticos:

```kotlin
val a = 10
val b = 5

// adição
val soma = (a + b)     // 15

// subtração
val sub = (a - b)     // 5

// multiplicação
val mult = (a * b)     // 50

// divisão
val div = (a / b)     // 5 

// resto
val resto = (a % b)    // 0
```

### Operadores relacionais:

```kotlin
a > b   // maior
a < b   // menor
a == b  // igual
a >= b  // maior igual
a <= b  // menor igual
a != b  // diferente
```

### Operadores lógicos:

```kotlin
// && (AND)
// || (OR)
// ! (NOT)

val maiorDeIdade = true
val temCarteira = false

println(maiorDeIdade && temCarteira) // false
println(maiorDeIdade || temCarteira) // true
println(!temCarteira)                // true
```

## 🔀 3. Condicionais

### `if`, `else if`, `else`

```kotlin
val idade = 18

if (idade >= 18) {
    println("Maior de idade")
} else {
    println("Menor de idade")
}
```

### `when` — como se fosse o `switch`

```kotlin
val dia = 2

val nomeDia = when(dia) {
    1 -> "Domingo"
    2 -> "Segunda"
    3 -> "Terça"
    else -> "Dia inválido"
}

println(nomeDia)
```

## 📋 4. Listas

### Criando uma lista

```kotlin
fun main() {
  val frutas = listOf("Banana", "Maçã", "Laranja")
  println(frutas[0]) // Banana
}
```

### Lista mutável

```kotlin
fun main() {
  val numeros = mutableListOf(1, 2, 3)
  numeros.add(4)
  println(numeros) // [1, 2, 3, 4]
}
```

### Loop com `for`

```kotlin
fun main() {
  val frutas = listOf("Banana", "Maçã", "Laranja")
  
  for (fruta in frutas) {
    println("Fruta: $fruta")
  }
}
```

## 🧩 5. Funções

Funções ajudam a organizar seu código e evitar repetições.

```kotlin
fun saudacao(nome: String) {
  println("Olá, $nome!")
}

fun main() {
  saudacao("Etevaldo")   // Olá, Etevaldo!
}
```

### Função que retorna algo:

```kotlin
fun soma(a: Int, b: Int): Int {
  return a + b
}

fun main() {
  val resultado = soma(5, 3)
  println(resultado)   // 8
}
```

## 🧱 6. Classes e Objetos

Kotlin é orientado a objetos. Você pode criar suas próprias estruturas.

### Criando uma classe:

```kotlin
class Pessoa(val nome: String, var idade: Int) {
  fun apresentar() {
    println("Olá, meu nome é $nome e tenho $idade anos.")
  }
}
```

### Criando um objeto:

```kotlin
fun main() {
  val pessoa = Pessoa("Lebron James", 98)
  pessoa.apresentar()
}
```