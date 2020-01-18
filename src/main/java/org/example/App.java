package org.example;

import java.io.File;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void fileCreator(Firma org, List<Pracownik> lista) throws IOException {

        //zawartość pliku
        StringBuilder sb = new StringBuilder();
        sb.append("Firma: "+ org.companyName +"\n");
        sb.append("Szef: "+ org.bossName + "; " + lista.get(0).wynagrodzenie+" kocimiętki"+"\n");
        sb.append("Pracownicy: "+ org.teamMatesNumber + "\n");

        for (int i = 1; i< lista.size();i++){
            //dla psa kość
            if (lista.get(i).getWynagrodzenie()<10){
                sb.append(lista.get(i).getImieNazwisko()+" "+lista.get(i).getWynagrodzenie()+" kość"+"\n");
            } else {
                sb.append(lista.get(i).getImieNazwisko() + " " + lista.get(i).getWynagrodzenie() + " kocimiętki" + "\n");
            }
        }

        //tworzymy folder
        Path folder = Paths.get("src", "main", "java", org.companyName);
        if (!Files.exists(folder)) {
            Files.createDirectories(folder);
        }

        //tworzymy plik
        Path plik = folder.resolve(org.companyName + ".txt");
        if (!Files.exists(plik)) {
            Files.createFile(plik);
            Files.writeString(plik, sb);
        }

    } //koniec metody


    public static void main(String[] args) throws IOException {
        Pracownik klebuszek = new Pracownik("Bardzo Ważny Kot", 40000);
        Pracownik mruczek = new Pracownik("Pan Kłębuszek", 30000);
        Pracownik pazur = new Pracownik("Lord Pazur", 35000);

        Pracownik kajtek = new Pracownik("Pies Kajtek", 1);

        List<Pracownik> lista = new ArrayList<>();
        lista.add(klebuszek);
        lista.add(mruczek);
        lista.add(pazur);
        lista.add(kajtek);
        Firma catcave = new Firma("Cat Cave Corporation", "The Grand Catze", lista.size());

        fileCreator(catcave, lista);

    } //koniec maina
}//koniec klasy
