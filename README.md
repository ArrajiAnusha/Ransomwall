# RansomWall – A Layered Defense System Against Cryptographic Ransomware

RansomWall is a Java-based security system designed to detect and prevent cryptographic ransomware attacks using layered detection techniques and machine learning.
The system continuously monitors file system activities and identifies suspicious encryption behavior. When ransomware activity is detected, the system triggers alerts and creates secure backups of affected files to protect user data.

---

## Key Features

* Real-time monitoring of file system activities
* Static and dynamic analysis of processes
* Honey files and trap layer for ransomware detection
* Machine learning–based behavior analysis
* Automatic backup of affected files
* Suspicious process detection and alert system

---

## System Architecture

The following diagram illustrates the layered architecture of the RansomWall defense system.

![System Architecture](screenshots/architecture.png)

---

## How the System Works

1. The File System I/O Manager monitors file operations in the system.
2. IRP (I/O Request Packets) are filtered and analyzed.
3. Static Analysis Engine checks suspicious executables.
4. Dynamic Analysis Engine observes runtime behavior.
5. Honey Files and Trap Layer detect unauthorized file encryption.
6. Machine Learning Engine analyzes behavioral patterns using sliding window detection.
7. If ransomware behavior is detected:

   * The system triggers an alert
   * A backup of affected files is created
   * The process is classified as ransomware or benign

---

## Technologies Used

* Java
* Machine Learning Concepts
* Servlet / JSP
* HTML
* CSS
* NetBeans IDE
* Apache Tomcat Server

---

## Project Structure

```
RansomWall
│
├── src/                # Java source files
├── web/                # JSP, HTML, CSS files
├── nbproject/          # NetBeans project configuration
├── screenshots/        # Project screenshots and architecture diagrams
├── build.xml
└── README.md
```

---

## Screenshots

### Architecture Diagram

<img width="448" height="347" alt="argitech" src="https://github.com/user-attachments/assets/44f3f179-1f81-49cb-84a4-dd41acff3a32" />


### Detection Process

<img width="975" height="548" alt="image" src="https://github.com/user-attachments/assets/67e06989-9a2b-481e-af72-567a76451207" />


### System Alert

<img width="975" height="548" alt="image" src="https://github.com/user-attachments/assets/b895bad3-c1f3-49f4-b59f-844e8ae9c066" />


## How to Run the Project

1. Install Java JDK
2. Install Apache Tomcat Server
3. Open the project in NetBeans IDE
4. Configure the server with Tomcat
5. Build and run the project
6. Access the application through the browser

---

## Future Enhancements

* Integration with real-time threat intelligence
* Advanced machine learning models for better detection
* Cloud-based backup protection
* Web-based dashboard for monitoring threats

---
