# Командный проект по курсу «Java для тестировщиков»

* [Цели проекта](#цели-проекта)
* [Чеклист готовности к работе над проектом](#Чеклист-готовности-к-работе-над-проектом)
* [Описание проекта](#Описание-проекта)
* [Сроки реализации проекта](#Сроки-реализации-проекта)
* [Инструкция к выполнению](#Инструкция-к-выполнению)
  * [1 этап](#1-этап)
  * [2 этап](#2-этап)
  * [3 этап](#3-этап)
  * [4 этап](#4-этап)
  * [5 этап](#5-этап)
* [Правила сдачи проекта](#Правила-сдачи-проекта)
* [Критерии оценки](#критерии-оценки)


## Цели проекта

Цель командного проекта — протестировать приложение для трекинга игровой активности.  
Вам предстоит:
- самостоятельно протестировать часть проекта,
- составить баг-репорты на найденные баги,
- закрыть баг-репорты, составленные вашим коллегой.

В результате выполнения командного проекта вы:
- получите практический опыт работы в команде,
- прокачаете навыки коммуникации и умение выполнять задачи в срок,
- закрепите навыки работы с GitHub,
- потренируете навык проверки кода и совместной разработки.

## Чеклист готовности к работе над проектом

1. Изучили «Инструкцию по выполнению командного проекта» и «Правила работы в команде» в личном кабинете.
2. Знаете, кто с вами в команде.
3. Познакомились с напарником и определились, каким способом будете общаться: переписка в любом мессенджере, видеозвонки.
4. Договорились, кто будет размещать общий репозиторий проекта и отправлять его на проверку.
5. Изучили материалы лекции «Collections Framework. CRUD и тестирование систем, управляющих набором объектов».

Если все этапы чеклиста пройдены, то можете смело приступать к работе над проектом. Успехов!

## Описание проекта

- В репозитории находится заготовка проекта, в котором есть классы  для трёх сущностей: игры (`Game`), игрока (`Player`), каталога игр (`GameStore`).

- Каждая игра принадлежит какому-то каталогу.

- Каждый игрок может добавить себе в коллекцию игру.

- Также игрок может поиграть в добавленную игру через вызов своего метода `play`, тогда система записывает количество часов, которые он проиграл в игру.

- Информация о проигранном времени хранится и в объекте игрока, и в объекте каталога игр, в чью игру он поиграл.

- Также в классе игрока и каталога игр есть методы для подсчёта разного вида статистик по играм и игрокам.

- Над каждым методом в коде есть описание того, как он должен работать. При этом часть методов в этих классах не реализована, часть реализована с дефектами.

**Ваша задача** — исправить эти дефекты и дописать нереализованные методы.

## Сроки реализации проекта

Работа над проектом рассчитана на 10 дней для команды из двух человек. Для планирования своего времени рекомендуется опираться на роадмап. Придерживайтесь следующего деления проекта на этапы и задачи участников:
| Этапы | Количество дней | Задачи |
| ----- | --------------- | ----- |
| 1, 2 этапы | 1 день | Создание репозитория для проекта, предоставление доступа участникам, распределение задач |
| 3 этап | 2 дня | Поиск дефектов, добавление тестов и составление баг-репортов|
| 4 этап | 2 дня | Исправление дефектов и реализация методов |
| 5 этап | 2 дня| Проверка на дефекты |
| Сдача проекта | 3 дня | Отправка и обратная связь от проверяющего преподавателя |
| Доработка по результатам* (при необходимости) | 2 дня | Доработка проекта по итогам обратной связи от проверяющего |
| Повторная сдача проекта* (при необходимости) | 3 дня | Отправка и обратная связь от проверяющего преподавателя |

## Инструкция к выполнению

### 1 этап. Создание общего репозитория

- Один из участников создаёт у себя репозиторий и размещает в нём содержимое этого репозитория, не через `Fork`, настраивает CI.

- Для предоставления доступа второму участнику необходимо зайти в `Settings` репозитория проекта, найти раздел `Collaborators`, кликнуть по кнопке `Add people`, добавить ник напарника и выбрать роль `Admin`.

### 2 этап. Распределение задач

Распределите задачи между участниками в соответствии с таблицей.
|  | Участник А | Участник Б |
| --- | ----------- | ----- |
| Ищет дефекты в | Класс `GameStore` | Класс `Player` |
| Исправляет дефекты в | Класс `Player` | Класс `GameStore` |

Отведите две ветки — `player` для исправления дефектов в `Player` и `gamestore` для исправления дефектов в `GameStore`.

### 3 этап. Поиск дефектов

|  | Участник А | Участник Б |
| --- | ----------- | ----- |
| Ищет дефекты в | Класс `GameStore` | Класс `Player` |
| Добавляет тесты в | Класс `GameStoreTest` | Класс `PlayerTest` |
| Составляет баг-репорты | по [образцу](https://github.com/netology-code/javaqa2-homeworks/blob/main/JAVA_INTRO.md#%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82-%D0%BE%D1%84%D0%BE%D1%80%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B1%D0%B0%D0%B3-%D1%80%D0%B5%D0%BF%D0%BE%D1%80%D1%82%D0%B0) | по [образцу](https://github.com/netology-code/javaqa2-homeworks/blob/main/JAVA_INTRO.md#%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82-%D0%BE%D1%84%D0%BE%D1%80%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B1%D0%B0%D0%B3-%D1%80%D0%B5%D0%BF%D0%BE%D1%80%D1%82%D0%B0) |

**Важно**: никакие классы на этом этапе менять нельзя.

### 4 этап. Исправление дефектов и реализация методов

|  | Участник А | Участник Б |
| --- | ----------- | ----- |
| Исправляет найденные баги в | Класс `Player` | Класс `GameStore` |
| Исправления коммитятся в ветку | `player` | `gamestore` |

Никакие другие классы менять нельзя.

### 5 этап. Проверка на дефекты

- Оба участника возвращаются к этапу 3 **«Поиск дефектов»** и составляют новые баг-репорты.

- Если новые дефекты  найдены, то участники переходят опять к этапу 4 **«Исправление дефектов и реализация методов»**.

- Если дефектов в ветке не найдено, то участник, который поддерживает эту ветку, делает `merge` в `main`, при необходимости разрешая конфликты. `merge` следует делать через `PullRequest`.

## Правила сдачи проекта

- Все дефекты исправлены.
- Все ветки слиты в `main`.
- Все баг-репорты закрыты.
- CI-сборка зелёная.
- Добавлена ссылка на публичный репозиторий в личном кабинете в поле «Ссылка на решение».
- Важно: перед отправкой в поле «Отправить на проверку эксперту» проставлена галочка.

## Критерии оценки проекта

В командном проекте будет оцениваться:
* какие дефекты были найдены каждым участником команды, а также [как они были оформлены](https://github.com/netology-code/javaqa2-homeworks/blob/main/JAVA_INTRO.md#%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82-%D0%BE%D1%84%D0%BE%D1%80%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B1%D0%B0%D0%B3-%D1%80%D0%B5%D0%BF%D0%BE%D1%80%D1%82%D0%B0);
* какие дефекты были исправлены каждым участником команды, включая качество кода.

В случае если ряд важных багов выявлен не был, с подсказками проверяющего преподавателя можно вернуться к этапу 4 для исправления упущенных дефектов.

**Зачёт ставится обоим студентам при выполнении всех требований командного проекта.**