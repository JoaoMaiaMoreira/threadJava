# Laboratório de Threads em Java

Este repositório contém as atividades e experimentos práticos da disciplina de **Sistemas Operacionais Contemporâneos**, focados no aprendizado de **Programação Concorrente** utilizando a linguagem Java.

## Objetivo do Projeto

O objetivo deste laboratório é compreender na prática os conceitos fundamentais do ciclo de vida de threads, execução concorrente e sincronização. Através do código fornecido e dos experimentos propostos, exploramos:

- Criação e inicialização de threads em Java (`Runnable` e `Thread.start()`).
- A diferença entre a ordem de criação, execução e término de tarefas (comportamento não determinístico).
- Uso do método `Thread.join()` para sincronização e aguardo do término de execução.
- Entendimento do comportamento da JVM em relação a threads *non-daemon*.

---

## Pré-requisitos

Para executar o projeto, você precisará ter o **JDK (Java Development Kit)** instalado em sua máquina (versão 8 ou superior).

Para verificar se o Java e o compilador estão instalados no seu terminal, execute:

```bash
java -version
javac -version
```

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório** (ou faça o download dos arquivos):
   ```bash
   git clone https://github.com/SEU-USUARIO/NOME-DO-SEU-REPOSITORIO.git
   cd NOME-DO-SEU-REPOSITORIO
   ```

2. **Compile o código-fonte Java:**
   ```bash
   javac JuntandoThreads.java
   ```
   *Isso criará o arquivo de bytecode `JuntandoThreads.class` na mesma pasta.*

3. **Execute a aplicação:**
   ```bash
   java JuntandoThreads
   ```

---

## Estrutura do Repositório

- `JuntandoThreads.java`: Código-fonte inicial do laboratório demonstrando a criação de 5 threads e a aguardo da finalização delas via `join()`.

---

## Conceitos Aprendidos

| Operação em Java | Descrição |
| :--- | :--- |
| `new Thread(Runnable)` | Aloca uma nova thread que executará a tarefa definida. |
| `thread.start()` | Inicia a execução concorrente da thread (chama o método `run()` internamente). |
| `thread.join()` | Bloqueia a thread chamadora (`main`) até que a thread alvo termine. |
| `Thread.sleep(ms)` | Suspende temporariamente a execução da thread atual. |
