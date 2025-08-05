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

---

## **Exercício 11 — Lista de preços com filtro e média**
Você é responsável por analisar os preços de uma loja. Crie uma lista com **8 preços diferentes**.
Sua tarefa é:

1. Remover os preços abaixo de R$10.
2. Calcular a **média dos preços restantes**.
3. Imprimir todos os preços válidos e a média final formatada com 2 casas decimais.

---

## **Exercício 12 — Pesquisa de idade com análise**
Você realizou uma pesquisa com um grupo de pessoas sobre suas idades. Guarde as idades em uma lista de inteiros.
Sua função deve:

1. Calcular a **quantidade de pessoas maiores de idade (18+)**.
2. Verificar se há **alguma pessoa com mais de 60 anos**.
3. Exibir a lista completa, a quantidade de maiores e se há idosos.

---

## **Exercício 13 — Seleção de nomes por inicial**
Você recebeu uma lista de nomes e precisa separar apenas os que começam com a letra **“M” ou “A”**.
Crie uma função chamada `filtrarNomes` que:

1. Recebe uma lista de nomes.
2. Retorna uma nova lista com os nomes desejados.
3. Depois, imprima os nomes filtrados.

```kotlin
val nomes = listOf("Maria", "João", "Ana", "Lucas", "Amanda", "Bruno", "Marcos")
```

---

## **Exercício 14 — Notas de alunos com classificação**
Você deve criar uma função que receba uma lista de notas de alunos.
Para cada nota:

1. Se for 7 ou mais, o aluno foi **Aprovado**.
2. Entre 5 e 6.9, está em **Recuperação**.
3. Abaixo de 5, **Reprovado**.

Imprima para cada nota a classificação correspondente, com o formato:

```
Nota 8.0 → Aprovado
Nota 6.5 → Recuperação
Nota 4.3 → Reprovado
```

```kotlin
val notas = listOf(8.0, 6.5, 4.3, 9.2, 5.0, 3.9)
```

---

## **Exercício 15 — Carrinho de compras com soma e desconto**
Simule um carrinho de compras com uma lista de valores.
Crie uma função `calcularTotalComDesconto` que:

1. Some todos os valores do carrinho.
2. Aplique um **desconto de 15%** se o total ultrapassar R$200.
3. Imprima o valor final a pagar (com ou sem desconto).

Use pelo menos 6 produtos no carrinho.