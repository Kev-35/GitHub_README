# Проект по автоматизации тестирования для компании [SWORDFISH SECURITY](https://swordfish-security.ru/)
<img width="240" title="Arcadia" src="files/logo/MainLogo.png" alt="">

> Эксперты Swordfish Security помогают выстроить комплексную защиту программного обеспечения и систем с искусственным интеллектом, снижая вероятность атак на ПО через уязвимости, компрометацию моделей и агентов.

## <a name="Содержание">**Содержание:**</a>
____

- [Технологии и инструменты](#технологии-и-инструменты)
- [Примеры автотестов](#примеры-тест-кейсов)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Запуск тестов](#запуск-тестов)
- [Пример Allure отчета](#пример-allure-отчета)
- [Уведомления в Telegram](#уведомления-в-telegram)
- [Видео примера запуска тестов Selenoid](#ввидео-примера-запуска-тестов-selenoid)
____

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">   
<a href="https://www.java.com/"><img src="files/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="files/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://github.com/"><img src="files/logo/Github.svg" width="50" height="50"  alt="Github"/></a>   
<a href="https://gradle.org/"><img src="files/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://junit.org/junit5/"><img src="files/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://selenide.org/"><img src="files/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="files/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="files/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>  
<a href="https://www.jenkins.io/"><img src="files/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/software/jira/"><img src="files/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>
</p>

В данном проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования <code>Selenide</code>.
- В качестве сборщика был использован - <code>Gradle</code>.
- Использованы фреймворки <code>JUnit 5</code> и <code>Selenide</code>.
- Прогон автотестов запускается на удалённом сервере <code>Selenoid</code>.
- Запуск реализован через <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота.
- Интеграция с <code>Jira</code>
____
## <a name="Примеры тест кейсов">**Примеры автотестов:**</a>
-  Проверка разделов главного меню
-  Поиск информации "О Компании" в поле "Search"
-  Поиск информации "Контакты" в поле "Search"
-  Открытие меню "Связаться с нами"
-  Проверка открытия подробностей по кнопке "Подробнее"
____
## <a name="Сборка в">**Сборка в Jenkins**</a> 
[Ссылка на сборку в Jenkins](https://jenkins.autotests.cloud/job/038-SwordfishSecurityBuild/) <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" widht="40" height="40" />

<img width="100%" style="vertical-align:middle" title="Allure_report" src="files/screen/Jenkins.png">

____
## <a name="Запуск тестов">**Запуск тестов:**</a>
### <img width="4%" style="vertical-align:middle" title="Jenkins" src="files/logo/Idea.svg"> Локальный запуск тестов в Idea
____
```
gradle clean test
```
### <img width="4%" style="vertical-align:middle" title="Jenkins" src="files/logo/Selenoid.svg"> Удалённый запуст тестов в Jenkins
____
```
clean test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-Dremote=https://user1:1234@${REMOTE}/wd/hub
```
____
## <a name="Пример Allure отчета">**Пример Allure отчета**</a> <img width="4%" style="vertical-align:middle" title="Allure" src="files/logo/Allure.svg">

[Ссылка на Allure отчёт](https://jenkins.autotests.cloud/job/038-SwordfishSecurityBuild/15/allure/)
### <img width="100%" style="vertical-align:middle" title="Allure_report" src="files/screen/Allure_report.png">
### <img width="100%" style="vertical-align:middle" title="Allure_testCase" src="files/screen/Allure_testCase.png">
____
## <a name="Уведомления в Telegram">**Уведомления в Telegram**</a> <img width="4%" style="vertical-align:middle" title="Telegram" src="files/logo/Telegram.svg">
### <img width="70%" style="vertical-align:middle" title="Telegram" src="files/screen/Telegram.png">
____
## <a name="Видео примера запуска тестов в Selenoid">**Видео примера запуска тестов в Selenoid:**</a>
<p align="center">  
<img src="files/video/c7680257db790e99f144a69f40efb9df.gif"/>
</p>






