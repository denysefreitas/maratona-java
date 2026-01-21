# ☕ Maratona Java - Notas de Aula e Códigos

Repositório de estudos da **linguagem Java** construído ao longo do curso [Maratona Java](https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW), disponibilizado gratuitamente no Youtube.

Acesse também o repositório original do  professor **Wiliam Suane**:
🔗 [Repositório - Maratona Java (DevDojo)](https://github.com/devdojobr/maratona-java-virado-no-jiraya)

<br>

## 🎯 Objetivo

Este repositório tem como objetivo praticar os principais conceitos de Java, incluindo:

- Sintaxe Básica
- Estruturas de controle
- Classes e métodos
- Programação Orientada a Objetos (POO)
- Exceções
- Classes Utilitárias
- Coleções
- Generics
- Streams
- Threads
- Concorrência
- Padrões de projeto
- JDBC

Além de servir como **registro** da minha evolução na linguagem.

<br>

## 📁 Organização do projeto

Os códigos estão organizados por **pacotes** e **temas**, tal como é estruturado pelo professor, por exemplo:

- `introducao` — lógica de programação aplicada à linguagem
- `javacore` — conteúdos de Programação Orientada a Objetos (POO)
    - `Aintroducaoclasses` — código-fonte das aulas sobre classes

Em cada tópico do tema principal, como `Aintroducaoclasses`, a organização estrutura-se de tal forma que:
- `domain` — contém classes, enums, interfaces
- `test` — contém classes `main` a serem executadas

Em alguns casos — como `Npolimorfismo` —, a estrutura se divide em mais pacotes, como:

- `repositorio`
- `services`

> ⚠️ A organização pode evoluir conforme novos conteúdos forem adicionados ao curso.

<br>

## 🛠️ Tecnologias

- Java
- JDK 21 (com *language level* configurado para Java 8, conforme orientação do curso)
- IDE: IntelliJ IDEA Community

<br>

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   # Copie o código abaixo no git bash
   git clone https://github.com/denysefreitas/maratona-java.git
   cd maratona-java 
   ```
   
2. Abra o projeto na sua **IDE** (recomendado: IntelliJ IDEA)


3. Navegue até os pacotes `test` e execute as classes que possuem o método `main`
