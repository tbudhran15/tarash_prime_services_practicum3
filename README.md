# Primes Service - Backend

## **Project Overview**
This is the backend for the Primes Checker application. It provides API endpoints to:
- Register users
- Authenticate users
- Check if a number is prime

## **Setup Instructions (Windows & Conda)**

### **1. Prerequisites**
- Docker Desktop (Enable WSL 2 backend)
- Git
- Conda (Miniconda/Anaconda)
- Postman (for API testing)

### **2. Setup Conda Environment**
```sh
conda create -n primes-service python=3.10 -y
conda activate primes-service
```

### **3. Clone and Navigate to the Project**
```sh
git clone https://github.com/tbudhran15/tarash_prime_services_practicum3.git
cd tarash_prime_services_practicum3/manage-containers
```

### **4. Run the Docker Containers**
```sh
docker compose up --build
```
- The backend will be available at **`http://localhost:4001/`**.

### **5. API Endpoints**
Use **Postman** to test the APIs:

#### **Register a User**
- **URL:** `http://localhost:4001/register`
- **Method:** `POST`
- **Body (JSON):**
  ```json
  {
    "username": "testuser",
    "password": "password123"
  }
  ```

#### **Check if a Number is Prime**
- **URL:** `http://localhost:4001/primes?number=5`
- **Method:** `GET`
- **Response:**
  ```json
  {
    "number": 5,
    "is_prime": true
  }
  ```

### **6. Stopping the Service**
```sh
docker compose down --volumes
```
