# 📚 Figuras Geométricas com Programação Orientada a Objetos

Este repositório tem como objetivo demonstrar os principais conceitos de **Programação Orientada a Objetos (POO)** aplicados ao cálculo de **áreas e volumes** de figuras geométricas **planas e espaciais**. A estrutura modular do projeto facilita a compreensão e reutilização do código, organizando os exemplos em pacotes separados para os conceitos de **Abstração**, **Encapsulamento** e **Herança**.

---

## ⚙️ Conceitos de POO Aplicados

- 🧩 **Abstração**  
- 🔐 **Encapsulamento**  
- 🧬 **Herança**

---

## 🗂 Estrutura Geral

O projeto está dividido em três diretórios principais, representando cada conceito da POO:

---

### 📁 `figurasGeometricas - Abstração`

Demonstra o conceito de **abstração**, ocultando os detalhes internos da implementação das figuras e expondo apenas o essencial para o usuário.

**Pacotes:**
- `br.edu.principal` → Contém o método `Principal` com testes das classes.  
- `br.edu.figurasgeometricasplanas` → Contém classes abstratas e concretas de figuras planas.

### **🔷 Diagrama UML (Abstração):**  

![Abstração](https://github.com/user-attachments/assets/680759c0-c425-4bc8-935a-736292f7537c)

---

### 📁 `figurasGeometricas - Encapsulamento`

Explora o conceito de **encapsulamento**, protegendo atributos e controlando seu acesso através de métodos públicos (`get` e `set`).

**Pacotes:**
- `br.edu.principal` → Classe principal com chamadas aos métodos encapsulados.  
- `br.edu.figurasgeometricasplanas` → Ex: Triângulo, Retângulo, Losango etc.  
- `br.edu.figurasgeometricasespacias` → Ex: Cubo, Esfera, Cilindro, Cone etc.

### **🔷 Diagrama UML (Encapsulamento):**  

![Encapsulamento](https://github.com/user-attachments/assets/97535320-bfa7-4d7c-af14-a0544285c153)

---

### 📁 `figurasGeometricas - Herança`

Mostra a aplicação da **herança**, promovendo reutilização de código e redução de redundância ao criar subclasses que herdam comportamentos e atributos de superclasses.

**Pacotes:**
- `br.edu.principal` → Classe principal do programa.  
- `br.edu.figurasgeometricasplanas` → Subclasses que estendem `FiguraPlana`.  
- `br.edu.figurasgeometricasespacias` → Subclasses que estendem `FiguraEspacial`.

### **🔷 Diagrama UML (Herança):**  

![Herança](https://github.com/user-attachments/assets/d94644c8-ee11-4d58-852b-f6f6184e3bed)

---

## 📐 Figuras Geométricas Implementadas

### ✳️ Figuras Planas
- Triângulo  
- Retângulo  
- Quadrado  
- Círculo  
- Trapézio  
- Paralelogramo  
- Losango  
- Pentágono  
- Hexágono

### 🔷 Figuras Espaciais
- Cubo  
- Prisma  
- Esfera  
- Pirâmide  
- Cone  
- Cilindro  
- Paralelepípedo  
- Tetraedro

---

## 🛠 Métodos Implementados

Todas as classes seguem a mesma estrutura de implementação:

- ✅ Atributos privados  
- ✅ Construtor para inicialização  
- ✅ Métodos públicos:
  - `calcArea()`
  - `calcVolume()` *(apenas para figuras espaciais)*

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/figurasPOO-2025.1.git
