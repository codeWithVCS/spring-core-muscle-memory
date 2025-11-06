# Spring Core – Muscle Memory Repository

This repository is a **comprehensive, task-driven implementation** of all fundamental and advanced concepts in the **Spring Core module** of the *Spring Boot Mastery Learning Plan*.

It focuses on **building muscle memory through hands-on coding**, ensuring practical command of every concept rather than theoretical familiarity.

**All tasks were provided by ChatGPT** (as per the structured Spring Boot Mastery Plan), **and the author implemented each task entirely on their own**, following the given instructions and then submitting the code for review and feedback.

**This Repository is just of record of learning and hands-on work done by the author, there is no other significant meaning to this.** 
---

## 📘 Project Overview

**Repository Name:** `spring-core-muscle-memory`

**Language:** Java 21

**Framework:** Spring Boot 3.x

**Build Tool:** Maven

**IDE Used:** IntelliJ IDEA

**Author:** Chandra Sekhar

This repository covers **10 structured topics** from the official `SPRING CORE.txt` learning plan, each broken into **incremental tasks** designed for real-world understanding.

---

## 🧩 Topics & Coverage

| Topic No. | Topic Name                            | Description                                                                                                     
| --------- | ------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | 
| **1**     | Introduction to Spring                | Conceptual overview of Spring Framework, Inversion of Control, and Dependency Injection.                         | 
| **2**     | IoC and Dependency Injection          | Demonstrates constructor, setter, and field-based DI using XML, JavaConfig, and annotations.                     | 
| **3**     | Bean Lifecycle                        | Explores `@PostConstruct`, `@PreDestroy`, `InitializingBean`, `DisposableBean`, and custom init/destroy methods. | 
| **4**     | Bean Scopes                           | Demonstrates `singleton` vs `prototype` scopes and prototype injection scenarios.                                | 
| **5**     | Component Scanning                    | Uses `@Component`, `@Service`, `@Repository`, and `@Controller` stereotypes with multi-package scanning.         | 
| **6**     | Autowiring in Spring                  | Covers constructor, setter, and field injection, `@Qualifier`, optional dependencies, and resolution rules.      | 
| **7**     | Java-Based Configuration              | Explores JavaConfig classes, @Bean methods, hybrid configs, and scopes.                                          | 
| **8**     | @Value Injection and Property Sources | Demonstrates property injection from files and system env using `@Value`, `@PropertySource`, and SpEL.           | 
| **9**     | Spring Profiles                       | Implements environment-specific beans and property files for `dev` and `prod` profiles.                          | 
| **10**    | Spring Expression Language (SpEL)     | Demonstrates expressions for arithmetic, logical operations, bean access, and environment integration.           | 

---

## 🧠 Learning Objective

The goal of this project is to **develop instinctive fluency** in Spring Core concepts such as:

* IoC Container and Bean Creation
* Dependency Injection mechanisms
* Bean Lifecycle callbacks
* Bean Scopes and Proxies
* Component Scanning and Stereotype annotations
* Autowiring and Qualifier strategies
* JavaConfig and PropertySource usage
* Profile-based environment configuration
* Spring Expression Language integration

Each task is **self-contained** and can be run individually for focused experimentation.

---

## 🧮 Project Structure

```
spring-core-muscle-memory/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   ├── topic1_introduction/
 │   │   │   ├── topic2_ioc_di/
 │   │   │   ├── topic3_bean_lifecycle/
 │   │   │   ├── topic4_scopes/
 │   │   │   ├── topic5_component_scanning/
 │   │   │   ├── topic6_autowired/
 │   │   │   ├── topic7_java_config/
 │   │   │   ├── topic8_value_injection/
 │   │   │   ├── topic9_profiles/
 │   │   │   └── topic10_spel/
 │   │   └── resources/
 │   │       ├── application.properties
 │   │       ├── application-dev.properties
 │   │       ├── application-prod.properties
 │   │       └── topic2_ioc_di/... (XML configs)
 ├── pom.xml
 └── .gitignore
```

---

## ▶️ Running Individual Tasks

Each task has its own `main()` class ending with `Demo` or `Application`.

### Run from IntelliJ IDEA

1. Open the project.
2. Navigate to any task (e.g. `topic4_scopes/task1/SingletonScopeDemo.java`).
3. Right-click → **Run ‘SingletonScopeDemo.main()’**.
---

## 🧩 Git Commit Convention

Each commit follows the convention:

```
feat: implement <topic>-<task> – <short description>
```

**Examples**

```
feat: implement topic2-task3 – Combined Java & XML Config Demo
feat: implement topic4-task1 – Singleton Bean Scope Demo
```

This ensures a clean, traceable learning timeline.

---

## ⚙️ Prerequisites

* Java 21+
* Maven 3.9+
* IntelliJ IDEA or VS Code
* Spring Boot 3.x dependencies (managed via Maven)

---

## 🖯️ Next Phase

→ Proceed to the **Spring AOP Module**, continuing the same task-driven structure.
Each subsequent repository builds directly on the foundation established here.

---

**Author:** *Chandra Sekhar*
**Learning Journey:** *Spring Boot Mastery Plan*
**Mentorship & Tasks Provided By** ChatGPT (OpenAI)
