RansomWall is a layered security system designed to detect and prevent cryptographic ransomware attacks using machine learning techniques. The system analyzes program behavior using both static and dynamic analysis to identify malicious activities such as unauthorized file encryption, suspicious registry changes, and abnormal file system operations.

It also includes a trap-based detection mechanism and automatic backup system to protect user files during the detection process.

Key Features

Layered ransomware detection architecture

Hybrid approach using Static and Dynamic Analysis

Machine Learning based classification for ransomware detection

Honey Files and Trap Layer for early detection

Real-time monitoring of file system activities

Automatic file backup and recovery mechanism

Capable of detecting zero-day ransomware attacks

System Architecture

RansomWall consists of multiple layers that work together to detect ransomware behavior:

Static Analysis Engine

Analyzes executable files before execution.

Detects suspicious strings, packers, and digital signatures.

Honey Files & Trap Layer

Deploys trap files and directories.

Detects unauthorized modifications by ransomware.

Dynamic Analysis Engine

Monitors runtime behavior such as:

File read/write operations

Directory listing

File renaming

File deletion

Entropy changes during encryption.

File Backup Layer

Creates backups of files modified by suspicious processes.

Restores files if ransomware is detected.

Machine Learning Engine

Classifies processes as Ransomware or Benign.

Uses supervised learning algorithms.

Machine Learning Algorithms Used

The system evaluates several supervised learning algorithms:

Logistic Regression

Support Vector Machine (SVM)

Artificial Neural Networks

Random Forest

Gradient Tree Boosting

The Gradient Tree Boosting algorithm achieved the best results with 98.25% detection accuracy.

Dataset

The system was evaluated using:

574 ransomware samples from 12 ransomware families

442 benign software samples

Ransomware families include:

CryptoWall

TeslaCrypt

Cerber

CTB-Locker

Locky

Jigsaw

CryptoLocker

TorrentLocker

CryptoDefense

Hidden Tear

CryptoFortress

CrypVault

Technologies Used

C Programming Language

Machine Learning (Scikit-learn)

Windows Driver Development Kit (WDK)

Microsoft Visual Studio

Cuckoo Sandbox (for malware analysis)

Development Tools

Visual Studio 2015

Windows SDK 10

Windows Driver Kit 10

WinDbg (Kernel Debugging)

Process Explorer

Debug View

Results

Detection Accuracy: 98.25%

Near zero false positives

Successfully detected zero-day ransomware samples

Future Improvements

Integration with cloud-based threat intelligence

Support for multiple operating systems

Real-time enterprise network deployment

Deep learning based ransomware detection
