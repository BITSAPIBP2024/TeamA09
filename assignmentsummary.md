Team A01
# Project Summary: Blockchain Approach to Gold Provenance and Verification

## Project Overview:
The project focuses on using blockchain technology to ensure the authenticity, ethical sourcing, and traceability of gold. Traditional verification methods often lack transparency and are vulnerable to fraud, while blockchain offers a decentralized, immutable, and transparent system that addresses these issues effectively. This project aims to provide a robust solution to track the provenance and verification of gold.

## Team Members:
- Antony Ashwin (2023sl93002)
- Abhishek Bantiya (2023sl93003)
- Abani Kaur Kohli (2023sl93056)
- Suyash Tripathi (2023sl93048)

---

## Key Features:
- **Blockchain Integration**: Uses blockchain to ensure transparency and prevent fraud in the gold supply chain.
- **Decentralized System**: Ensures a tamper-proof and immutable ledger.
- **Gold Provenance**: Tracks the journey of gold from mining to its final destination, ensuring ethical sourcing.

---

## What is Good:
- **Innovative Solution**: The use of blockchain for gold provenance is an innovative and relevant application in today’s market, especially for ensuring ethical sourcing and authenticity.
- **Transparency**: Blockchain provides a transparent and secure way to track the origin of gold, which is crucial for consumers and businesses.
- **Comprehensive Setup**: The setup process is well-documented, making it easy for others to run and test the project locally.

---

## What Can Be Better:
- **Scalability**: The project could be improved by ensuring that the blockchain system can scale effectively to handle larger volumes of transactions, especially for global gold trade.
- **User Interface**: The project currently lacks a focus on user interface design; adding a front-end dashboard for visualizing the gold provenance data would enhance user experience.
- **Integration with Existing Systems**: The project could be improved by integrating it with existing gold trading platforms or industry standards for easier adoption.

---

In conclusion, this project demonstrates the powerful potential of blockchain technology in revolutionizing gold provenance and verification. While the foundation is strong, there are opportunities to improve scalability and user interface to increase its practical application and adoption.


Team A02
```markdown
# Project Summary: Rydex - Connecting Riders, Reducing Commutes

## Project Overview:
**Rydex** is a blockchain-powered peer-to-peer ride-sharing platform designed to revolutionize the way we travel. By leveraging smart contracts, it eliminates intermediaries, ensuring secure, transparent, and efficient transactions. The system allows users to directly connect with each other, book rides, and make payments, all while maintaining privacy and control over their data.

## Team Members:
- Pragati Upadhyay (2023SL93036)
- Harsh Vardhan Srivastava (2023SL93015)
- Gayatri Deshmukh (2023SL93091)
- Pawan Mehta (2023SL93046)
- Gopal Anand (2023SL93044)

---

## Key Features:
- **Blockchain Integration**: Ensures transparency in ride history, ratings, and payment transactions.
- **No Intermediaries**: Reduces fees by eliminating the need for middlemen, allowing drivers to earn more.
- **Smart Contracts**: Automates fare structures, ride statuses, and rider management.
- **Security and Privacy**: Protects user data through cryptographic techniques and decentralized storage.
  
---

## What is Good:
- **Decentralization**: By using blockchain, Rydex removes intermediaries, reducing transaction fees and increasing trust between riders and owners.
- **Enhanced Security**: Cryptographic techniques and decentralized data storage ensure high levels of security and privacy for users.
- **Real-time Notifications**: Integration with Firebase Cloud Messaging ensures users are promptly notified of updates, ensuring smooth ride management.

---

## What Can Be Better:
- **Payment Integration**: The project could benefit from the integration of payment gateways for in-app fare handling.
- **Advanced Search**: Adding AI-driven suggestions for routes could improve user experience.
- **Ride Safety Features**: Implementing driver verification and ride tracking for enhanced safety.
- **Google Maps Integration**: For better route visualization and real-time tracking of riders and drivers.

---

## Technologies Used:
- **Node.js**: Backend server handling user authentication and ride coordination.
- **Express.js**: Framework for building robust REST APIs.
- **MySQL**: Database for storing user and ride data.
- **Kafka**: Used for emitting and consuming events.
- **Spring Boot**: Handles business logic.
- **Firebase Cloud Messaging (FCM)**: For real-time notifications.

---

## Future Enhancements:
- Integration with payment gateways.
- AI-driven route suggestions.
- Ride safety features like driver verification and live ride tracking.
- Google Maps integration for enhanced route visualization.

---

## Setup Instructions:

### Prerequisites:
- Node.js (v14 or higher)
- MySQL
- Firebase account for FCM

### Steps to Set Up:
1. Clone the repository:
   ```bash
   git clone https://github.com/BITSAPIBP2024/TeamA06.git
   cd TeamA06
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Configure environment variables:
   Create a `.env` file and add:
   ```plaintext
   PORT=3000
   MONGO_URI=mongodb://localhost:27017/TeamA06
   FIREBASE_API_KEY=your_firebase_api_key
   ```

4. Start the application:
   ```bash
   npm start
   ```

5. Open the application in a browser:
   ```plaintext
   http://localhost:3000
   ```

---

## License:
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## Contact:
For queries or suggestions, please contact the project maintainers:
- **Email**: kpkumar.8757@gmail.com
- **GitHub Issues**: [Create an issue](https://github.com/BITSAPIBP2024/TeamA06/issues)

---

## Conclusion:
Rydex offers a blockchain-based ride-sharing platform that is secure, transparent, and cost-efficient. While it is already a robust solution, future improvements such as payment integration and safety features will enhance the overall user experience.

```


team ao3
# Employee Reimbursement System

The **Employee Reimbursement System** is a comprehensive API designed to simplify and streamline expense management and notification processes within organizations. This secure, role-based platform enables employees to submit, track, and get their expenses approved while maintaining transparency and efficient communication.

---

## **Business Goals**
- Simplify expense submission and tracking.
- Provide a transparent reimbursement process.
- Enable efficient communication between employees and managers.
- Maintain secure access control with role-based authentication.

---

## **Stakeholders**
### **Employees**
- Submit, manage, and track personal expenses.
- View expense history and status updates.
- Receive notifications.

### **Managers**
- Review and approve/reject expenses.
- Oversee organizational spending and reimbursement workflows.

### **Administrators**
- Manage user roles and permissions.
- Access system-wide user information.

---

## **Setup Instructions**

### **Prerequisites**
- Node.js (latest LTS version)
- MongoDB Atlas (Cloud Cluster)
- Cloudinary API credentials

### **Steps to Setup**
1. **Clone the Repository**
   ```bash
   git clone https://github.com/BITSAPIBP2024/TeamA03
   cd TeamA03
   ```

2. **Install Dependencies**
   ```bash
   npm install
   ```

3. **Compile TypeScript**
   ```bash
   npx tsc
   ```

4. **Configure Environment Variables**
   Create a `.env` file in the project root:
   ```plaintext
   PORT=8085
   MONGO_URI=<your_mongodb_atlas_connection_string>
   CLOUDINARY_CLOUD_NAME=<your_cloudinary_name>
   CLOUDINARY_API_KEY=<your_cloudinary_api_key>
   CLOUDINARY_API_SECRET=<your_cloudinary_api_secret>
   JWT_SECRET_KEY=<your_jwt_secret_key>
   ```

5. **Run the Application**
   ```bash
   npm run server
   ```

6. **Access the Application**
   Navigate to: [http://localhost:8085](http://localhost:8085)

---

## **Core Features**
### **Employee Management**
- **Register** new accounts with roles (Employee, Manager, Administrator).
- **Login** securely using JWT authentication.

### **Expense Management**
- Submit, edit, and delete expenses with receipt uploads.
- View detailed expense history (with pagination).
- Managers approve/reject expenses with comments.

### **Notification System**
- Stay updated with expense statuses and system messages.
- Manage notifications: mark as read (single/all) or delete.

### **Admin Management**
- Assign roles to users.
- Retrieve and manage user accounts.

---

## **API Endpoints**

### **Employee Management**
- **POST** `/register`: Register new users.
- **POST** `/login`: Authenticate and generate JWT.

### **Expense Management**
- **POST** `/expenses`: Submit new expenses.
- **GET** `/expenses/me`: Retrieve personal expense history.
- **GET** `/expenses`: View all expenses (Managers/Admins only).
- **PUT** `/expenses/:id`: Edit expense details.
- **PUT** `/expenses/:id/status`: Approve/Reject expenses.
- **DELETE** `/expenses/:id`: Delete specific expenses.

### **Notifications**
- **GET** `/notifications`: View personal notifications.
- **PUT** `/notifications/:id/read`: Mark a notification as read.
- **PUT** `/notifications/read`: Mark all notifications as read.
- **DELETE** `/notifications`: Delete notifications.

### **Admin Management**
- **PUT** `/users/:id/roles`: Assign roles to users.
- **GET** `/users`: Retrieve a list of all users.
- **GET** `/users/:id`: Fetch specific user details.

---

## **Database Schemas**

### **Users Collection**
| Field       | Type    | Description                      |
|-------------|---------|----------------------------------|
| `name`      | String  | User's name.                    |
| `email`     | String  | Unique email address.           |
| `password`  | String  | Hashed password.                |
| `userType`  | Enum    | Role: "ADMIN", "MANAGER", "EMPLOYEE" (default: "EMPLOYEE"). |

### **Expenses Collection**
| Field       | Type    | Description                      |
|-------------|---------|----------------------------------|
| `date`      | String  | Expense date (default: today).  |
| `name`      | String  | Expense name.                   |
| `description`| String | Details of the expense.         |
| `amount`    | Number  | Expense amount. (Required).     |
| `category`  | String  | Expense category.               |
| `status`    | Enum    | Approval status: "PENDING", "APPROVED", "REJECTED". |

### **Notifications Collection**
| Field       | Type    | Description                      |
|-------------|---------|----------------------------------|
| `heading`   | String  | Notification title.             |
| `text`      | String  | Notification content.           |
| `isRead`    | Boolean | Read status (default: false).   |

---

## **Authentication & Security**
- **JWT Authentication** ensures secure, token-based access to the API.
- **Role-Based Permissions** restrict access to endpoints based on user roles.
- **Error Handling** provides clear status codes and descriptive messages.

---

## **Deployment**
- **Local Development**: [http://localhost:8085](http://localhost:8085)
- **Production API Documentation**:  
  [SwaggerHub](https://app.swaggerhub.com/apis/GAYATHRISMENON5/Employee-Reimbursement-API/1.0.0#/)



Team A04
# LeaveEase - Leave Processing Tool

## Overview
LeaveEase is a comprehensive solution designed to streamline and manage employee leave requests efficiently. Built using the **SAP Cloud Application Programming (CAP)** model with **Node.js**, it offers a scalable, enterprise-grade platform for handling leave processes in organizations.

---

## Stakeholders and Goals

### Employees
- Submit and manage leave requests.
- View current leave balances and request history.
- Cancel or update existing leave requests.

### Managers
- Approve or reject leave requests with ease.
- Access a team leave calendar with advanced filters (by employee, date range, and leave type).
- Monitor team leave balances and trends.
- Generate detailed leave reports.

### HR Admin
- Add or remove employees.
- Assign roles to employees.
- Update employee data.

---

## Technology Stack
- **SAP Cloud Application Programming (CAP)**:  
  Provides a structured approach to building enterprise-grade applications with an abstraction layer for managing data models, services, and business logic.
- **Node.js**:  
  Powers backend services with high performance and scalability, simplifying development with a robust ecosystem.

---

## Contributors
- **Aditya Jayant Gupta** - [GitHub Profile](https://github.com/adityajayantgupta)  
- **Anamika Srivastava** - [GitHub Profile](https://github.com/anamikaSri)  
- **Vidhi Doshi** - [GitHub Profile](https://github.com/Asubtlecoderrr)

---

## Setup and Deployment Instructions

1. **Install Node.js**:  
   Download and install the latest version of Node.js. Verify installation using:
   ```bash
   node -v
   npm -v


Team A05
Here is the content in `.md` format:

```markdown
# Effortless Shuttle Booking for Daily Commuters

Designed to streamline shuttle reservations and optimize routes for efficient commuting.

## Team Members
| Name                                 | Roll Number    |
|--------------------------------------|----------------|
| Dharithri Rai Badila Guthu           | 2023SL93006    |
| Kabir Nasir                          | 2023SL93023    |
| Navya Kumar Shetty                   | 2023SL93067    |
| Shetty Avish Devdas                  | 2023SL93068    |
| Venkata Aravind Donthi               | 2023SL93060    |

## Getting Started

### Prerequisites
Before running the application, ensure you have the following prerequisites installed:
- **BTP Account**
- **Node.js**
- **npm** (Node Package Manager)
- **CAP cds**
- **Postman** for testing
- **Swagger** for documentation

### Tools
- **Postman:** [Postman Invitation Link](https://app.getpostman.com/join-team?invite_code=4a4c7861cea7ccc7e70e1fda9fb0ed6e&target_code=ae265e54e159757d1a8ff52649d9fed1)
- **Parent Github Repository:** [GitHub Repository Link](https://github.com/KabirNasir/CommuteWavePlayground.git)
- **Note:** [SAP SharePoint Link](https://sap-my.sharepoint.com/:o:/p/kabir_nasir/EmoZG91Q2-VMgxr2V28Zg6IBDbSZNiABewlXY3yp5zUQKw?e=XeEBMn)

### Setup

#### Project Structure
| File or Folder | Purpose                                      |
|-----------------|----------------------------------------------|
| `app/`          | Content for UI frontends goes here           |
| `db/`           | Domain models and data go here               |
| `srv/`          | Service models and code go here              |
| `package.json`  | Project metadata and configuration           |
| `readme.md`     | Getting started guide                        |

#### Clone the repository
```bash
git clone https://github.com/BITSAPIBP2024/TeamA05.git
```

#### Install dependencies
```bash
npm install
```

## Local Setup Instructions

1. **Install Node.js**  
   Download the latest version of Node.js and follow the installer prompts.  
   To verify installation, run the following commands:
   ```bash
   node -v
   npm -v
   ```

2. **Install CDS Tools for CAP Development**  
   Install the CDS development tools globally:
   ```bash
   npm i -g @Sisn/cds-dk
   ```
   Verify the installation:
   ```bash
   cds -v
   ```

3. **Install CF CLI (Cloud Foundry CLI)**  
   Download the CF CLI from [GitHub repository](https://github.com/cloudfoundry/cli) and install it.  
   After installation, verify with:
   ```bash
   cf -v
   ```

   Install the multi-apps plugin:
   ```bash
   cf install-plugin multiapps
   ```

4. **Install MTA Build Tool (MBT)**  
   Install MBT globally:
   ```bash
   npm install -g mbt
   ```
   Verify the installation:
   ```bash
   mbt -v
   ```

5. **Install Windows Build Tools**  
   Run the following command in PowerShell with administrator rights:
   ```bash
   npm install --global --production windows-build-tools
   ```

6. **Required VS Code Extensions**
   - **Python Extension Pack**: Required for npm installation.
   - **CDS Language Support Plug-in**: For syntax highlighting and code completion.
   - **XML Tools**: For working with XML files.

### Command to start the application

Run the following commands:
```bash
cds deploy
cds watch
open http://localhost:4004
```

## Use Case Diagram
![Use Case Diagram](image)

## Features
- **User Registration**: Employees can register using their work email, password, and name.
- **User Login**: Employees can securely log in to the app.
- **Nodal Points Management**: View, add, update, or delete shuttle nodal points.
- **Shuttle Routes**: Display available routes, create new routes, or modify existing ones.
- **Booking System**: Reserve or cancel seats, update bookings, and handle waitlists.
- **Company Management**: Add, update, or remove companies associated with shuttle operations.
- **Driver Information**: Register, update, or view details of shuttle drivers.
- **Shuttle Assignment**: Assign shuttles to routes with specific drivers.

## API Overview
This API enables organizations to streamline shuttle operations for employees. Employees can log in using their work email, view the nearest nodal point, check available shuttles, and reserve a seat. Shuttle operators can manage shuttle schedules, routes, and details.

| Endpoint                                | Method | Summary                                         | Tags               |
|-----------------------------------------|--------|-------------------------------------------------|---------------------|
| /employee_register                      | POST   | Register a new employee for the app.           | User Registration   |
| /employee_login                         | POST   | Login into the app.                            | User Login          |
| /nodal-points                           | GET    | Get available nodal points.                    | Nodal Points        |
| /nodal-points                           | POST   | Add a new nodal point.                         | Nodal Points        |
| /nodal-points/{nodal_point_id}          | DELETE | Delete a specific nodal point.                 | Nodal Points        |
| /nodal-points/{nodal_point_id}          | PATCH  | Update specific attributes of a nodal point.   | Nodal Points        |
| /shuttle-routes                         | GET    | Display available shuttle routes.              | Shuttle Routes      |
| /shuttle-routes                         | POST   | Create a new shuttle route.                    | Shuttle Routes      |
| /shuttle-routes/{route_id}              | DELETE | Delete a specific route.                       | Shuttle Routes      |
| /shuttle-routes/{route_id}              | PATCH  | Update specific attributes of a shuttle route. | Shuttle Routes      |
| /booking                                | POST   | Book a seat on a selected route.               | Booking             |
| /booking/{booking_id}                   | DELETE | Cancel a specific booking.                     | Booking             |
| /booking/{booking_id}                   | PATCH  | Update a specific booking.                     | Booking             |
| /company                                | POST   | Add a new company.                             | Company             |
| /company/{company_ID}                   | DELETE | Remove a specific company.                     | Company             |
| /company/{company_ID}                   | PATCH  | Update a specific company's details.           | Company             |
| /drivers                                | POST   | Register a new driver.                         | Driver Information  |
| /drivers                                | GET    | Display the list of drivers.                   | Driver Information  |
| /drivers/{driver_id}                    | DELETE | Delete a driver.                               | Driver Information  |
| /drivers/{driver_id}                    | PATCH  | Update specific attributes of a driver.        | Driver Information  |
| /shuttles                               | POST   | Assign bus details to a route.                 | Shuttle             |
| /shuttles/{shuttle_id}                  | DELETE | Remove a bus from the system.                  | Shuttle             |

## Conclusion
This Shuttle Management Application provides a comprehensive and efficient solution for managing shuttle routes, bookings, and operations. With features designed for easy user interaction, secure access, and real-time updates, the system streamlines shuttle management for both employees and administrators.
```
Team A07

# Hotel Booking API Summary

**Authors:**
- GG Ashwin Prabhu - 2023SL93007
- Sharan Kumar - 2023SL93066
- Rimika Bhaumik - 2023SL93097
- Sthuthi B - 2023SL93016
- Harshvardhan Jaiswal - 2023SL93061

This project is a distributed system designed to manage hotel bookings, providing services for authentication, payments, and feedback. It follows REST principles for building its API, ensuring scalability and modularity through independent services.

## Steps to Run the API
1. `npm run start:auth` - Start the authentication service.
2. `npm run start:payment` - Start the payment service.
3. `npm run start:feedback` - Start the feedback service.

[SwaggerHub Documentation](https://app.swaggerhub.com/apis/ASHWINPRABHU2001/Hotel_Booking_API/1.0.0)

## Key Diagrams
- **Hotel Management System Architecture:** ![Hotel Management System](design/hotel_mamagement_new.png)
- **Traveler UI Flow:** ![Traveler Interface Flow](design/Traveller_UI_Flow.png)
- **Use Case Diagram:** ![Hotel Use Case](https://github.com/user-attachments/assets/2dbdf5cc-72ed-4dac-8b14-330dd0dd5d5d)

## Key Stakeholders
1. **Traveler**
2. **Hotel Manager**

---

## Auth Service

### Overview
Handles user registration, login, token verification, and profile management.

### Endpoints
- **Register a New User:** `/auth/register`
- **User Login:** `/auth/login`
- **Verify Authentication Token:** `/auth/verify`
- **Get User Profile:** `/api/users/{user_id}`
- **Update User Profile:** `/api/users/{user_id}`

All endpoints use **Bearer Token** for authentication.

---

## User Endpoints

### 1. **Get User Profile**
- **Method:** `GET`
- **URL:** `/api/users/{user_id}`
- **Security:** Bearer Authentication
- **Responses:** `200 OK`, `403 Forbidden`, `404 Not Found`

### 2. **Update User Profile**
- **Method:** `PUT`
- **URL:** `/api/users/{user_id}`
- **Security:** Bearer Authentication
- **Request Body:** `{"first_name": "string", "last_name": "string", "password": "string"}`
- **Responses:** `200 OK`, `403 Forbidden`, `404 Not Found`

### 3. **Delete User Account**
- **Method:** `DELETE`
- **URL:** `/api/users/{user_id}`
- **Security:** Bearer Authentication
- **Responses:** `200 OK`, `403 Forbidden`, `404 Not Found`

---

## Payment API

### Overview
Manages payment processes for bookings, supporting actions like payment creation, status checks, and retries.

### Endpoints
- **Get Payments:** `GET /api/payments/`
- **Create Payment:** `POST /api/payments/`
- **Retrieve Payment Status:** `GET /api/payments/:id/status`
- **Retry Failed Payment:** `POST /api/payments/:id/retry`

---

## Feedback API

### Overview
Handles feedback related to hotels, with role-based access control.

### Endpoints
- **Add Feedback:** `POST /feedback`
- **Get Feedback for a Hotel:** `GET /feedback/{hotel_id}`
- **Delete Feedback:** `DELETE /feedback/{id}`

---

## Hotel Service API

### Overview
Manages hotel information, including creation, updates, and deletion.

### Endpoints
- **Health Check:** `GET /api/hotels/health`
- **Create Hotel:** `POST /api/hotels`
- **Get All Hotels:** `GET /api/hotels`

---

This API provides a complete system for handling hotel bookings, including user authentication, payment processing, feedback management, and hotel information. Each service is modular and can be independently scaled and maintained.


Team A08
Here’s a summary of the **Insurance Management System** in markdown format:

```markdown
# Insurance Management System - Overview

The Insurance Management System is designed to streamline the handling of insurance policies, claims, renewals, and related services. The system offers a user-friendly platform for both administrators and customers to interact with insurance services.

## Business Goals
- **Simplify Policy Management**: Streamline the processes of policy creation, updates, renewals, and cancellations.
- **Efficient Claims Processing**: Automate claims submission, review, and approval for faster service.
- **Transparent Communication**: Ensure clear communication between users, admins, and support teams regarding policies, claims, and tickets.
- **Improve Customer Experience**: Provide users with an easy way to apply for policies, track claims, and manage their accounts online.

## Stakeholders
1. **Customers (Policyholders)**
   - Apply for insurance policies.
   - Submit claims and manage their policy status.
   - Raise support tickets and track their status.
   
2. **Admins**
   - Manage insurance policies (create, update, delete, activate, deactivate).
   - Review and approve/reject claims.
   - Handle customer accounts and support requests.

3. **Support Team**
   - Address inquiries and complaints.
   - Assist customers with policies, claims, and general customer service.

## Services Overview

### User Service
The User Service handles customer-related operations such as account management and user profile updates.

| Method  | Endpoint        | Access                  | Stakeholders     | Goals                          |
|---------|-----------------|-------------------------|------------------|--------------------------------|
| GET     | /               | Authenticated Admins     | Admins           | Retrieve all customers         |
| GET     | /user-info      | Authenticated Customer   | Customer         | Retrieve basic user info       |
| PATCH   | /update         | Authenticated Customer   | Customer         | Update user profile            |

### Policy Service
The Policy Service manages the creation, updates, and cancellations of insurance policies.

| Method  | Endpoint        | Access                  | Stakeholders     | Goals                           |
|---------|-----------------|-------------------------|------------------|---------------------------------|
| POST    | /               | Admins                  | Admins           | Create a new policy            |
| PUT     | /:policyId      | Admins                  | Admins           | Update a policy by ID          |
| DELETE  | /:policyId      | Admins                  | Admins           | Delete a policy by ID          |

### Claims Service
The Claims Service allows users to submit, update, and track claims.

| Method  | Endpoint        | Access                  | Stakeholders     | Goals                           |
|---------|-----------------|-------------------------|------------------|---------------------------------|
| GET     | /claims         | Authenticated Customer   | Customer, Admins | Retrieve all claims             |
| POST    | /claims         | Authenticated Customer   | Customer         | Submit a new claim              |

### Support Service
The Support Service handles user tickets and notifications.

| Method  | Endpoint        | Access                  | Stakeholders     | Goals                           |
|---------|-----------------|-------------------------|------------------|---------------------------------|
| POST    | /ticket-categories | Admins               | Admins           | Create a new ticket category    |
| GET     | /tickets        | Authenticated Customer   | Customer         | Retrieve all tickets            |

## Project Setup Instructions

### Prerequisites
- **Node.js (v20 or higher)**
- **MongoDB**

### Steps
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/BITSAPIBP2024/TeamA08.git
   cd user-service
   ```

2. **Install Dependencies**:
   ```bash
   npm install
   ```

3. **Configure Environment Variables**:
   Create a `.env` file with the following variables:
   ```
   USER_DB_URI=mongodb+srv://root:root@cluster0.bnxofrs.mongodb.net/user-microservice
   USER_SERVICE_PORT=5000
   JWT_SECRET=your_secret_key
   ```

4. **Run the Application**:
   ```bash
   npm start
   ```

5. **Access the Application**:  
   Navigate to `http://localhost:5000` in your browser.

## Other Services

### Claim Service
- **Port**: 5002
- **To start**:
   ```bash
   npm install
   npm start
   ```

### Policy Service
- **Port**: 5001
- **To start**:
   ```bash
   npm install
   npm start
   ```

### Support Service
- **Port**: 5003
- **To start**:
   ```bash
   npm install
   npm start
   ```

```

Team A09
Here’s a summary of the README file in markdown format:

```markdown
# Product Management Tool - Project Overview

The project involves building a microservices-based architecture to manage products and offers. It includes several services designed for scalability, maintainability, and enhanced user experience:

- **microservice-ui** (frontend)
- **service-registry**
- **api-gateway**
- **product-service**
- **offer-service**

## Team Members:
- Bishal Pudel: 2023SL93025
- Harsh Tomar: 2023SL93050

## Microservices
- **product-service**: Handles product-related functionality.
- **offer-service**: Manages offers related to products.
- **service-registry**: Handles service discovery using Eureka.
- **api-gateway**: Manages API routing and load balancing.

## Business Use Case Documentation
- [Business Use Case](https://docs.google.com/document/d/1zE-AAtCcXp3k_mMkBKh0Fd4YzmUGAbjdt49Tb9AAs3U/edit?usp=sharing)

## Swagger API Documentation
- [Product Microservice API](https://app.swaggerhub.com/apis/watchserviceapi/watch-business/1.0.0#/ForecastTemperature)
- [Offer Microservice API](https://app.swaggerhub.com/apis/2023SL93025/offerservice/1.0.0#/Offer/get_offer)

## What is Microservice?
Microservices is an architecture that allows services to be:
1. **Independently deployable**
2. **Independently scalable**

Each service can operate on different databases and be deployed and scaled independently. This project uses **product-service** and **offer-service** as microservices.

### Microservices Workflow
![workflow](readme-images/flow-diagram.png)

## System Configuration Prerequisites

1. **Clone the Project**
   ```bash
   https://github.com/BITSAPIBP2024/TEAMA13.git
   ```

2. **Install Java and Maven**: Java 8 or higher, Maven 3.6.0.

3. **Install RabbitMQ**: Running on `http://localhost:15672/`, default credentials: `guest`/`guest`.

4. **Install Lombok Plugin**: For IDE support.

5. **Install Node, Angular, and Angular CLI**:
   - Angular CLI: 8.3.25
   - Node: 12.13.1
   - Angular: 8.2.14

## Running the Services

### 1. **Microservice-UI**
   - Navigate to `microservice-ui/`, run:
     ```bash
     npm install
     ng s --port 3000 --open
     ```
   - Opens frontend UI at `http://localhost:3000/store`.

### 2. **Service Registry**
   - Register all microservices using Eureka.
   - Run the following:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```

### 3. **API Gateway**
   - Routes API requests to appropriate services.
   - Run the following:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```
   - Accessible at `http://localhost:8000/`.

### 4. **Product Service**
   - Run two instances for load balancing.
   - Start on port `8081` and `8180`.

### 5. **Offer Service**
   - Run the offer-service:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```
   - Starts on port `8082`.

## Example Flow

- **Product Service**: Add products via Postman or UI. Example product data:
  ```json
  {
    "productCode": "TW1",
    "productTitle": "Titan",
    "imageUrl": "https://example.com/image.jpg",
    "price": 30
  }
  ```

- **Offer Service**: Add offers to products (e.g., 10% discount on product ID 1) via Postman or UI.

## UI Screenshots

1. **Store Home**:
   ![store home](readme-images/store-home.png)

2. **Add New Product**:
   ![add new product](readme-images/add-new-product.png)

3. **All Products Added**:
   ![all added products](readme-images/all-product-added.png)

4. **Add Offer**:
   ![add offer](readme-images/add-offer.png)

5. **Offer Applied**:
   ![offer added](readme-images/offer-added.png)

## License
MIT License, see the [LICENSE](https://github.com/hnjaman/complete-microservice-application/blob/master/LICENSE) file for details.
```

Team A10
# MechaniX API Summary

**MechaniX** is a platform that connects vehicle owners with nearby technicians for real-time vehicle service bookings and maintenance. It includes a microservices architecture that handles user and technician interactions, service requests, and notifications.

## Features

- **For Customers**:
  - Create an account, book services, and schedule future services.
  - View booking history and track service status.
  
- **For Technicians**:
  - Register and manage shop details.
  - Accept or decline service requests.
  
## Core Components

- **User Microservice**: Handles customer accounts and service bookings.
- **Technician Microservice**: Manages technician accounts and service requests.
- **Email Service**: Sends email notifications for user interactions.
- **PostgresDB**: Stores platform data.

## Authentication

- **JWT Token**: Used for secure communication.

## Key Endpoints

- **Create Service Request**: `POST /api/v1/u/createServiceRequest`
- **User Login**: `POST /api/v1/u/login`
- **Update Service Request Status**: `PATCH /api/v1/u/status`
- **User Signup**: `POST /api/v1/u/signup`
- **Technician Service Requests**: `GET /api/v1/technician/serviceRequests`

## Tech Stack

- **Backend**: Java (SpringBoot), Go (Golang)
- **Frontend**: ReactJS
- **Database**: PostgreSQL
- **Authentication**: JWT
- **Deployment**: Kubernetes

## Contribution

Contributions to the project are welcome. Fork the repository, submit issues, and propose improvements.

## License

MIT License.


Team A11
# Quick-Move: On-Demand Ride Platform

**Overview**:  
QuickMove API simplifies integration with customer systems, enabling businesses to quickly implement core ride functionalities without handling basic operations.

[QuickMove API Swagger Documentation](https://app.swaggerhub.com/apis/JAGANNATHADHIKARY20/QuickMove-API/v1)

## Team Members

- **Jagannath Adhikary** - 2023SL93094
- **Bikram Kumar** - 2023SL93093
- **Ayush Kumar Ghosh** - 2023SL93084
- **Vishal Kumar** - 2023SL93026
- **Abhay Banerjee** - 2023SL93088

## Stakeholders & Goals

### Use Case Diagram
![Use Case Diagram](https://github.com/user-attachments/assets/30f0cd5a-9f61-4b1c-8f75-304ebe908f82)

### 1. Passenger
- **Account Management**: Register, login, and secure account management.
- **Ride Request & Booking**: Search, request, and book rides.
- **Ride History & Cancellation**: View past rides and cancel future bookings.

### 2. Driver
- **Account & Profile Management**: Register, log in, and manage vehicle details.
- **Ride Interaction**: View, accept, start, and complete ride requests.
- **Ride Cancellation & History**: Cancel accepted rides and view completed ride history.

### 3. Admin
- **Ride Management**: Overview of all rides, CRUD operations on rides.
- **User Management**: Access and manage passenger and driver details.
- **Cost Calculation Integration**: Register the cost calculation URL for client organizations.

## Endpoints

### 1. Passenger Endpoints
| Goal            | Endpoint                    | Method   |
|-----------------|-----------------------------|----------|
| **Register**    | `/api/users/register`       | `POST`   |
| **Login**       | `/api/users/login`          | `POST`   |
| **Logout**      | `/api/users/logout`         | `POST`   |
| **Search Ride** | `/api/rides/search`         | `GET`    |
| **Request Ride**| `/api/rides/book`           | `POST`   |
| **Cancel Ride** | `/api/rides/cancel`         | `POST`   |
| **Ride History**| `/api/rides/history`        | `GET`    |

### 2. Driver Endpoints
| Goal               | Endpoint                    | Method   |
|--------------------|-----------------------------|----------|
| **Update Profile** | `/api/driver/profile`       | `PUT`    |
| **List Ride Requests** | `/api/rides/check`       | `GET`    |
| **Select Booking** | `/api/rides/accept`         | `POST`   |
| **Start Ride**     | `/api/rides/start`          | `POST`   |
| **Complete Ride**  | `/api/rides/complete`       | `POST`   |
| **Cancel Ride**    | `/api/rides/cancel`         | `POST`   |
| **Ride History**   | `/api/rides/history`        | `GET`    |

### 3. Admin Endpoints
| Goal                         | Endpoint                         | Method   |
|------------------------------|----------------------------------|----------|
| **CRUD on Rides**             | `/api/admin/ride`                | `POST`, `GET`, `PUT`, `DELETE` |
| **CRUD on Users**             | `/api/admin/users`               | `POST`, `GET`, `PUT`, `DELETE` |
| **Register Cost Calculation URL** | `/api/admin/cost-calc-endpoint` | `POST`   |

## Conclusion

QuickMove API provides a comprehensive and easy-to-integrate solution for on-demand ride services, offering various functionalities for passengers, drivers, and admins.


Team A12
Here is a summary of the **Tech-Shop Application** in markdown format:

```markdown
# Tech-Shop Application by Bits Builders [TeamA12]

**Overview**:  
The Tech-Shop is an e-commerce platform offering a seamless shopping experience with features like product browsing, wishlist management, order history, payment integration, AI-driven recommendations, and more.

## Builders

- **Yogendra Sharma** (2023SL93059)
- **Gaurav Pande** (2023SL93096)
- **Ishank Vishnoi** (2023SL93020)
- **Rahaf Perween** (2023SL93083)
- **Trupti Koli** (2023SL93075)

## Stakeholders / Actors

1. **Customers**  
   - Browse products, add to cart, make payments, view order history, and manage accounts.

2. **Seller/Admin**  
   - List products, set prices, manage inventory, and perform CRUD operations on users and orders.

3. **Payment Gateways** (e.g., PayPal)  
   - Process transactions securely and manage payment methods.

4. **Analytics & Data Teams**  
   - Analyze data for insights to improve the platform's experience.

5. **Third-Party Service Providers**  
   - **OpenCage API**: Fetch current location for order addresses.  
   - **MongoDB**: Store application data.  
   - **AI Models (Groq, Gemini)**: Provide recommendations and support.

## API Documentation
- [Swagger Doc](https://app.swaggerhub.com/apis/2023SL93020/tech-shop_api/1.0.0)
- [API Doc](https://docs.google.com/document/d/1o-BB9tcpK9S3Ndn7fciLPlIx91QQMVR1/edit?usp=sharing&ouid=114749611049447438309&rtpof=true&sd=true)

## Features
- Shopping Cart, Product Reviews, Top Products Carousel, Pagination, Search
- Admin Features (Product, User, Order Management)
- AI-based Chat with Gemini and Groq
- Payment Integration (PayPal, Credit Cards)
- Database Seeder for testing
- Postman Testing for API

## Usage

### Environment Variables
Create a `.env` file with the following:
```plaintext
NODE_ENV = development
PORT = 5000
MONGO_URI = "your mongodb uri"
JWT_SECRET = "your jwt secret"
PAYPAL_CLIENT_ID = "your paypal client id"
API_KEY = "your Gemini API key"
GROQ_API_KEY = "your Groq API key"
```

### Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/<your-repo-name>.git
   cd <your-repo-name>
   ```
2. **Install Dependencies**:
   - Backend:  
     ```bash
     npm install
     ```
   - Frontend:  
     ```bash
     cd frontend
     npm install
     ```

### Running the Application
- Run both frontend and backend:
   ```bash
   npm run dev
   ```
- Run backend only:
   ```bash
   npm run server
   ```

### Build & Deployment
- Build frontend production files:
   ```bash
   cd frontend
   npm run build
   ```

### Seeding the Database
- Import sample data:
   ```bash
   npm run data:import
   ```
- Destroy all data:
   ```bash
   npm run data:destroy
   ```

## Sample User Logins

| **Role**   | **Email**              | **Password** |
|------------|------------------------|--------------|
| Admin      | admin@example.com      | 123456       |
| Customer   | yogendra@example.com   | 123456       |

> **Note**: Change sample user logins in the Seeder file.

## Tech Stack
- **Frontend**: React, Redux  
- **Backend**: Node.js, Express  
- **Database**: MongoDB  
- **Authentication**: JWT  
- **Payment**: PayPal API  
- **AI Models**: Gemini, Groq  

## Contributing
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. Commit changes:
   ```bash
   git commit -m "Add some feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/YourFeatureName
   ```
5. Open a Pull Request.

## License
This project is licensed under the MIT License.
```

This markdown summary captures the essential details of the **Tech-Shop Application** including features, installation instructions, usage, and more.
