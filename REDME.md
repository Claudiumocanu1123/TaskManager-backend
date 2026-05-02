# Task Manager Backend

Backend pentru o aplicație de gestionare a task-urilor, construit cu Spring Boot.
Proiectul oferă un API REST simplu pentru crearea, modificarea și ștergerea task-urilor.

## Features

* creare task-uri
* listare task-uri
* update task
* ștergere task
* structură simplă, ușor de extins

## Tech Stack

* Java
* Spring Boot
* Maven

## Cum rulezi proiectul

1. Clonează repo-ul:

```
git clone https://github.com/claudiumocanu1123/TaskManager-backend.git
```

2. Intră în folder:

```
cd TaskManager-backend
```

3. Rulează aplicația:

```
./mvnw spring-boot:run
```

(sau `mvn spring-boot:run` dacă ai Maven instalat global)

## API Endpoints

Exemple de endpoint-uri:

* GET `/api/tasks` – returnează toate task-urile
* POST `/api/tasks` – creează un task nou
* PUT `/api/tasks/{id}` – actualizează un task
* DELETE `/api/tasks/{id}` – șterge un task

## Structura proiectului

* `controller` – gestionează request-urile HTTP
* `service` – logica aplicației
* `repository` – accesul la date
* `model` – entitățile

## Notes

Proiectul este în dezvoltare, urmează să adaug:

* autentificare
* validări mai stricte
* integrare cu frontend

---

Dacă vrei să contribui sau ai sugestii, feel free 👍
