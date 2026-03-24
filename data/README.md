# 🎬 Movie Recommendation System (Java)

## 📌 Overview
This project is a content-based movie recommendation system built using Java. It suggests movies based on similarity by analyzing movie descriptions using basic NLP techniques.

## 🚀 Features
- Content-based filtering approach
- Text processing using Term Frequency (TF) and TF-IDF
- Cosine similarity for recommendation
- CSV-based dataset handling
- Simple and efficient recommendation logic

## 🛠 Tech Stack
- Java
- Collections Framework
- File Handling (CSV)
- Basic NLP (TF / TF-IDF)
- Cosine Similarity Algorithm

## 📂 Project Structure
Movie-Recommendation-System/
│── src/
│   ├── Main.java
│   ├── Movie.java
│   ├── Recommender.java
│   ├── CSVReader.java
│
│── data/
│   └── movies.csv
│
│── README.md

## ▶️ How to Run

Step 1: Clone Repository
git clone https://github.com/yourusername/movie-recommendation-system.git

Step 2: Navigate to Project
cd movie-recommendation-system

Step 3: Compile
cd src
javac *.java

Step 4: Run
cd ..
java -cp src Main

## 🎯 Example Usage

Input:
Inception

Output:
Recommended Movies:
- Interstellar
- Matrix
- Doctor Strange

## 🧠 How It Works
1. Loads movie dataset from CSV file
2. Converts descriptions into word frequency vectors
3. Calculates similarity using cosine similarity
4. Sorts movies based on similarity score
5. Recommends top similar movies

## ⚠️ Limitations
- Does not use user ratings
- Depends only on text similarity
- Accuracy depends on dataset

## 🚀 Future Improvements
- Add user-based recommendation system
- Use larger datasets (IMDb/Kaggle)
- Build web interface using Spring Boot
- Improve NLP accuracy

## 📌 Author
Gujja Yeshwanth Reddy
GitHub: https://github.com/GujjaYeshwanthreddy
LinkedIn: https://www.linkedin.com/in/yeshwanth123movie-recommendation-system