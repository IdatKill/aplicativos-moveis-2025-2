# **Introdução ao Jetpack Compose**

## **1. O que é Jetpack Compose?**

### **Definição:**

Jetpack Compose é um **framework declarativo** para a criação de interfaces de usuário (UI) no Android. Ele simplifica o desenvolvimento de UIs com menos código e mais flexibilidade, tornando o design de interfaces mais intuitivo e reativo.

### **Principais Vantagens do Compose:**

- **Menos código:** Comparado ao sistema de Views tradicional.
- **Declarativo:** Você descreve como a interface deve parecer em um determinado estado, e o Compose faz o restante.
- **Reatividade nativa:** UIs atualizadas automaticamente quando o estado muda.
- **Compatível com o sistema de Views tradicional:** Pode ser integrado em projetos que ainda usam o sistema antigo.

---

## **2. Estrutura Básica do Jetpack Compose**

### **Exemplo de uma UI simples em Jetpack Compose:**

```kotlin
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*

@Composable
fun Saudacao(nome: String) {
    Text(text = "Olá, $nome!")
}

@Preview
@Composable
fun SaudacaoPreview() {
    Saudacao("Kotlin")
}
```

### **Explicação:**

- **@Composable:** Anotação usada para marcar funções que produzem UI. Todas as funções que constroem componentes de interface devem ser anotadas com `@Composable`.
- **Text:** Componente básico para exibir texto na tela.
- **Preview:** Função especial usada para visualizar o layout no Android Studio.

---

## **3. Estrutura de um Projeto Jetpack Compose**

Quando você cria um novo projeto com Jetpack Compose, a estrutura principal é semelhante a um projeto Android normal, mas com algumas diferenças no código UI.

### **Componentes Chave:**

- **`MainActivity`**: É onde você define o conteúdo usando `setContent {}`.
- **Composables**: Funções anotadas com `@Composable` que constroem a UI.
- **MaterialTheme**: Um conjunto de ferramentas para criar interfaces com o Material Design.

### **Exemplo de uma `MainActivity` com Jetpack Compose:**

```kotlin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuApp()
        }
    }
}

@Composable
fun MeuApp() {
    Surface(color = MaterialTheme.colors.background) {
        Saudacao("Mundo")
    }
}
```

### **O que mudou em relação ao sistema tradicional de Views?**

- Em vez de usar XML para descrever a interface, você usa código Kotlin diretamente.
- A função `setContent` define o conteúdo da tela.
- A UI é construída dentro de `Composables`.

---

## **4. Composables: Funções que constroem UIs**

### **O que são Composables?**

Funções anotadas com `@Composable` que definem como um pedaço da interface deve ser exibido. Eles são a base do Jetpack Compose.

### **Exemplo de Composables Simples:**

```kotlin
@Composable
fun Saudacao(nome: String) {
    Text(text = "Olá, $nome!")
}
```

Você pode combinar vários `Composables` para criar interfaces mais complexas:

```kotlin
@Composable
fun TelaDeBoasVindas() {
    Column(modifier = Modifier.padding(16.dp)) {
        Saudacao("Kotlin")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Bem-vindo ao Jetpack Compose!")
    }
}
```

- **Column:** Um layout que organiza elementos verticalmente.
- **Spacer:** Um componente que adiciona espaço entre elementos.
- **Modifier:** Uma forma de modificar a aparência ou comportamento de um `Composable`.

---

## **5. Gerenciamento de Estado no Jetpack Compose**

### **O que é Estado?**

O **estado** em Jetpack Compose define como a interface deve ser exibida em um determinado momento. Quando o estado muda, a UI é automaticamente recomposta, ou seja, ela se atualiza para refletir essas mudanças.

### **Exemplo de Gerenciamento de Estado:**

```kotlin
@Composable
fun Contador() {
    var contador by remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Você clicou $contador vezes")
        Button(onClick = { contador++ }) {
            Text("Clique aqui")
        }
    }
}
```

- **remember:** Armazena o estado de um valor para manter os dados ao longo do ciclo de vida do Composable.
- **mutableStateOf:** Cria uma variável cujo valor pode ser mutável e que provoca recomposições quando alterada.

---

## **6. Layouts e Organização de Componentes**

### **Principais Layouts:**

1. **Column:** Organiza os componentes verticalmente.
    
    ```kotlin
    Column {
        Text("Texto 1")
        Text("Texto 2")
    }
    ```
    
2. **Row:** Organiza os componentes horizontalmente.
    
    ```kotlin
    Row {
        Text("Texto 1")
        Text("Texto 2")
    }
    ```
    
3. **Box:** Sobrepõe componentes, permitindo controlar a posição dos itens.
    
    ```kotlin
    Box {
        Text("Texto ao fundo")
        Text("Texto sobreposto")
    }
    ```
    

### **Exemplo de Layout com Row e Column:**

```kotlin
@Composable
fun LayoutExemplo() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row {
            Text(text = "Item 1")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Item 2")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box {
            Text(text = "Texto dentro do Box")
        }
    }
}
```

---

## **7. Criando Interações com o Usuário**

Os **Componentes Interativos** são essenciais para criar aplicativos dinâmicos.

### **Exemplo de Botão Interativo:**

```kotlin
@Composable
fun BotaoExemplo() {
    var clicado by remember { mutableStateOf(false) }

    Button(onClick = { clicado = !clicado }) {
        Text(if (clicado) "Clicado!" else "Clique aqui")
    }
}
```

- **Button:** Um botão clicável que reage ao estado `clicado`.
- **Text:** Altera dinamicamente o texto conforme o estado muda.

### **Exemplo de Campo de Texto:**

```kotlin
@Composable
fun CampoDeTextoExemplo() {
    var texto by remember { mutableStateOf("") }

    Column {
        TextField(value = texto, onValueChange = { texto = it }, label = { Text("Digite algo") })
        Text(text = "Você digitou: $texto")
    }
}

```

- **TextField:** Um campo de entrada de texto que atualiza seu estado com a função `onValueChange`.

---

## **8. Conclusão da Aula**

- **Jetpack Compose** é um framework declarativo que facilita o desenvolvimento de UIs dinâmicas e reativas no Android.
- **Composables** são funções que constroem a interface de usuário.
- O **estado** define como a interface deve parecer em um dado momento, e as mudanças no estado recompõem a UI automaticamente.
- A organização de layouts pode ser feita com `Column`, `Row`, e `Box`.
- A **interatividade** é simples e declarativa, com botões e campos de texto facilmente configurados.