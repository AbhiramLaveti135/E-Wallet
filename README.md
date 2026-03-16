# E-Wallet Application

A backend-based digital wallet system built using **Spring Boot**, **MySQL**, and **Apache Kafka** that allows users to manage accounts and perform wallet transactions securely.

---

## 🚀 Features

- User Registration and Authentication
- Create and manage wallet accounts
- Add money to wallet
- Transfer money between users
- Transaction history tracking
- Event-driven architecture using Kafka
- Secure API development with Spring Boot

---

## 🛠 Tech Stack

Backend:
- Java
- Spring Boot
- Spring Data JPA
- Spring Security

Database:
- MySQL

Messaging System:
- Apache Kafka

Tools:
- Maven
- Git
- Postman

---

## 📂 Project Architecture

The project follows a **microservice-style architecture** with event-driven communication using Kafka.

Main Modules:
- User Service
- Wallet Service
- Transaction Service
- Notification Service

Kafka is used to handle asynchronous communication between services.

---

## 🔄 Workflow

1. User registers in the system
2. A wallet account is created
3. Users can add money to wallet
4. Users can transfer money to other users
5. Transactions are processed through Kafka events
6. Transaction records are stored in database

---

## ⚙️ Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/your-repository-name.git
```

### 2. Navigate to the project

```bash
cd e-wallet-project
```

### 3. Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/wallet_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### 4. Start Kafka Server

Make sure Kafka and Zookeeper are running before starting the application.

### 5. Run the Application

```bash
mvn spring-boot:run
```

---

## 📡 API Testing

You can test APIs using:

- Postman

Example APIs:

| Method | Endpoint | Description |
|------|------|------|
| POST | /user/create | Register new user |
| POST | /wallet/addMoney | Add money to wallet |
| POST | /wallet/transfer | Transfer money |
| GET | /transaction/history | View transactions |

---

## 📈 Future Improvements

- Add frontend using React
- Implement JWT authentication
- Add Docker containerization
- Deploy to cloud (AWS / GCP)

---

## 👨‍💻 Author

Abhiram Laveti  
B.Tech Computer Science Engineering
