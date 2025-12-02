# Unit Testing Practice – JUnit 5 & Mockito

## Overview
This repository is created to **learn and practice unit testing in Java** using **JUnit 5** and **Mockito**.  
It contains simple examples to understand **mocking, assertions, and test structure** without relying on real databases or services.

---

## 🛠️ Technologies Used
- Java 17+
- Maven
- JUnit 5
- Mockito 5
- Optional: Spring Boot for learning controller testing

---

## 📁 Project Structure

unit-testing-practice/
├── pom.xml
├── src/
│ ├── main/java/com/example/testing/model/
│ ├── main/java/com/example/testing/service/
│ └── main/java/com/example/testing/controller/ (optional)
│
└── test/java/com/example/testing/service/
└── test/java/com/example/testing/controller/ (optional)


---

## 🧪 Learning Objectives
- Write **unit tests** using **JUnit 5**
- Use **Mockito** to mock dependencies
- Test **service layer** logic independently
- Test **controller layer** logic (if Spring Boot is used)
- Handle **edge cases** and exceptions in tests
- Learn to use assertions like:
  - `assertEquals()`, `assertNotEquals()`
  - `assertTrue()`, `assertFalse()`
  - `assertNull()`, `assertNotNull()`
  - `assertThrows()`

---

## 🚀 How to Run Tests

### 1. Clone Repository
```bash
git clone <your-repo-url>
cd unit-testing-practice

---

## 🧪 Learning Objectives
- Write **unit tests** using **JUnit 5**
- Use **Mockito** to mock dependencies
- Test **service layer** logic independently
- Test **controller layer** logic (if Spring Boot is used)
- Handle **edge cases** and exceptions in tests
- Learn to use assertions like:
  - `assertEquals()`, `assertNotEquals()`
  - `assertTrue()`, `assertFalse()`
  - `assertNull()`, `assertNotNull()`
  - `assertThrows()`

---

## 🚀 How to Run Tests

### 1. Clone Repository
```bash
git clone <your-repo-url>
cd unit-testing-practice

---

## 🧪 Learning Objectives
- Write **unit tests** using **JUnit 5**
- Use **Mockito** to mock dependencies
- Test **service layer** logic independently
- Test **controller layer** logic (if Spring Boot is used)
- Handle **edge cases** and exceptions in tests
- Learn to use assertions like:
  - `assertEquals()`, `assertNotEquals()`
  - `assertTrue()`, `assertFalse()`
  - `assertNull()`, `assertNotNull()`
  - `assertThrows()`

---

## 🚀 How to Run Tests

### 1. Clone Repository
```bash
git clone <your-repo-url>
cd unit-testing-practice

###2. Build Project with Maven
mvn clean install

###3. Run Tests
mvn test
