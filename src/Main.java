public class Main {
    public static void main(String[] args) {
        /*Задача1
        Person person = new Person("Алиса", 25, "Женский");
        person.printInfo();
        person.increaseAge();
        System.out.println("После увеличения возраста:");
        person.printInfo();
        person.changeName("Алисия");
        System.out.println("После изменения имени:");
        person.printInfo();
        */
        /*Задача2
        Worker worker1 = new Worker("Иван Иванов", 30, 50000);
        Worker worker2 = new Worker("Петр Петров", 28, 55000);
        Worker[] subordinates = { worker1, worker2 };
        Manager manager = new Manager("Алексей Смирнов", 40, 70000, subordinates);
        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(manager);
         */
        /*Задача3
        Animal[] animals = new Animal[] {
                        new Dog(),
                        new Cat(),
                        new Cow()
                };

        for (Animal animal : animals) {
            animal.makeSound();
        }
         */
        /*Задача4
        Transport[] transports = new Transport[] {
                new Car(),
                new Bike()
        };
        for (Transport transport : transports) {
            transport.move();
        }
         */
        /*Задача5
        Library library = new Library();
        library.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        library.addBook(new Book("Преступление и наказание", "Фёдор Достоевский", 1866));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));
        List<Book> tolstoyBooks = library.findBooksByAuthor("Лев Толстой");
        System.out.println("Книги Льва Толстого: " + tolstoyBooks);
        List<Book> books1967 = library.findBooksByYear(1967);
        System.out.println("Книги 1967 года: " + books1967);
        */
        /*Задача6
        BankAccount account = new BankAccount("123456789", 1000.00);
        System.out.println(account);
        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(1500.00);
        System.out.println("Текущий баланс: " + account.getBalance());
        */
        /*Задача7
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        System.out.println(Counter.getCount());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        */
        /*Задача8
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
         */
        /*Задача9
        Animal fish = new Fish();
        Animal bird = new Bird();
        Animal dog = new Dog();
        fish.move(); // Выводит: Рыба плавает в воде
        bird.move(); // Выводит: Птица летает в небе
        dog.move();  // Выводит: Собака бегает по земле
         */
        /*Задача10
        University university = new University();
        university.addStudent(new Student("Алексей Иванов", "Группа A", 4.5));
        university.addStudent(new Student("Мария Петрова", "Группа B", 3.9));
        university.addStudent(new Student("Иван Смирнов", "Группа A", 4.7));
        university.addStudent(new Student("Ольга Кузнецова", "Группа C", 4.2));
        System.out.println("Студенты до сортировки:");
        System.out.println(university);

        university.sortByName();

        System.out.println("\nСтуденты после сортировки по имени:");
        System.out.println(university);

        List<Student> highGradeStudents = university.filterByGrade(4.0);

        System.out.println("\nСтуденты с высокой успеваемостью (оценка >= 4.0):");
        highGradeStudents.forEach(System.out::println);
        */
        /*Задача11
        Store store = new Store();
        store.addProduct(new Product("Молоко", 50.0, 10));
        store.addProduct(new Product("Хлеб", 30.0, 20));
        store.addProduct(new Product("Сахар", 45.0, 15));
        System.out.println("\nПродукты в магазине:");
        System.out.println(store);
        System.out.println("\nПоиск продукта 'Хлеб':");
        Product foundProduct = store.findProduct("Хлеб");
        if (foundProduct != null) {
            System.out.println("Найден продукт: " + foundProduct);
        }
        store.removeProduct("Молоко");
        System.out.println("\nПродукты после удаления:");
        System.out.println(store);
        */
        /*Задача12
            PaymentSystem creditCardPayment = new CreditCard();
            PaymentSystem payPalPayment = new PayPal();
            creditCardPayment.pay(1500.0);
            creditCardPayment.refund(500.0);
            payPalPayment.pay(2000.0);
            payPalPayment.refund(800.0);

         */
        /*Задача13
        UniqueID ob1 = new UniqueID();
        UniqueID ob2 = new UniqueID();
        UniqueID ob3 = new UniqueID();
        System.out.println("ID первого объекта:" + ob1.getID());
        System.out.println("ID первого объекта:" + ob2.getID());
        System.out.println("ID первого объекта:"+ ob3.getID());
         */
        /*Задача13
        Point p1 = new Point(1, 5);
        Point p2 = new Point(5, 1);
        Rectangle rectangle = new Rectangle (p1, p2);
        System.out.println(rectangle);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
         */
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);
        ComplexNumber quotient = c1.divide(c2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}
            /*Задача1
           class Person {
               private String name;
               private int age;
               private String gender;

               public Person(String name, int age, String gender) {
                   this.name = name;
                   this.age = age;
                   this.gender = gender;
               }

               public void printInfo() {
                   System.out.println("Имя: " + name);
                   System.out.println("Возраст: " + age);
                   System.out.println("Пол: " + gender);
               }

               public void increaseAge() {
                   age++;
               }

               public void changeName(String newName) {
                   this.name = newName;
               }

               public String getName() {
                   return name;
               }

               public void setName(String name) {
                   this.name = name;
               }

               public int getAge() {
                   return age;
               }

               public void setAge(int age) {
                   this.age = age;
               }

               public String getGender() {
                   return gender;
               }

               public void setGender(String gender) {
                   this.gender = gender;
               }
           }
    *////////////////////////////////
               /*Задача2
               class Person {
                   private String name;
                   private int age;
                   public Person(String name, int age) {
                       this.name = name;
                       this.age = age;
                   }
                   public String getName() {
                       return name;
                   }

                   public int getAge() {
                       return age;
                   }

                   @Override
                   public String toString() {
                       return "Person{name='" + name + "', age=" + age + "}";
                   }
               }

               class Worker extends Person {
                   private double salary;

                   public Worker(String name, int age, double salary) {
                       super(name, age);
                       this.salary = salary;
                   }

                   public double getSalary() {
                       return salary;
                   }

                   @Override
                   public String toString() {
                       return "Worker{name='" + getName() + "', age=" + getAge() + ", salary=" + salary + "}";
                   }
               }

               class Manager extends Worker {
                   private Worker[] subordinates;

                   public Manager(String name, int age, double salary, Worker[] subordinates) {
                       super(name, age, salary);
                       this.subordinates = subordinates;
                   }

                   public Worker[] getSubordinates() {
                       return subordinates;
                   }

                   @Override
                   public String toString() {
                       return "Manager{name='" + getName() + "', age=" + getAge() + ", salary=" + getSalary() + ", subordinates=" + subordinates.length + "}";
                   }
               }
           *////////////////////////////////
        /*Задача3
        interface Animal {
            void makeSound();
        }
        class Dog implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof!");
            }
        }
        class Cat implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Meow!");
            }
        }
        class Cow implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Moo!");
            }
        }
    *////////////////////////////////
        /*Задача4
        abstract class Transport {
            public abstract void move();
        }

        class Car extends Transport {
            @Override
            public void move() {
                System.out.println("Автомобиль движется по дороге");
            }
        }

        class Bike extends Transport {
            @Override
            public void move() {
                System.out.println("Велосипед движется по дороге");
            }
        }

    *////////////////////////////////
        /*Задача5
        class Book {
            private String title;
            private String author;
            private int year;

            public Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            @Override
            public String toString() {
                return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
            }
        }

        class Library {
            private List<Book> books;


            public Library() {
                books = new ArrayList<>();
            }

            public void addBook(Book book) {
                books.add(book);
            }

            public List<Book> findBooksByAuthor(String author) {
                return books.stream()
                        .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                        .collect(Collectors.toList());
            }

            public List<Book> findBooksByYear(int year) {
                return books.stream()
                        .filter(book -> book.getYear() == year)
                        .collect(Collectors.toList());
            }

            @Override
            public String toString() {
                return "Library{books=" + books + "}";
            }
        }


    *////////////////////////////////
        /*Задача6
        class BankAccount {
            private String accountNumber;
            private double balance;

            public BankAccount(String accountNumber, double initialBalance) {
                this.accountNumber = accountNumber;
                this.balance = initialBalance;
            }

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Пополнено на " + amount + ". Текущий баланс: " + balance);
                } else {
                    System.out.println("Сумма пополнения должна быть положительной.");
                }
            }

            public void withdraw(double amount) {
                if (amount > 0) {
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Снято " + amount + ". Текущий баланс: " + balance);
                    } else {
                        System.out.println("Недостаточно средств на счёте.");
                    }
                } else {
                    System.out.println("Сумма снятия должна быть положительной.");
                }
            }
            public double getBalance() {
                return balance;
            }
            public String getAccountNumber() {
                return accountNumber;
            }

            @Override
            public String toString() {
                return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
            }
        }

    *////////////////////////////////
            /*Задача7
            class Counter {
                private static int count = 0;

                public Counter() {
                    count++;
                }

                public static int getCount() {
                    return count;
                }

                @Override
                public String toString() {
                    return "Количество созданных объектов: " + count;
                }
            }
    *////////////////////////////////
            /*Задача8
            abstract class Shape {
                public abstract double getArea();
            }
            class Circle extends Shape {
                private double radius; // Радиус круга
                public Circle(double radius) {
                    this.radius = radius;
                }
                @Override
                public double getArea() {
                    return Math.PI * radius * radius;
                }
            }
            class Rectangle extends Shape {
                private double width;
                private double height;
                public Rectangle(double width, double height) {
                    this.width = width;
                    this.height = height;
                }
                @Override
                public double getArea() {
                    return width * height;
                }
            }
    *////////////////////////////////
            /*Задача9
            class Animal {
                public void move() {
                    System.out.println("Животное движется");
                }
            }
            class Fish extends Animal {
                @Override
                public void move() {
                    System.out.println("Рыба плавает в воде");
                }
            }
            class Bird extends Animal {
                @Override
                public void move() {
                    System.out.println("Птица летает в небе");
                }
            }
            class Dog extends Animal {
                @Override
                public void move() {
                    System.out.println("Собака бегает по земле");
                }
            }
    *////////////////////////////////
            /*Задача10
            class Student {
                private String name;
                private String group;
                private double grade;
                public Student(String name, String group, double grade) {
                    this.name = name;
                    this.group = group;
                    this.grade = grade;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getGroup() {
                    return group;
                }

                public void setGroup(String group) {
                    this.group = group;
                }

                public double getGrade() {
                    return grade;
                }

                public void setGrade(double grade) {
                    this.grade = grade;
                }

                @Override
                public String toString() {
                    return name + " (" + group + ", " + grade + ")";
                }
            }

            class University {
                private List<Student> students;

                public University() {
                    students = new ArrayList<>();
                }

                public void addStudent(Student student) {
                    students.add(student);
                }

                public void sortByName() {
                    students.sort(Comparator.comparing(Student::getName));
                }

                public List<Student> filterByGrade(double minGrade) {
                    return students.stream()
                            .filter(student -> student.getGrade() >= minGrade)
                            .collect(Collectors.toList());
                }

                @Override
                public String toString() {
                    if (students.isEmpty()) {
                        return "Нет студентов в университете.";
                    }
                    return students.stream()
                            .map(Student::toString)
                            .collect(Collectors.joining("\n"));
                }
            }
    *////////////////////////////////
            /*Задача11
            class Product {
                private String name;
                private double price;
                private int quantity;

                public Product(String name, double price, int quantity) {
                    this.name = name;
                    this.price = price;
                    this.quantity = quantity;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public int getQuantity() {
                    return quantity;
                }

                public void setQuantity(int quantity) {
                    this.quantity = quantity;
                }

                @Override
                public String toString() {
                    return name + " (Цена: " + price + ", Количество: " + quantity + ")";
                }
            }

            class Store {
                private List<Product> products;

                public Store() {
                    products = new ArrayList<>();
                }

                public void addProduct(Product product) {
                    products.add(product);
                    System.out.println(product.getName() + " добавлен в магазин.");
                }

                public void removeProduct(String productName) {
                    products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
                    System.out.println(productName + " удален из магазина.");
                }

                public Product findProduct(String productName) {
                    for (Product product : products) {
                        if (product.getName().equalsIgnoreCase(productName)) {
                            return product;
                        }
                    }
                    System.out.println("Товар с именем " + productName + " не найден.");
                    return null;
                }

                @Override
                public String toString() {
                    if (products.isEmpty()) {
                        return "Магазин пуст.";
                    }
                    return products.stream()
                            .map(Product::toString)
                            .collect(Collectors.joining("\n")); 
                }
            }

    *////////////////////////////////
            /*Задача12
            interface PaymentSystem {
                void pay(double amount);
                void refund(double amount);
            }

            class CreditCard implements PaymentSystem {

                @Override
                public void pay(double amount) {
                    System.out.println("Оплата " + amount + " руб. с помощью кредитной карты.");
                }

                @Override
                public void refund(double amount) {
                    System.out.println("Возврат " + amount + " руб. на кредитную карту.");
                }
            }

            class PayPal implements PaymentSystem {

                @Override
                public void pay(double amount) {
                    System.out.println("Оплата " + amount + " руб. с помощью PayPal.");
                }

                @Override
                public void refund(double amount) {
                    System.out.println("Возврат " + amount + " руб. через PayPal.");
                }
            }
    *////////////////////////////////
            /*Задача13
            class UniqueID {
                private static int currentID = 0;
                private int id;

                public UniqueID() {
                    this.id = generateID();
                }

                private static int generateID() {
                    return ++currentID;
                }

                public int getID() {
                    return id;
                }

                @Override
                public String toString() {
                    return "UniqueID{" + "id=" + id + '}';
                }
            }
    *////////////////////////////////
            /*Задача14
            class Point {
                private int x;
                private int y;

                public Point(int x, int y) {
                    this.x = x;
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public int getY() {
                    return y;
                }
                @Override
                public String toString() {
                    return "(" + x + ", " + y + ")";
                }

            }
            class Rectangle {
                private Point topLeft;
                private Point bottomRight;

                public Rectangle(Point topLeft, Point bottomRight) {
                    this.topLeft = topLeft;
                    this.bottomRight = bottomRight;
                }

                public int getArea() {
                    int width = Math.abs(bottomRight.getX() - topLeft.getX());
                    int height = Math.abs(topLeft.getY() - bottomRight.getY());
                    return width * height;
                }

                @Override
                public String toString() {
                    return "Прямоугольник с вершинами " + topLeft + " и " + bottomRight;
                }
            }
    *////////////////////////////////
            class ComplexNumber {
                private double real;  // Действительная часть
                private double imaginary; // Мнимая часть

                public ComplexNumber(double real, double imaginary) {
                    this.real = real;
                    this.imaginary = imaginary;
                }

                public ComplexNumber add(ComplexNumber other) {
                    double newReal = this.real + other.real;
                    double newImaginary = this.imaginary + other.imaginary;
                    return new ComplexNumber(newReal, newImaginary);
                }

                public ComplexNumber subtract(ComplexNumber other) {
                    double newReal = this.real - other.real;
                    double newImaginary = this.imaginary - other.imaginary;
                    return new ComplexNumber(newReal, newImaginary);
                }

                public ComplexNumber multiply(ComplexNumber other) {
                    double newReal = this.real * other.real - this.imaginary * other.imaginary;
                    double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
                    return new ComplexNumber(newReal, newImaginary);
                }

                public ComplexNumber divide(ComplexNumber other) {
                    double denominator = other.real * other.real + other.imaginary * other.imaginary;
                    double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
                    double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
                    return new ComplexNumber(newReal, newImaginary);
                }

                @Override
                public String toString() {
                    return real + " + " + imaginary + "i";
                }
            }




