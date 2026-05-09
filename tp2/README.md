Gestion des Étudiants avec API REST

Ce projet est une application développée en PHP permettant d’afficher des informations sur des étudiants à partir d’une API REST.
Le code est organisé en plusieurs dossiers afin de séparer la configuration, les traitements et l’affichage.

Structure du Projet

Le projet contient les éléments suivants :

* index.php : fichier principal qui lance l’application, récupère les données nécessaires et charge les pages d’affichage.
* config/ : dossier contenant les paramètres de configuration de l’application.
* services/ : contient les fichiers gérant les échanges avec l’API REST.
* views/ : regroupe les fichiers d’interface utilisateur et d’affichage HTML.
* assets/ : contient les ressources statiques comme les feuilles de style CSS.

Technologies utilisées

* PHP
* HTML / CSS
* API REST

Configuration

Avant de lancer le projet, vérifier que :

* PHP 7.4 ou une version supérieure est installé ;
* un serveur local est disponible (XAMPP, WAMP, Laragon, etc.) ;
* l’option allow_url_fopen est activée dans la configuration PHP.

Adresse de l’API

Dans le fichier de configuration, modifier l’URL de l’API selon votre environnement :
