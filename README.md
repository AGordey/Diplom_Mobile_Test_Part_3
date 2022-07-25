# Проект по автоматизации тестирования мобильного приложения для части дипломного проекта онлайн-гипермаркета 21vek.by 
## <p align="center"> :arrow_right: <a target="_blank" href="https://www.21vek.by/">Онлайн-гипермаркет 21vek.by</a> :arrow_left: </p>
### <a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Andrei_Gordey-Diplom_UI_Test_Part_3/">Сборка в Jenkins</a>

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео с примером прохождения теста авторизации</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">

[//]: # (<img width="6%" title="Telegram" src="images/logo/Telegram.svg">)
</p>

```mermaid        
    stateDiagram-v2
        State1: START
        State2: Java & IntelliJ IDEA
        State3: Selenide & JUnit5
        State4: Gradle
        State5: GitHub
        State6: Jenkins
        State7: Selenoid
        State8: Allure Report
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State7 --> State8
        note right of State2 : Работа с кодом
        note left of State3 : Фреймворки
        note right of State4 : Сборка проекта
        note left of State5 : Система контроля версий и хостинг проекта
        note right of State6 : Параметризация и запуск сборки
        note left of State7 : Контейнеризация
        note right of State8 : Отчётность
```

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка наличия элементов главной страницы
- Проверка открытия вкладки "Все Акции"
- Проверка открытия вкладки "Каталог"
- Проверка наличия разделов в "Каталоге"
- Проверка добавления товара из главной страницы в корзину


## :electric_plug: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Andrei_Gordey-Diplom_UI_Test_Part_3/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/Jenkins.png">
</p>  

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
```
## :open_book: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/AllureMainPage.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/All testcases.png">
</p>


## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Как пример, видео проверки добавления товара в корзину с главной страницы.
<p align="center">
  <img title="Selenoid Video" src="images/gif/videoMobileTest.gif">
</p>