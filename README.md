Ce projet est réalisé dans le cadre de l'integration de l'entreprise ModelSIS, suite à un entretien avec le DSI

1- Cloner le projet à partir de ce lien: https://github.com/blufa/o-modelsis-backend-Jean-Claude-CAMARA.git

2- Ensuit installer docker sur votre machine local

3- Exécuter cette commande pour avoir l'image postgres en local
  docker pull postgres

4- Demarer l'instance postgres à partir de docker
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres

5- Telecharger le DBeaver Community pour manager ta base de donné à partir de son interface:
https://dbeaver.io/download/
  - database: postgres
  - user: postgres
  - mdp: mysecretpassword

6- Une fois le la connexion est ok avec la base de donné, demarré le project
  le projet en lançant la commande mvn spring-boot:run

7- Une fois le projet demaré vous pourvez tester les api comme suit:
