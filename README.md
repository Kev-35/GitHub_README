# Проект по автоматизации тестирования для компании [SWORDFISH SECURITY](https://swordfish-security.ru/)
<img width="40%" title="Arcadia" src="files/logo/MainLogo.png">

> Эксперты Swordfish Security помогают выстроить комплексную защиту программного обеспечения и систем с искусственным интеллектом, снижая вероятность атак на ПО через уязвимости, компрометацию моделей и агентов.

## <a name="Содержание:">**Содержание:**</a>
____

- [Технологии и инструменты](#технологии-и-инструменты)
- [Примеры автоматизированных тест-кейсов:](#примеры-автоматизированных-тест-кейсов:)
- [Запуск автотестов](#computer-запуск-автотестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure Report](#-пример-allure-отчета)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testOps)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)
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
</p>

В данном проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования <code>Selenide</code>.
- В качестве сборщика был использован - <code>Gradle</code>.
- Использованы фреймворки <code>JUnit 5</code> и <code>Selenide</code>.
- Прогон автотестов запускается на удалённом сервере <code>Selenoid</code>.
- Запуск реализован через <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота.
- Интеграция с и <code>Jira</code>
____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест кейсов">**Примеры автоматизированных тест-кейсов:**</a>
-  Проверка разделов главного меню
-  Поиск информации "О Компании" в поле "Search"
-  Поиск информации "Контакты" в поле "Search
-  Проверка ввода некорректного email, заполнения чек-бокса и нажатия кнопки подписки на рассылку*
____
## <a name="Сборка в">**Сборка в Jenkins**</a> 
[Ссылка на сборку в Jenkins](https://jenkins.autotests.cloud/job/38-belebear-rigla_project_lesson12/) <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" widht="40" height="40" />
____
<a id="cases"></a>
## <a name="Запуск тестов через терминал">**Запуск тестов через терминал:**</a>


### <img width="4%" style="vertical-align:middle" title="Jenkins" src="files/logo/Idea.svg"> Локальный запуст тестов в Idea

```
gradle clean mainPage
```
### <img width="4%" style="vertical-align:middle" title="Jenkins" src="files/logo/Selenoid.svg"> Удалённый запуст тестов в Jenkins

```
clean ${TESTS} -Dremote=${REMOTE} -Dbrowser=${BROWSER} -DbrowserSize=${BROWSER_SIZE} -DbrowserVersion=${BROWSER_VERSION}
```
____
## <img width="4%" style="vertical-align:middle" title="Allure" src="files/logo/Allure.svg"> <a name="Пример Allure Report">**Пример Allure Report**</a>
[Ссылка на Allure отчёт](https://jenkins.autotests.cloud/job/038-Anna_Shelyakina-Jenkins-arcadia-project/allure/)
____



## Пример видео с выполнением теста
<p align="center">  
<img src="files/video/c7680257db790e99f144a69f40efb9df.mp4"/>
</p>






