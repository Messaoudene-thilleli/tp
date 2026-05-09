

## 📖 Description

Dans ce TP, nous avons conteneurisé une API développée avec le framework **Flask** en utilisant **Docker**.

L’objectif est de créer une image Docker capable d’exécuter l’application de manière isolée dans un conteneur.

---

# 📂 Structure du projet

```bash
tp5/
│── Dockerfile         # Configuration de l’image Docker
│── serveur_student.py # Application Flask
│── README.md
```

---

# ⚙️ Technologies utilisées

- Python
- Flask
- Docker

---

# 🐳 Création du Dockerfile

L’API est empaquetée dans une image Docker en suivant les étapes suivantes :

1. Définir le dossier de travail du conteneur
2. Installer le framework Flask
3. Copier les fichiers du projet dans le conteneur
4. Exposer le port utilisé par l’application
5. Définir la commande de démarrage

---

# 🚀 Commandes de lancement

## Construire l’image Docker

```bash
docker build -t mon-app-tp2 .
```

---

## Lancer le conteneur

```bash
docker run -p 4900:5000 mon-app-tp2
```

Cette commande relie :
- le port `4900` de la machine ;
- au port `5000` du conteneur.

---

# 🌐 Test de l’API

Une fois le conteneur lancé, ouvrir un navigateur à l’adresse suivante :

```bash
http://localhost:4900
```

---

# ⚠️ Configuration Flask

Pour rendre l’API accessible depuis l’extérieur du conteneur, le serveur Flask doit être lancé avec :

```python
app.run(host='0.0.0.0', port=5000)
```

---

# 📌 Fonctionnalités

- Création d’une image Docker ;
- Exécution d’une API Flask dans un conteneur ;
- Redirection des ports ;
- Isolation de l’environnement d’exécution.

---

# 👨‍💻 Auteur

**Thilleli Messaoudene**
