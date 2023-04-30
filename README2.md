# Esercizio - Spring Boot - Interceptor-Middleware 2
* scrivere un'applicazione Spring Boot con le dipendenze necessarie che:
  * funziona con un'entità "Mese" che ha i seguenti attributi:
    * un int `monthNumber`
    * un `englishName`
    * un `italianName`
    * un `germanName`
  * ha 2 controller:
    * `BasicController` che:
      * dà il benvenuto all'utente sulla mappatura root
    * `MonthController` che:
      * è mappato su `mesi`
      * restituisce un `Mese` utilizzando uno specifico attributo di richiesta
  * ha un interceptor/middleware chiamato `MonthInterceptor` che:
    * ha un elenco di 6 `Month`s
    * prende l'intestazione `monthNumber` dalla richiesta
    * se `monthNumber` è nullo/vuoto, restituisce un errore HTTP `Bad Request`
    * altro:
      * controlla se il "numero mese" passato è presente nell'elenco
        * se presente, lo restituisce utilizzando uno specifico attributo di richiesta
        * else, restituisce un `Month` vuoto con tutti i valori di stringa impostati su `nope`
      * restituisce uno stato HTTP `OK`
* testare la chiamata dell'endpoint utilizzando `Postman` e considerando almeno 4 casi:
  * l'intestazione `monthNumber` è assente
  * l'intestazione `monthNumber` è vuota
  * l'intestazione `monthNumber` ha un valore che **è** nell'elenco
  * l'intestazione `monthNumber` ha un valore che **non è** nell'elenco
* **per i revisori**: la raccolta di chiamate API di `Postman` è in `Interceptors-2.postman_collection.json`

# Exercise - Spring Boot - Interceptors-Middleware 2
* write a Spring Boot application with the necessary dependencies that:
  * works with an entity `Month` that has the following attributes:
    * an int `monthNumber`
    * an `englishName`
    * an `italianName`
    * a `germanName`
  * has 2 controllers:
    * `BasicController` that:
      * welcomes the user on the root mapping
    * `MonthController` that:
      * is mapped on `months`
      * returns a `Month` using a specific request attribute
  * has an interceptor/middleware called `MonthInterceptor` that:
    * has a list of 6 `Month`s
    * takes the header `monthNumber` from the request
    * if `monthNumber` is null/empty then returns an HTTP `Bad Request` error
    * else:
      * looks if the passed `monthNumber` is present in the list
        * if present, returns it using a specific request attribute
        * else, returns an empty `Month` with all the string values set to `nope`
      * returns an HTTP `OK` status
* test the endpoint call using `Postman` and considering at least 4 cases:
  * the header `monthNumber` is absent
  * the header `monthNumber` is empty
  * the header `monthNumber` has a value that **is** in the list
  * the header `monthNumber` has a value that **is not** in the list
* **for reviewers**: `Postman`'s API calls collection is in `Interceptors-2.postman_collection.json`
