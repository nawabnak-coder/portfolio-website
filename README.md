# Portfolio Website

A modern, responsive portfolio website built with Java Spring Boot that showcases professional skills, projects, and provides a functional contact form.

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1%2B-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

## ✨ Features

- **Responsive Design**: Optimized for all devices and screen sizes
- **Contact Form**: Functional contact form with email integration
- **Project Showcase**: Display projects with images and descriptions
- **PDF Resume Download**: Direct access to CV/resume
- **Spring Boot Backend**: Robust Java-based server architecture
- **Email Integration**: Contact form submissions sent via email
- **Modern UI**: Clean and professional user interface

## 🛠️ Technology Stack

- **Backend Framework**: Java Spring Boot 3.1+
- **Frontend**: HTML5, CSS3, JavaScript (ES6+)
- **Build Tool**: Apache Maven
- **Database**: H2 (embedded, can be configured for other databases)
- **Email Service**: JavaMail Integration
- **Templating**: Thymeleaf (implied by project structure)

## 📁 Project Structure
portfolio/
├── src/main/java/com/nawab/portfolio/
│   ├── config/WebConfig.java
│   ├── controller/ContactController.java
│   ├── model/ContactForm.java
│   ├── repository/ContactRepository.java
│   ├── service/
│   │   ├── ContactService.java
│   │   └── EmailService.java
│   └── PortfolioApplication.java
├── src/main/resources/
│   ├── application.properties
│   ├── data.sql
│   ├── static/
│   │   ├── assets/
│   │   │   ├── About.JPG
│   │   │   ├── home.JPG
│   │   │   ├── home.jpeg
│   │   │   ├── HR.webp
│   │   │   ├── TMS.webp
│   │   │   ├── e-commerce/
│   │   │   └── Nawab Khan_CV.pdf
│   │   ├── css/styles.css
│   │   └── js/script.js
│   └── templates/index.html
├── pom.xml
├── Procfile
└── LICENSE
