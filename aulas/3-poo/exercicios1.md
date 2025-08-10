# Exercícios - Classes e Objetos

## 1. Cadastro de Jogadores
Crie uma classe `Jogador` com atributos: `nome` (String), `posicao` (String) e `forcaDoChute` (Int).  
No `main`, crie uma lista de 5 jogadores.  
Use `forEach` para imprimir o nome de cada jogador no formato:  
`"Jogador: <nome>, Posição: <posicao>"`.

## 2. Filtrando Atacantes
A partir da lista de jogadores do exercício anterior, use `filter` para criar uma nova lista apenas com jogadores da posição "Atacante".
Depois, imprima seus nomes.

## 3. Média da Força de Chute
Usando a lista de jogadores, calcule a **média** da `forcaDoChute` usando `map` e `average()`.

## 4. Lista de Produtos e Preços
Crie uma classe `Produto` com atributos: `nome` (String), `preco` (Double) e `categoria` (String).
Crie uma lista de produtos e use `filter` para encontrar apenas os produtos da categoria `"Eletrônico"`.
Depois, imprima seus nomes.

## 5. Aumento Salarial

Crie uma classe `Funcionario` com atributos: `nome` (String) e `salario` (Double).
Crie uma função que receba uma lista de funcionários e aumente o salário em 10% usando `map`.
Depois, imprima os salários atualizados.

## 6. Notas de Alunos

Crie uma classe `Aluno` com atributos: `nome` (String) e `nota` (Double).
Use `filter` para criar uma lista apenas com alunos que tiraram nota **maior ou igual a 7**.
Imprima os nomes aprovados.

## 7. Transformando Nomes em Maiúsculas

Crie uma função que receba uma lista de jogadores e retorne apenas os nomes em letras maiúsculas usando `map`.

## 8. Cálculo de Idade Média

Crie uma classe `Pessoa` com atributos `nome` (String) e `idade` (Int).
Calcule a idade média das pessoas usando `map` e `average()`.

## 9. Banco de Contas

Crie uma classe `ContaBancaria` com atributos `titular` (String) e `saldo` (Double).
Use `map` para criar uma nova lista com saldo atualizado (acréscimo de R\$ 50 em cada conta).
Imprima o novo saldo.

## 10. Times de Futebol

Crie uma classe `Time` com atributos: `nome` (String) e `jogadores` (lista de `Jogador`).
Crie 2 times e imprima o nome de todos os jogadores usando `forEach` encadeado.
