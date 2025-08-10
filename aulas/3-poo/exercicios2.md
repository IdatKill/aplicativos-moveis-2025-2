# Exercícios - Herança

## 1. Criando uma Classe Base e Subclasse

Crie uma classe `Animal` com um atributo `nome` (String) e um método `fazerSom()` que imprime `"O animal faz um som"`.  
Depois, crie uma subclasse `Cachorro` que herda de `Animal` e sobrescreve o método `fazerSom()` para imprimir `"O cachorro late"`.

## 2. Herança com Novos Atributos

Crie uma classe `Veiculo` com atributo `marca` (String) e método `info()` que imprime `"Veículo da marca <marca>"`.
Crie uma subclasse `Carro` que adiciona um atributo `modelo` (String) e sobrescreve o método `info()` para imprimir `"Carro modelo <modelo> da marca <marca>"`.

## 3. Chamada ao Construtor da Superclasse

Crie uma classe `Pessoa` com atributos `nome` (String) e `idade` (Int).
Crie uma subclasse `Aluno` que adiciona o atributo `curso` (String).
No construtor de `Aluno`, chame o construtor da superclasse para inicializar `nome` e `idade`.

## 4. Usando `super` para acessar método da superclasse

Crie o método `apresentar()` na superclasse que imprime `Meu nome é <nome> e tenho <idade> anos.`
Na classe `Aluno`, sobrescreva o método `apresentar()` para imprimir `"Olá, eu sou <nome> e estudo <curso>."`.
Utilize o `super` para acessar o método original + o sobrescrito.

Exemplo:
```kotlin
fun main() {
    val aluno = Aluno("Carlos", 22, "Medicina")
    aluno.apresentar()
}
```

## 5. Herança e Polimorfismo

Crie uma classe base `Funcionario` com método `calcularSalario()` que retorna um `Double`.
Crie duas subclasses:

* `Gerente` que retorna salário fixo de 5000.0
* `Vendedor` que retorna salário fixo de 3000.0 mais comissão de 10% sobre vendas (atributo `vendas: Double`).

No `main`, crie uma lista de `Funcionario` com instâncias de `Gerente` e `Vendedor`.
Itere sobre essa lista e imprima o salário calculado de cada um (mostrando o polimorfismo em ação).