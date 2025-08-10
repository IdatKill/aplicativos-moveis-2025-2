# Programação Orientada a Objetos (POO) com Kotlin

## 1. O que é Programação Orientada a Objetos?

Programação Orientada a Objetos (POO) é um **jeito de programar** que se baseia em **"objetos"** — como se fossem personagens, coisas ou elementos do mundo real — que possuem **características** e **comportamentos**.

> Imagine que estamos criando um jogo de futebol no computador, tipo o FIFA.
> 
> Cada jogador do time é um **objeto**: tem atributos (força do chute, altura, peso, nota geral) e ações (chutar, correr, passar a bola).

---

## 2. Conceitos Fundamentais

### 2.1 Classe

Uma **classe** é como a **receita** ou **molde** para criar objetos.

No futebol:  
A **classe `Jogador`** é como a ficha técnica que define o que todo jogador pode ter e fazer.  
Não é um jogador real, mas **o modelo para criar um**.

Exemplo em Kotlin:

```kotlin
class Jogador(
    var nome: String,
    var forcaDoChute: Int,
    var altura: Double,
    var peso: Double,
    var nota: Double
) {
    fun chutar() {
        println("$nome chutou com força $forcaDoChute!")
    }

    fun correr() {
        println("$nome está correndo pelo campo!")
    }
}
```

---

### 2.2 Objeto

Um **objeto** é o **jogador real** que existe no jogo, criado a partir da classe.

No futebol:
Se `Jogador` é o molde, **Neymar**, **Cristiano Ronaldo** ou **Messi** são objetos concretos.

```kotlin
fun main() {
    val neymar = Jogador("Neymar", 90, 1.75, 68.0, 92.0)
    val cr7 = Jogador("Cristiano Ronaldo", 95, 1.87, 83.0, 94.0)

    neymar.chutar()
    cr7.correr()
}
```

---

### 2.3 Atributos

São as **características** do objeto.
No futebol: força do chute, peso, altura, nota no FIFA.

```kotlin
var forcaDoChute: Int
var altura: Double
var peso: Double
var nota: Double
```

---

### 2.4 Métodos

São as **ações** do objeto.
No futebol: chutar, correr, driblar.

```kotlin
fun chutar() { ... }
fun correr() { ... }
```

---

## 3. Os 4 Pilares da POO

### 3.1 Encapsulamento

Encapsular é **proteger** as informações de um objeto, controlando como elas podem ser alteradas.

No futebol:
Nem todo mundo pode mudar a **nota do jogador** ou **força do chute**.
O técnico (classe) define como essas mudanças acontecem.

```kotlin
class Jogador(private var nota: Double) {
    fun getNota(): Double {
        return nota
    }

    fun melhorarNota(valor: Double) {
        if (valor > 0) {
            nota += valor
        }
    }
}
```

**Benefício:** Evita mudanças erradas e mantém a integridade do objeto.

---

### 3.2 Herança

Herança é quando **uma classe herda características e comportamentos de outra**.

No futebol:
Podemos ter uma **classe `Jogador`** e criar subclasses como **`Goleiro`**, **`Atacante`** e **`Zagueiro`**.
Todos são jogadores, mas cada um tem habilidades diferentes.

No Kotlin, para definir que a classe pode ser herdada por outras classes colocamos a palavra `open` antes de `class`.  
Caso a classe não possa ser herdada, usamos a palavra `final`.

> Por padrão, no Kotlin, todas as classes são `final`, ou seja, não podem ser herdadas.

Isso ajuda a vitar herança acidental (que pode causar bugs difíceis de rastrear), e força o programador a deixar explícito quando algo pode ser estendido.

```kotlin
open class Jogador(val nome: String) {
    fun correr() {
        println("$nome está correndo")
    }
}

class Goleiro(nome: String) : Jogador(nome) {
    fun defender() {
        println("$nome fez uma defesa incrível!")
    }
}

fun main() {
    val hugo = Goleiro("Hugo")
    hugo.correr()  // herdado
    hugo.defender() // exclusivo do goleiro
}
```

---

### 3.3 Polimorfismo

Polimorfismo significa **muitas formas**.
Um mesmo método pode se comportar de jeitos diferentes dependendo de quem o usa.

Usamos a palavra `override` para criar uma função polimorfica.

No futebol:
O método `chutar()` existe para todos, mas um atacante chuta para fazer gol e um goleiro chuta para afastar a bola.

```kotlin
open class Jogador(val nome: String) {
    open fun chutar() {
        println("$nome chutou a bola")
    }
}

class Atacante(nome: String) : Jogador(nome) {
    override fun chutar() {
        println("$nome chutou forte em direção ao gol!")
    }
}

class Goleiro(nome: String) : Jogador(nome) {
    override fun chutar() {
        println("$nome chutou para afastar a bola da área!")
    }
}

fun main() {
    val atacante = Atacante("Mbappé")
    val goleiro = Goleiro("Courtois")

    atacante.chutar()
    goleiro.chutar()
}
```

---

### 3.4 Abstração

Abstração é **esconder detalhes complexos e mostrar apenas o que é necessário**.

No futebol:
Quando você manda o jogador `chutar()`, você não precisa saber **como** ele movimenta o pé, calcula o ângulo, etc.
Você só sabe que ele vai chutar.

Usamos a palavra `abstract` antes de `class` para deixar explícito que usaremos uma classe abstrata.

```kotlin
abstract class Jogador(val nome: String) {
    abstract fun chutar()
}

class Atacante(nome: String) : Jogador(nome) {
    override fun chutar() {
        println("$nome chutou para marcar o gol!")
    }
}
```

---

## 4. Resumo

| Conceito       | No Futebol                                  | No Código                   |
| -------------- | ------------------------------------------- | --------------------------- |
| Classe         | Ficha técnica do jogador                    | `class Jogador`             |
| Objeto         | Neymar, CR7, Messi                          | `val neymar = Jogador(...)` |
| Atributos      | Força do chute, altura, peso, nota          | Variáveis na classe         |
| Métodos        | Chutar, correr, driblar                     | Funções na classe           |
| Encapsulamento | Técnico controlando alterações              | `private` e getters/setters |
| Herança        | Tipos de jogadores (Goleiro, Atacante)      | `class Goleiro : Jogador`   |
| Polimorfismo   | Chute do atacante ≠ chute do goleiro        | `override fun chutar()`     |
| Abstração      | Saber que o jogador chuta sem ver o detalhe | `abstract class`           |