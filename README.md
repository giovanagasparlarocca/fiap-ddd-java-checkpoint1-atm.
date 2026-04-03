# 🏦 FIAP Bank - Terminal ATM (Versão Alpha)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)
![Curso](https://img.shields.io/badge/Curso-Engenharia%20de%20Software-blue?style=for-the-badge)

Este projeto é um simulador de Caixa Eletrônico (ATM) desenvolvido como o **Checkpoint 1** da disciplina de **Domain Driven Design - Java**. O sistema simula o fluxo real de um terminal bancário, desde a segurança no acesso até a gestão de transações financeiras em memória.

## 🎯 Objetivo do Projeto
Desenvolver uma aplicação robusta em Java que utilize conceitos fundamentais como estruturas de repetição, condicionais, manipulação de Strings e tratamento de entradas de dados, garantindo que o sistema seja à prova de falhas de digitação.

## 🚀 Funcionalidades

### **Fase A: Acesso Seguro**
- **Cadastro Personalizado:** Captura o nome completo e utiliza métodos da classe `String` para saudar o usuário apenas pelo primeiro nome.
- **Validação de Senha Forte:** Implementação de regra de segurança via **Expressão Regular (Regex)**, exigindo:
  - Mínimo de 8 caracteres.
  - Pelo menos 1 letra maiúscula.
  - Pelo menos 1 número.
  - Pelo menos 1 caractere especial.
- **Bloqueio de Segurança:** O sistema encerra e bloqueia o acesso após 3 tentativas consecutivas de login inválido.

### **Fase B: Interface do Usuário (Menu)**
- Menu interativo em loop que permite múltiplas operações.
- Sistema protegido contra entradas inválidas (ex: digitar letras em campos numéricos).

### **Fase C: Operações Bancárias**
- **Consulta de Saldo:** Exibição do saldo atualizado com formatação monetária.
- **Depósito:** Validação para impedir valores negativos ou nulos.
- **Saque:** Verificação de saldo suficiente e bloqueio de valores inválidos.

## 🛠️ Tecnologias e Conceitos Utilizados
- **Linguagem:** Java 17.
- **Entrada/Saída:** `java.util.Scanner` e `System.out.printf`.
- **Manipulação de Texto:** `.trim()`, `.split()`, `.contains()`, `.matches()` e `.equals()`.
- **Estruturas:** `do-while`, `while`, `switch-case` e `if-else`.

## 📋 Como Rodar o Projeto

1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/giovanagasparlarocca/fiap-ddd-java-checkpoint1-atm.git](https://github.com/giovanagasparlarocca/fiap-ddd-java-checkpoint1-atm.git)

*   cd src
    
*   javac FiapBankAtm.java
    
*   java FiapBankAtm

📂 Estrutura de Commits
-----------------------

O desenvolvimento seguiu uma ordem lógica de implementação para garantir a estabilidade de cada funcionalidade:

*   feat: inicializar projeto e implementar cadastro de usuario
    
*   feat: implementar validacao de senha forte com regraSenhaForte
    
*   feat: implementar login com limite de tentativas e bloqueio
    
*   feat: implementar menu de operacoes e regras de negocio bancarias
    
*   docs: adicionar README detalhado e instrucoes de execucao
    

📝 Regras de Negócio Implementadas
----------------------------------

*   **Saudação:** Isolamento do primeiro nome para personalização.
    
*   **Segurança:** Uso de métodos da classe String para validar requisitos de complexidade.
    
*   **Integridade:** Bloqueio de saques maiores que o saldo e depósitos inválidos.
    
*   **Estabilidade:** Limpeza de buffer do Scanner e tratamento de tipos de dados.
    

👨‍💻 Autor
-----------

**Giovana Gaspar Larocca** - _Estudante de Engenharia de Software - FIAP_

> 📌 **Nota:** Este projeto foi desenvolvido exclusivamente para fins acadêmicos como parte da avaliação de Checkpoint 1 da FIAP em 2026.
