# Rest API todo листа.
***
Rest API написан на языке java, с использованием фрэймворка Spring boot. В качестве базы данных MySql. Сервис позволяет добавлять, удалять пользователя, добавлять задачи каждому пользователю, а также получать информацию о пользователях.
***

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#hand-предварительные-шаги">Предварительные шаги</a>
- <a href="#star-cоздание-пользователя">Создание пользователя</a>
- <a href="#star-попытка-создать-пользователя-с-одинаковым-именем">Попытка создать пользователя с одинаковым именем</a>
- <a href="#star-удаление-пользователя">Удаление пользователя</a>
- <a href="#star-создание-задачи-пользователю">Создание задачи пользователю</a>
- <a href="#star-получить-информацию-о-пользователе">Получить информацию о пользователе</a>
- <a href="#star-информация-в-таблицах-user-и-todo">Информация в таблицах user и todo</a>

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
После запуска в базе создаются таблицы user и todo:
<p>
    <img title="DB" src="images/screenshots/datab.png">
</p>

### :star: Создание пользователя
Через метод POST создаём пользователя:
<p align="center">
    <img title="Post method" src="images/screenshots/postOkay.png">
</p>

### :star: Попытка создать пользователя с одинаковым именем
Запрос вернет сообщение "Пользователь с таким именем уже существует", при попытке создать пользователя с уже существующем именем:
<p align="center">
    <img title="Post method bad" src="images/screenshots/postSec.png">
</p>

### :star: Удаление пользователя
Запрос вернет сообщение с ID удаленного пользователя:
<p align="center">
    <img title="Post del" src="images/screenshots/del.png">
</p>

### :star: Создание задачи пользователю
Запрос вернет сообщение с id и статусом задачи:
<p align="center">
    <img title="Post todo" src="images/screenshots/posToDo.png">
</p>

### :star: Получить информацию о пользователе
Запрос вернет сообщение о пользователе и его задачах:
<p align="center">
    <img title="get method" src="images/screenshots/getUsers.png">
</p>

### :star: Информация в таблицах user и todo:
Запрос вернет сообщение о пользователе и его задачах:
<p>
    <img title="DB User" src="images/screenshots/dbUser.png">
    <img title="DB todo" src="images/screenshots/dbToDos.png">
</p>