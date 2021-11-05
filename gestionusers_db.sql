-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 05 nov. 2021 à 10:55
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionusers_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
  `id_admin` bigint(20) NOT NULL,
  `email_admin` varchar(255) DEFAULT NULL,
  `nom_admin` varchar(255) DEFAULT NULL,
  `password_admin` varchar(255) DEFAULT NULL,
  `prenom_admin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`id_admin`, `email_admin`, `nom_admin`, `password_admin`, `prenom_admin`) VALUES
(1, 'toure@gmail', 'Touré', 'toure123', 'Amadou'),
(3, 'diallo@gmail', 'Diallo', 'diallo123', 'Malick');

-- --------------------------------------------------------

--
-- Structure de la table `apprenant`
--

CREATE TABLE `apprenant` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `apprenant`
--

INSERT INTO `apprenant` (`id`, `email`, `nom`, `password`, `prenom`) VALUES
(1, 'moundresamake@gmail.com', 'Samaké', 'modibo123', 'Modibo'),
(3, 'abdoul@gmail.com', 'Maiga', 'abdoul123', 'Abdoul'),
(4, 'gakou@gmail.com', 'Gakou', 'gakou123', 'Aboubacar'),
(5, 'gan@gmail.com', 'Dicko', 'aly123', 'Aly'),
(7, 'sidiki@gmail.com', 'Keita', 'sidi123', 'Sidiki');

-- --------------------------------------------------------

--
-- Structure de la table `formateur`
--

CREATE TABLE `formateur` (
  `id_formateur` bigint(20) NOT NULL,
  `email_formateur` varchar(255) DEFAULT NULL,
  `nom_formateur` varchar(255) DEFAULT NULL,
  `password_formateur` varchar(255) DEFAULT NULL,
  `prenom_formateur` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `formateur`
--

INSERT INTO `formateur` (`id_formateur`, `email_formateur`, `nom_formateur`, `password_formateur`, `prenom_formateur`) VALUES
(1, 'fatoumata@gmail.com', 'Kaloga', 'fatoumata123', 'Fatoumata'),
(4, 'fousseny@gmail.com', 'Dembélé', 'fousseny123', 'Fousseny'),
(5, 'mamadou@gmail.com', 'Diaby', 'mamadou123', 'Mamadou');

-- --------------------------------------------------------

--
-- Structure de la table `presence`
--

CREATE TABLE `presence` (
  `id_presence` bigint(20) NOT NULL,
  `date_aujourd` date DEFAULT NULL,
  `heure_arriver` time DEFAULT NULL,
  `heure_depart` time DEFAULT NULL,
  `apprenant_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `presence`
--

INSERT INTO `presence` (`id_presence`, `date_aujourd`, `heure_arriver`, `heure_depart`, `apprenant_id`) VALUES
(5, '2021-11-01', '09:34:10', '20:34:38', 3),
(6, '2021-11-03', '09:45:10', '19:30:20', 1),
(7, '2021-10-06', '09:25:00', '20:05:00', 4),
(8, '2021-11-05', '09:00:00', '21:05:00', 5);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Index pour la table `apprenant`
--
ALTER TABLE `apprenant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `formateur`
--
ALTER TABLE `formateur`
  ADD PRIMARY KEY (`id_formateur`);

--
-- Index pour la table `presence`
--
ALTER TABLE `presence`
  ADD PRIMARY KEY (`id_presence`),
  ADD KEY `FKpqxe7xu8i0wwvj8c1myfwoevi` (`apprenant_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `apprenant`
--
ALTER TABLE `apprenant`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `formateur`
--
ALTER TABLE `formateur`
  MODIFY `id_formateur` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `presence`
--
ALTER TABLE `presence`
  MODIFY `id_presence` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `presence`
--
ALTER TABLE `presence`
  ADD CONSTRAINT `FKpqxe7xu8i0wwvj8c1myfwoevi` FOREIGN KEY (`apprenant_id`) REFERENCES `apprenant` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
