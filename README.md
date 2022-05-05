# Rest API todo листа.
***
Rest API написан на языке java, с использованием фрэймворка Spring boot. В качестве базы данных MySql. Сервис позволяет добавлять, удалять пользователя, добавлять задачи каждому пользователю, а также получать информацию о пользователях.
***

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#hand-предварительные-шаги">Предварительные шаги</a>
- <a href="#star-cоздание-пользователя">Создание пользователя</a>
- <a href="#star-попытка-создать-пользователя-с-одинаковым-именем">Попытка создать пользователя с одинаковым именем</a>


## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="MySql" src="images/logo/mysql.svg">
<img width="6%" title="Spring Boot" src="images/logo/springio-icon.svg">
</p>

### :hand: Предварительные шаги
Предварительно создаем таблицу:
```
create database demo_rest;
```
После запуска в базе создаются таблицы user и todo: <img title="Post method" src="images/screenshots/db.png">

### :star: Создание пользователя
Через метод POST создаём пользователя:
<p align="center">
    <img title="Post method" src="images/screenshots/postOk.png">
</p>

### :star: Попытка создать пользователя с одинаковым именем
Запрос вернет сообщение "Пользователь с таким именем уже существует", при попытке создать пользователя с уже существующем именем:
<p align="center">
    <img title="Post method" src="images/screenshots/postSecond.png">
</p>

### :star: Удаление пользователя
Запрос вернет сообщение с ID удаленного пользователя:
<p align="center">
    <img title="Post method" src="images/screenshots/delete.png">
</p>

### :star: Создание задачи пользователю
Запрос вернет сообщение с id и статусом задачи:
<p align="center">
    <img title="Post method" src="images/screenshots/postToDo.png">
</p>

### :star: Получить информацию о пользователе
Запрос вернет сообщение о пользователе и его задачах:
<p align="center">
    <img title="Post method" src="images/screenshots/getUser.png">
</p>

### :star: Информация в таблицах user и todo:
Запрос вернет сообщение о пользователе и его задачах:
<p>
    <img title="Post method" src="images/screenshots/dbtUsers.png">
    <img title="Post method" src="images/screenshots/dbToDo.png">
</p>