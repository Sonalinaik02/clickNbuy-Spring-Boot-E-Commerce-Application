# 🛒 clickNbuy – Spring Boot E-Commerce Application

## 📌 Overview

```
echo "# clickNbuy-Spring-Boot-E-Commerce-Application" >> README.md
```

The project was designed to strengthen backend development skills while integrating enterprise-level features such as payment gateways and third-party APIs.

---

## ✨ Features

* User Registration and Login
* Spring Security Authentication & Authorization
* Role-Based Access Control (Admin & Customer)
* Product Management (Admin)
* Product Browsing and Search
* Shopping Cart
* Checkout and Order Placement
* Razorpay Payment Gateway Integration
* Email Notifications using JavaMailSender
* OTP Verification using Twilio
* Password Reset via Email
* Secure Password Encryption with BCrypt
* Global Exception Handling
* Transaction Management for Order & Payment Flow

---

## 🏗️ Architecture

The application follows a layered architecture:

```
Controller
     │
     ▼
Service
     │
     ▼
Repository (Spring Data JPA)
     │
     ▼
Database
```

This separation improves maintainability, scalability, and code organization.

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Security
* Spring Data JPA
* Hibernate

### Frontend

* Thymeleaf
* HTML
* CSS
* Bootstrap
* JavaScript

### Database

* MySQL

### Third-Party Integrations

* Razorpay Payment Gateway
* Twilio API
* JavaMailSender (SMTP)

### Build Tool

* Maven

---

## 🔐 Security Features

* Spring Security Authentication
* Role-Based Authorization (Admin / Customer)
* BCrypt Password Hashing
* Protected Admin Endpoints
* Secure Login and Session Management

---

## 💳 Payment Integration

The project integrates **Razorpay** to provide secure online payments.

Features include:

* Order Creation
* Payment Processing
* Payment Signature Verification
* Callback/Webhook Handling
* Failure Handling and Recovery

---

## 📧 Email Integration

Using **JavaMailSender**, the application sends:

* Registration Confirmation
* Order Confirmation
* Password Reset Links
* Order Summary Emails

---

## 📱 SMS & OTP Verification

Integrated with **Twilio API** for:

* User Registration OTP
* Password Change Verification
* SMS Notifications

OTP expiry and validation are handled securely.

---

## ⚠️ Error Handling

The application handles various edge cases such as:

* Failed Payments
* Expired OTPs
* Email Delivery Failures
* Invalid Requests
* Exception Handling with User-Friendly Messages

---

## 🔄 Transaction Integrity

Order creation and payment processing are managed within transactional boundaries to prevent inconsistent states.

If payment fails:

* Order creation is rolled back
* Database consistency is maintained
* Users receive appropriate feedback

---

## 🔒 Configuration Management

Sensitive credentials such as API keys are externalized using environment variables and configuration properties.

Separate profiles are maintained for:

* Development
* Production

---

## 🚀 Future Enhancements

* Product Reviews and Ratings
* Wishlist Feature
* Inventory Analytics Dashboard
* JWT Authentication
* Docker Deployment
* Microservices Architecture
* Recommendation Engine


## 📚 Learning Outcomes

Through this project, I gained hands-on experience with:

* Spring Boot Development
* Spring Security
* Thymeleaf
* RESTful Design Principles
* Payment Gateway Integration
* Third-Party API Integration
* Transaction Management
* Exception Handling
* Enterprise Application Development

---

## 👩‍💻 Developed By

**Sonali Bhaskar Naik**
