## 📖 Description

Ce projet est une application web développée en **PHP** permettant de récupérer et d’afficher des informations sur des étudiants via une **API REST**.

L’objectif du TP est de mettre en pratique :
- la consommation d’une API REST ;
- l’organisation d’un projet PHP ;
- la séparation entre logique métier et affichage ;
- la gestion de données dynamiques dans une interface web.

---

# 📂 Structure du projet

```bash
tp2/
│── assets/        # Fichiers CSS et ressources statiques
│── config/        # Configuration de l’application
│── services/      # Communication avec l’API REST
│── views/         # Pages HTML / affichage utilisateur
│── index.php      # Point d’entrée principal
│── README.md
```

---

# ⚙️ Technologies utilisées

- PHP 7.4+
- HTML5
- CSS3
- API REST

---

# 🚀 Installation et exécution

## 1. Cloner le projet

```bash
git clone <url-du-repository>
```

## 2. Placer le projet dans votre serveur local

Exemples :
- `htdocs` pour XAMPP
- `www` pour WAMP
- `www` pour Laragon

---

## 3. Vérifier la configuration PHP

Assurez-vous que :
- PHP 7.4 ou supérieur est installé ;
- un serveur local fonctionne correctement ;
- l’option `allow_url_fopen` est activée dans `php.ini`.

---

# 🔧 Configuration de l’API

Modifier l’URL de l’API dans le fichier de configuration selon votre environnement.

Exemple :

```php
define('API_URL', 'http://localhost/api');
```

---

# ▶️ Lancer le projet

Démarrer votre serveur local puis accéder au projet via :

```bash
http://localhost/tp2
```

---

# 📌 Fonctionnalités

- Récupération des données depuis une API REST ;
- Affichage dynamique des étudiants ;
- Architecture simple et organisée ;
- Séparation entre services, vues et configuration.

---

# 👨‍💻 Auteur

**Thilleli Messaoudene**
