#Author: Proservice
Feature: homepage xiaomi

Scenario: selectionner un menu de la page dacceuil

Given utilisateur est sur la page dacceuil
when utilisateur survole la souris sur le menu"" et clique sur submenu""

Then utilisateur est dirige vers la page""
