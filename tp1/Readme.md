# TP1 – SOAP Web Service avec JAX-WS (Java)

## Présentation

Ce TP a pour objectif de mettre en place un **service web SOAP** en Java en utilisant **JAX-WS**.
Le service permet d’appeler à distance plusieurs méthodes simples comme une conversion, un calcul de somme et le retour d’un objet `Etudiant`.

Le service est déployé localement et peut être testé à l’aide d’un outil comme **SoapUI**.

---

## Technologies utilisées

* Java (Java 8)
* SOAP
* JAX-WS
* JAXB
* HTTP
* SoapUI (pour les tests)

---

## Organisation du projet

Le projet est composé de trois fichiers principaux :

```
src/
├── Application.java
├── MonserviceWeb.java
└── Etudiant.java
```

### Description des fichiers

* **Application.java**
  Contient la méthode `main`.
  Elle permet de lancer et publier le service web SOAP à une adresse locale.

* **MonserviceWeb.java**
  Définit le service web et les méthodes accessibles à distance.

* **Etudiant.java**
  Représente un étudiant avec ses informations (identifiant, nom, moyenne).
  Cet objet est échangé via le service SOAP.

---

## Déploiement du service

Le service est publié à l’adresse suivante :

```
http://localhost:8888/
```

Une fois l’application lancée, la description du service (WSDL) est accessible à :

```
http://localhost:8888/?wsdl
```

Cela permet de vérifier que le service fonctionne correctement.

---

## Méthodes disponibles

### convertir

* Prend un nombre en entrée
* Retourne une valeur convertie (multipliée par 0.9)

### somme

* Prend deux nombres en entrée
* Retourne leur somme

### getEtudiant

* Retourne un objet `Etudiant`
* L’étudiant contient un identifiant, un nom et une moyenne

---

## Classe Etudiant

La classe `Etudiant` est utilisée pour représenter un objet échangé entre le service et le client.

Elle contient :

* un constructeur vide
* un constructeur avec paramètres
* des getters et setters
  Elle implémente `Serializable` afin de permettre son envoi via SOAP.

---

## Tests

Le service a été testé à l’aide de **SoapUI** en envoyant des requêtes SOAP en XML.
Les requêtes sont envoyées en **POST** avec le type `text/xml`.

---

## Conclusion

Ce TP permet de comprendre le fonctionnement d’un service web SOAP en Java, la publication d’un service avec JAX-WS et l’échange de données simples et complexes via XML.



