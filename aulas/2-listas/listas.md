# Listas em Kotlin — Dominando Coleções

## 1. Introdução — Por que listas são tão importantes?

> "Imagina que você está criando um app de playlists de música. Como você guardaria a lista de músicas? Uma variável pra cada música? Isso seria insano. É aí que entram as listas."

**Listas** são **estruturas de dados lineares** que permitem armazenar vários elementos, acessá-los por índice e manipulá-los com facilidade.

## 2. Criando Listas — Imutáveis vs Mutáveis

### 📌 Lista Imutável (`listOf`)

```kotlin
fun main() {
    val frutas = listOf("Maçã", "Banana", "Morango")
    println(frutas[0]) // Maçã
    // frutas.add("Melancia") ❌ Erro: listOf é imutável
}
```

> Use quando os dados não devem ser alterados.

### 🔁 Lista Mutável (`mutableListOf`)

```kotlin
fun main() {
    val favoritos = mutableListOf("Breaking Bad", "Stranger Things")
    favoritos.add("Dark")
    favoritos.remove("Breaking Bad")
    println(favoritos)
}
```

> Use quando os dados precisam ser alterados durante a execução.

---

## 3. Iterando listas

### `for` clássico

```kotlin
var filmes = mutableListOf("Karate Kid", "Jumanji", "Kung Fu Panda")

for (filme in favoritos) {
    println("Filme: $filme!")
}
```

### `forEach`
.forEach { ... } é uma função de ordem superior em Kotlin.
Isso significa que ela recebe uma outra função como parâmetro (nesse caso, uma função lambda). O que ela faz é percorrer todos os elementos da lista e executar uma ação para cada um deles.

```kotlin
filmes.forEach { println("Assistindo: $it") }
```

`.forEach { ... }` é uma **função de ordem superior** em Kotlin.

Isso significa que ela recebe uma outra função como parâmetro (nesse caso, uma **função lambda**). O que ela faz é **percorrer todos os elementos da lista** e **executar uma ação para cada um deles**.

No Kotlin, quando você usa uma **lambda com apenas um parâmetro**, o nome padrão desse parâmetro é `it`.

Se quiser, você também pode nomear o parâmetro explicitamente:

```kotlin
filmes.forEach { filme ->
    println("Assistindo: $filme")
}
```

É **a mesma coisa**, só que mais explícito.

---

### `map` — Transformar elementos

```kotlin
val notas = listOf(7.5, 8.0, 9.2)
val notasComBonus = notas.map { it + 0.5 }
println(notasComBonus) // [8.0, 8.5, 9.7]
```

---

### `filter` — Filtrar elementos

```kotlin
val nomes = listOf("Ana", "Carlos", "Beatriz", "Arthur")
val comA = nomes.filter { it.startsWith("A") }
println(comA) // [Ana, Arthur]
```

---

### `groupBy` — Agrupando por categoria

```kotlin
val palavras = listOf("banana", "bola", "cachorro", "carro")
val agrupadas = palavras.groupBy { it.first() }
println(agrupadas)
// {b=[banana, bola], c=[cachorro, carro]}
```

---

### `find` e `any`

```kotlin
val techs = listOf("Kotlin", "JavaScript", "Python")

println(techs.find { it.length > 6 }) // JavaScript
println(techs.any { it == "Go" }) // false
```