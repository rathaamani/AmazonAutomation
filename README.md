# 🛒 Amazon Automation Project

This project is a **Selenium-based Test Automation Framework** designed to automate various functionalities of the Amazon India website. It demonstrates professional-level automation using the **Page Object Model (POM)** design pattern, **TestNG**, **WebDriverManager**, and **Maven** for efficient and scalable test development.

---

## 📌 Features

- 🔍 **Search Functionality** – Automates product search with dynamic keyword input.
- 🧰 **Filter Application** – Applies brand, price, and other filters.
- 🛒 **Add to Cart** – Adds selected products (e.g., 5 Adidas cricket bats) to the shopping cart within a specified price range.
- ✅ **Assertions** – Verifies product titles, prices, and cart counts.
- 🔄 **Cross-Browser Testing** – Easily configurable for different browsers (e.g., Firefox, Chrome).
- 🔧 **Modular Framework** – Built using Page Object Model for code reusability and easy maintenance.
- 📦 **Maven Integrated** – Dependency management and project build.
- 🧪 **TestNG Framework** – Test organization, execution, and reporting.
- 📈 **Scalable Architecture** – Easy to extend for additional Amazon functionalities.

---

## 🛠️ Tech Stack

| Tool              | Description                                   |
|-------------------|-----------------------------------------------|
| Java              | Core programming language                     |
| Selenium WebDriver| Browser automation                            |
| TestNG            | Testing framework                             |
| Maven             | Build and dependency management               |
| WebDriverManager  | Driver management                             |
| POM (Page Object Model)| Design pattern for maintainable test code  |
| Firefox           | Default browser for testing (configurable)    |

---

## 🗂️ Project Structure

```
amazon-automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/             # Page Object classes
│   │       └── utils/             # Utility functions (e.g., Waits, ConfigReader)
│   │
│   └── test/
│       └── java/
│           └── tests/            # TestNG test cases
│           └── base/             # BaseTest class setup/teardown
│
├── testng.xml                    # Test suite configuration
├── pom.xml                       # Maven configuration file
└── README.md                     # Project documentation
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/amazon-automation.git
cd amazon-automation
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run Tests

```bash
mvn test
```

Or run using TestNG from your IDE using the `testng.xml` file.

---

## 📷 Sample Test Case

- Search for **Adidas Cricket Bats**
- Apply **price filter: ₹7500 - ₹10000**
- Add **5 products** to the cart
- Validate if all items are added successfully

---

## 📌 To-Do / Future Enhancements

- ✅ Login/Signup automation
- ✅ Checkout and payment flow (mock or stubbed)
- ⏳ Integration with Jenkins and Allure reports
- ⏳ Integration with Docker for test containerization

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!  
Feel free to fork the repository and submit a Pull Request.

---

## 👨‍💻 Author

**Rathaamani**  
Automation Engineer | Java Developer  
📧 rathaamani2001@gmail.com  
🌐 https://www.linkedin.com/in/rathaamani
