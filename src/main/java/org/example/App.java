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

    public static File fileCreator(Firma org, Pracownik mruk) throws IOException {


        Path folder = Paths.get("src", "main", "java", org.companyName);
        if (!Files.exists(folder)) {
            Files.createDirectories(folder);
        }

        Path plik = folder.resolve(org.companyName+".txt");
        if (Files.exists(plik)){
            Files.createFile(plik);
           // Files.write()
        }



//        String miesiac = String.format("%02d", mm);
//        Path folder = Paths.get("testMiesiace", yy + "-" + miesiac);
//        if (!Files.exists(folder)) {
//            Files.createDirectories(folder);
//        }
//        Path plikKalendarz = folder.resolve(yy + "-" + miesiac + ".txt");
//        if (!Files.exists(plikKalendarz)) {
//            Files.createFile(plikKalendarz);
//            Files.writeString(plikKalendarz, kalendarz(mm,yy));

    }
//    Firma <Nazwa>
////    Szef: <Imię Nazwisko>; <Wynagrodzenie>;
////    Pracownicy: <Liczba>
////<Imię Nazwisko>; <Wynagrodzenie>;
////<Imię Nazwisko>; <Wynagrodzenie>;


    public static void main(String[] args) {
        Firma catcave = new Firma("Cat Cave Corporation", "The Grand Catze", 3);
        Pracownik klebuszek = new Pracownik("Pan Kłębuszek", 40000);
        Pracownik mruczek = new Pracownik("Gemeral Mruczek", 30000);
        Pracownik kajtek = new Pracownik("Pies Kajtek", 1);

    } //koniec maina
}//koniec klasy
