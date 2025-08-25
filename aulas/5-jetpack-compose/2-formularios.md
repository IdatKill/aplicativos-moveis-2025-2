# **Text, TextField, Button, Toast e Troca de Activities com Intents**

### **Text**

O componente **Text** é usado para exibir texto estático ou dinâmico na tela.

### **Exemplo Simples:**

```kotlin
@Composable
fun TextoExemplo() {
    Text(text = "Este é um exemplo de texto.")
}
```

### **Exibindo Texto Dinâmico:**

```kotlin
@Composable
fun TextoDinamicoExemplo() {
    val nome = "Kotlin"
    Text(text = "Olá, $nome!")
}
```

### **TextField**

O **TextField** é usado para capturar entradas do usuário. Pode ser usado para digitar texto, números, etc.

### **Exemplo de Entrada de Texto:**

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

- **TextField** permite a entrada de dados pelo usuário.
- **onValueChange** atualiza a variável associada ao campo de texto.

### **Button**

O **Button** é um componente interativo que reage ao clique do usuário.

### **Exemplo Simples de Button:**

```kotlin
@Composable
fun BotaoExemplo() {
    Button(onClick = { /* Ação ao clicar */ }) {
        Text("Clique aqui")
    }
}
```

### **Exemplo Interativo:**

```kotlin
@Composable
fun BotaoInterativo() {
    var texto by remember { mutableStateOf("Clique aqui") }

    Button(onClick = { texto = "Botão Clicado!" }) {
        Text(texto)
    }
}
```

- Ao clicar no botão, o texto muda de "Clique aqui" para "Botão Clicado!".

---

## **2. Exibindo Mensagens com Toast no Android**

O **Toast** é uma pequena mensagem pop-up que aparece brevemente na tela. Ele é muito útil para fornecer feedback rápido ao usuário.

### **Exemplo de Uso do Toast em Compose:**

Para exibir um Toast, precisamos do `context` da Activity.

```kotlin
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext

@Composable
fun ToastExemplo() {
    val context = LocalContext.current

    Button(onClick = {
        Toast.makeText(context, "Olá, este é um Toast!", Toast.LENGTH_SHORT).show()
    }) {
        Text("Exibir Toast")
    }
}
```

- **LocalContext.current**: Fornece o contexto da Activity atual, necessário para exibir o Toast.
- **Toast.makeText**: Cria e exibe a mensagem.

---

## **3. Troca de Activities com Intents**

### **O que é um Intent?**

Um **Intent** é uma abstração que permite interações entre diferentes componentes do Android, como Activities e Services. Usamos Intents para navegar entre telas (Activities).

### **Criando uma Segunda Activity**

No Android Studio, você pode adicionar uma nova Activity:

1. Vá até **File > New > Activity > Empty Activity**.
2. Dê um nome para a nova Activity (por exemplo, `SegundaActivity`).

### **Exemplo de Troca entre Activities com Intent:**

1. **MainActivity.kt**: Activity principal que contém um botão para abrir outra Activity.

```kotlin
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotaoTrocaDeTela()
        }
    }
}

@Composable
fun BotaoTrocaDeTela() {
    val context = LocalContext.current

    Button(onClick = {
        // Intent para abrir a SegundaActivity
        val intent = Intent(context, SegundaActivity::class.java)
        context.startActivity(intent)
    }) {
        Text("Abrir Segunda Activity")
    }
}
```

1. **SegundaActivity.kt**: A segunda tela que será aberta.

```kotlin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*

class SegundaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Esta é a Segunda Activity")
        }
    }
}
```

### **Explicação do Processo:**

- **Intent:** Usamos o **Intent** para navegar da `MainActivity` para a `SegundaActivity`.
- **context.startActivity(intent):** Inicia a segunda Activity.

---

## **4. Passando Dados entre Activities**

Podemos usar o **Intent** para passar dados de uma Activity para outra.

### **Exemplo de Passagem de Dados:**

1. **MainActivity.kt**: Envia dados para a `SegundaActivity`.

```kotlin
@Composable
fun BotaoComDados() {
    val context = LocalContext.current
    val nome = "Kotlin"

    Button(onClick = {
        val intent = Intent(context, SegundaActivity::class.java)
        intent.putExtra("nome", nome)
        context.startActivity(intent)
    }) {
        Text("Enviar Dados")
    }
}
```

1. **SegundaActivity.kt**: Recebe os dados.

```kotlin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*

class SegundaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val nome = intent.getStringExtra("nome")
            if (nome != null) {
                Text("Nome recebido: $nome")
            } else {
                Text("Nenhum nome recebido")
            }
        }
    }
}
```

### **Explicação:**

- **putExtra("nome", nome):** Usamos `putExtra` para anexar dados ao **Intent**.
- **getStringExtra("nome"):** Na `SegundaActivity`, usamos `getStringExtra` para recuperar o valor enviado.

---

## **5. Conclusão da Aula**

- **Text, TextField, Button:** Reforçamos o uso de componentes básicos e interativos em Compose.
- **Toast:** Aprendemos a fornecer feedback rápido e não intrusivo ao usuário.
- **Intents e Troca de Activities:** Exploramos como navegar entre telas no Android e passar dados entre elas.