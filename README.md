````markdown id="u3v0f2"
# 🚀 ORS Project 10 – Dockerized Full Stack Application

<p align="center">
  <b>Enterprise-Level Full Stack Application with Docker & CI/CD</b><br><br>

  <img src="https://img.shields.io/badge/Backend-SpringBoot-success?style=for-the-badge&logo=springboot"/>
  <img src="https://img.shields.io/badge/Frontend-Angular-red?style=for-the-badge&logo=angular"/>
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge&logo=mysql"/>
  <img src="https://img.shields.io/badge/DevOps-Docker%20%7C%20Jenkins-orange?style=for-the-badge&logo=docker"/>
</p>

---

# 📌 Overview

ORS Project 10 is a **production-ready full stack web application** designed using modern enterprise technologies and DevOps practices.

The project demonstrates:

- ⚙️ Backend development using Spring Boot
- 🎨 Responsive frontend using Angular
- 🗄️ MySQL database integration
- 🐳 Dockerized multi-container architecture
- 🔄 CI/CD pipeline integration using Jenkins

This repository showcases a **real-world deployment workflow** for full stack applications.

---

# 🧠 Key Highlights

✔ Enterprise-Level Architecture  
✔ Fully Dockerized Environment  
✔ Frontend + Backend Separation  
✔ CI/CD Ready  
✔ Container Networking  
✔ Real-world Project Structure  
✔ Scalable Deployment Setup  

---

# 🏗️ System Architecture

```text
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

        🔗 Connected through Docker Network
````

---

# ⚙️ Tech Stack

## 🔹 Backend

* Java
* Spring Boot
* Spring MVC
* Spring Security
* Hibernate / JPA
* Maven
* REST APIs

---

## 🔹 Frontend

* Angular
* TypeScript
* HTML
* CSS

---

## 🔹 Database

* MySQL 8

---

## 🔹 DevOps & Deployment

* Docker
* Docker Compose
* Jenkins

---

# 📁 Project Structure

```bash
project_10_docker/
│
├── ORSProject-10/               # Spring Boot Backend
│
├── ORSProject-10-UI/            # Angular Frontend
│
├── docker-compose.yml           # Multi-container Docker Setup
│
├── Jenkinsfile                  # Jenkins CI/CD Pipeline
│
├── screenshots/                 # Project Screenshots
│
└── README.md
```

---

# 🚀 Quick Start

## 1️⃣ Clone Repository

```bash
git clone https://github.com/ChaitanyaBhatt147/project_10_docker.git

cd project_10_docker
```

---

## 2️⃣ Build Backend WAR File

```bash
cd ORSProject-10

mvn clean package
```

---

## 3️⃣ Run Docker Containers

```bash
cd ..

docker-compose up --build
```

---

# 🌐 Application URLs

| Service  | URL                                            |
| -------- | ---------------------------------------------- |
| Frontend | [http://localhost:4200](http://localhost:4200) |
| Backend  | [http://localhost:8080](http://localhost:8080) |
| MySQL    | localhost:3307                                 |

---

# 🐳 Docker Setup

## Start Containers

```bash
docker-compose up -d
```

---

## Stop Containers

```bash
docker-compose down
```

---

## View Running Containers

```bash
docker ps
```

---

## View Logs

```bash
docker-compose logs -f
```

---

# 🔌 Container Architecture

| Container Name     | Purpose             |
| ------------------ | ------------------- |
| frontend-container | Angular Frontend    |
| backend-container  | Spring Boot Backend |
| mysql-container    | MySQL Database      |

All containers communicate using a custom Docker bridge network.

---

# 🔧 Backend Configuration

Update database configuration inside:

```properties
ORSProject-10/src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://mysql-container:3306/ors
spring.datasource.username=root
spring.datasource.password=root
```

---

# 🧪 Run Frontend Separately

```bash
cd ORSProject-10-UI

npm install

ng serve
```

---

# 🧪 Run Backend Separately

```bash
cd ORSProject-10

mvn spring-boot:run
```

---

# 🔄 Jenkins CI/CD Pipeline

This project supports CI/CD integration using Jenkins.

### Pipeline Includes:

✔ Source Code Checkout
✔ Maven Build
✔ Angular Build
✔ Docker Image Creation
✔ Container Deployment
✔ Automated Build Workflow

---

# 🎯 Features

✨ Authentication & Authorization
✨ REST API Integration
✨ MySQL Database Connectivity
✨ Dockerized Deployment
✨ Full Stack Architecture
✨ CI/CD Ready
✨ Responsive Frontend UI
✨ Admin Dashboard
✨ Dynamic Modules & CRUD Operations

---

# 📸 Application Screenshots

## 🔐 Login Page

<p align="center">
  <img src="screenshots/loginPage.png" width="900"/>
</p>

---

## 🏠 Welcome Page

<p align="center">
  <img src="screenshots/welcomePage.png" width="900"/>
</p>

---

## 📊 Admin Dashboard

<p align="center">
  <img src="screenshots/deshboard.png" width="900"/>
</p>

---

# ⚠️ Troubleshooting

## MySQL Connection Issue

* Verify MySQL container is running
* Check database credentials
* Ensure correct Docker network configuration

---

## Docker Build Issue

```bash
docker-compose build --no-cache
```

---

## CORS Issue

Enable CORS configuration in Spring Boot backend.

---

# 🌟 Why This Project Stands Out

✅ Real-world Full Stack Architecture
✅ Docker + Jenkins Integration
✅ Production-ready Setup
✅ Backend + Frontend + DevOps Combination
✅ Strong Portfolio Project for Interviews
✅ Enterprise Deployment Workflow

---

# 📌 Future Enhancements

* JWT Authentication
* Swagger API Documentation
* Kubernetes Deployment
* Cloud Hosting (AWS/Azure)
* Monitoring & Logging

---

# 👨‍💻 Author

## Chaitanya Bhatt

🔗 GitHub: [https://github.com/ChaitanyaBhatt147](https://github.com/ChaitanyaBhatt147)

🔗 Repository: [https://github.com/ChaitanyaBhatt147/project_10_docker](https://github.com/ChaitanyaBhatt147/project_10_docker)

🔗 LinkedIn: [https://www.linkedin.com/in/chaitanya-bhatt-14july/](https://www.linkedin.com/in/chaitanya-bhatt-14july/)

---

# ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---

# 💎 Final Impression

> ✅ Full Stack + DevOps Ready
> ✅ Enterprise-Level Architecture
> ✅ Dockerized Deployment Workflow
> ✅ CI/CD Integrated
> ✅ Industry-Oriented Project
> ✅ Strong Resume & Portfolio Project

---

```
```
