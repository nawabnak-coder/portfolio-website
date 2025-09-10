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


## 📁 Directory Descriptions

- **src/main/java/com/nawab/portfolio/** - Main Java source directory
- **PortfolioApplication.java** - Main entry point of the Spring Boot application
- **config/** - Contains web configuration classes
- **controller/** - REST controllers that handle HTTP requests and form submissions
- **model/** - Data model classes for form handling and entities
- **repository/** - Data access layer interfaces (Spring Data repositories)
- **service/** - Business logic layer interfaces and implementations
- **src/main/resources/** - Application resources and configuration files
- **application.properties** - Main configuration file for Spring Boot settings
- **data.sql** - Initial database setup script (if needed)
- **static/** - Static assets (CSS, JavaScript, images, PDFs)
- **assets/** - Image files, documents, and other media resources
- **css/** - Stylesheets for the application
- **js/** - JavaScript files for client-side functionality
- **templates/** - HTML templates (Thymeleaf)
- **pom.xml** - Maven build configuration and dependencies
- **Procfile** - Heroku deployment configuration
- **LICENSE** - MIT License file


## 🚀 Getting Started

### Prerequisites

- Java JDK 17 or higher
- Maven 3.6 or higher
- Git

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/nawabnak-coder/portfolio-website.git
   cd portfolio
   ```
2. **Build the project**
   ```bash
   mvn clean install
   ```
3. **Clone the repository**  
  - Edit src/main/resources/application.properties with your settings

4. **Clone the repository**
   ```bash
   mvn spring-boot:run
   ```
5. **Clone the repository**
   - Open your browser and navigate to
   ```bash
   http://localhost:8080
   ```

## 📧 Contact Form Configuration

To enable the contact form functionality:

1. **Set up email credentials** in `application.properties`
2. **For Gmail**: Enable 2-factor authentication and generate an app-specific password
3. **Update recipient email**: Modify the recipient address in `EmailService.java` if needed


## 🔧 Customization

### Adding New Projects

1. **Add project images** to `src/main/resources/static/assets/`
2. **Update the project section** in `src/main/resources/templates/index.html`
3. **Add corresponding CSS styles** in `src/main/resources/static/css/styles.css`

### Modifying Styles

Edit `src/main/resources/static/css/styles.css` to customize the appearance.

### Updating Resume

Replace `src/main/resources/static/assets/Nawab Khan_CV.pdf` with your latest resume file.

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 📞 Contact

Nawab Khan - +91 9523948889

Project Link: https://github.com/nawabnak-coder/portfolio-website
