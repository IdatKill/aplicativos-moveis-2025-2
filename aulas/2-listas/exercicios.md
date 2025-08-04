# Listas em Kotlin

## **Exercício 1 — Criando uma lista simples**
Crie uma lista com os nomes de 5 frutas e imprima cada uma delas em uma linha.

---

## **Exercício 2 — Lista mutável com adição e remoção**
Crie uma lista mutável com 3 nomes de filmes. Adicione mais 2 e remova 1.

---

## **Exercício 3 — Acessando elementos**
Crie uma lista com 4 cores e imprima a primeira e a última.

---

## **Exercício 4 — Usando `map`**
Crie uma lista de 5 números inteiros e gere uma nova lista com o dobro de cada número.

---

## **Exercício 5 — Usando `filter`**
Filtre os números pares de uma lista de 10 números inteiros.

---

## **Exercício 6 — Usando `count`**
Conte quantas palavras com mais de 7 letras existem na lista.

```kotlin
val palavras = listOf("computador", "programação", "código", "internet", "algoritmo", "variável", "função", "estrutura", "condição", "repetição", "lista", "objeto", "classe", "kotlin")
```

---

## **Exercício 7 — Usando `find` e `any`**
Verifique se a lista contém a palavra “Kotlin” e encontre a primeira palavra que começa com “J”.

```kotlin
val linguagens = listOf("Python", "Java", "Kotlin", "C#", "JavaScript")
```

---

## **Exercício 8 — `groupBy` com objetos**
Agrupe uma lista de alunos por curso.

```kotlin
data class Aluno(val nome: String, val curso: String)

fun main() {
    val alunos = listOf(
        Aluno("Ana", "Computação"),
        Aluno("Bruno", "Engenharia"),
        Aluno("Carlos", "Computação"),
        Aluno("Diana", "Design")
    )
}
```

---

## **Exercício 9 — Ordenando listas**
Ordene uma lista de nomes em ordem alfabética e reversa.

```kotlin
val nomes = listOf("Carlos", "Ana", "Eduardo", "Beatriz")
```

---

## **Exercício 10 — Catálogo Geek**
Crie uma lista de produtos com nome e preço. Filtre os produtos acima de R$50, aplique 10% de desconto e imprima os nomes com o novo preço formatado.