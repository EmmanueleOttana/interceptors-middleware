# Esercizio - Spring Boot - Interceptor-Middleware 1
* scrivere un'applicazione Spring Boot con le dipendenze necessarie che:
  * ha 2 controller:
    * `BasicController` che:
      * è mappato su `time`
      * restituisce la data/ora corrente
    * `LegacyController` che:
      * è mappato su `legacy`
      * restituisce `Questo è solo un vecchio codice`
  * ha 2 intercettori/middleware:
    * `APILoggingInterceptor` che stampa nella console l'intestazione delle richieste `User-Agent`, prima di gestirle
    * `LegacyIntercepotr` che:
      * blocca le chiamate API all'endpoint `legacy`
      * restituisce una risposta con lo stato del codice HTTP corretto per "Andato".
* testare le 2 chiamate dell'endpoint API utilizzando `Postman`
* **per i revisori**: la raccolta di chiamate API di `Postman` si trova in `Interceptors-1.postman_collection.json` sotto la radice

# Exercise - Spring Boot - Interceptors-Middleware 1
* write a Spring Boot application with the necessary dependencies that:
  * has 2 controllers:
    * `BasicController` that:
      * is mapped on `time`
      * returns the current date/time
    * `LegacyController` that:
      * is mapped on `legacy`
      * returns `This is just old code`
  * has 2 interceptors/middleware:
    * `APILoggingInterceptor` that prints in the console the requests header `User-Agent`, before handling them
    * `LegacyIntercepotr` that:
      * blocks the API calls to the `legacy` endpoint
      * returns a response with the right HTTP code status for `Gone`
* test the 2 API endpoint calls using `Postman`
* **for reviewers**: `Postman`'s API calls collection is in `Interceptors-1.postman_collection.json` under the root
