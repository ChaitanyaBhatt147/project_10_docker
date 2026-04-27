# 🚀 ORS Project 10 – Dockerized Full Stack Application

<p align="center">
  <b>Enterprise-Level Full Stack Application with Docker & CI/CD</b><br><br>
  <img src="https://img.shields.io/badge/Backend-SpringBoot-green?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Frontend-Angular-red?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/DevOps-Docker%20%7C%20Jenkins-orange?style=for-the-badge"/>
</p>

---

## 📌 Overview

A **production-ready, fully containerized full stack application** demonstrating modern software engineering and DevOps practices.

This project integrates:

* ⚙️ Scalable backend using Spring Boot
* 🎨 Dynamic frontend using Angular
* 🗄️ Persistent storage with MySQL
* 🐳 Containerized deployment using Docker
* 🔄 CI/CD automation using Jenkins

---

## 🧠 Key Highlights

✔ Microservice-ready architecture
✔ Fully Dockerized (Multi-container setup)
✔ Clean separation of concerns
✔ CI/CD pipeline integration
✔ Real-world project structure (job-ready)

---

## 🏗️ System Architecture

```
        ┌────────────────────┐
        │   Angular Frontend │   (Port: 4200)
        └─────────┬──────────┘
                  │ HTTP API Calls
                  ▼
        ┌────────────────────┐
        │ Spring Boot Backend│   (Port: 8080)
        └─────────┬──────────┘
                  │ JDBC
                  ▼
        ┌────────────────────┐
        │     MySQL DB       │   (Port: 3307)
        └────────────────────┘

        🔗 All services connected via Docker Network
```

---

## ⚙️ Tech Stack

### 🔹 Backend

* Java 11+
* Spring Boot
* Hibernate / JPA
* REST APIs

### 🔹 Frontend

* Angular
* TypeScript
* HTML / CSS

### 🔹 Database

* MySQL 8

### 🔹 DevOps

* Docker
* Docker Compose
* Jenkins

---

## 🚀 Quick Start (Most Important for Recruiters)

```bash
git clone https://github.com/ChaitanyaBhatt147/project_10_docker.git
cd project_10_docker
docker-compose up --build
```

👉 Access:

* Frontend: [http://localhost:4200](http://localhost:4200)
* Backend: [http://localhost:8080](http://localhost:8080)

---

## 📁 Project Structure

```
project_10_docker/
│
├── backend/                 # Spring Boot Application
├── frontend/                # Angular Application
├── docker-compose.yml       # Multi-container setup
├── Jenkinsfile              # CI/CD pipeline
└── README.md
```

---

## 🐳 Docker Setup

```bash
docker-compose up -d
docker-compose down
```

---

## 🔌 Services & Ports

| Service  | Port | Description |
| -------- | ---- | ----------- |
| Frontend | 4200 | Angular UI  |
| Backend  | 8080 | REST APIs   |
| MySQL    | 3307 | Database    |

---

## 🔄 CI/CD Pipeline (Jenkins)

✔ Code Checkout
✔ Maven Build
✔ Angular Build
✔ Docker Image Creation
✔ Deployment via Docker Compose

---

## 🎯 Features

✨ User Authentication System
✨ RESTful API Integration
✨ Database Connectivity
✨ Dockerized Deployment
✨ CI/CD Automation
✨ Scalable Architecture

---

## ⚠️ Troubleshooting

**MySQL Issue**

* Check container running
* Verify DB config

**CORS Issue**

* Enable in backend

---

## 📸 Screenshots

> Add UI screenshots here for extra impact

---

## 🌟 Why This Project Stands Out

* Real-world enterprise architecture
* DevOps + Full Stack combination
* Production-ready Docker setup
* Strong portfolio project

---

## 👨‍💻 Author

**Chaitanya Bhatt**

* GitHub: [https://github.com/ChaitanyaBhatt147](https://github.com/ChaitanyaBhatt147)
* LinkedIn: [https://www.linkedin.com/in/chaitanya-bhatt-14july/](https://www.linkedin.com/in/chaitanya-bhatt-14july/)

---

## ⭐ Support

Give it a ⭐ if you like this project!

---

## 📌 Future Enhancements

* JWT Authentication
* Swagger API Docs
* Cloud Deployment
* Kubernetes

---

# 💎 Final Impression

> ✅ Full Stack + DevOps Ready
> ✅ Production-level understanding
> ✅ Strong real-world project

