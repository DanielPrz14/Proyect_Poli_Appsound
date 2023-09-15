
package com.mycompany.logica;

import com.mycompany.dto.Cancion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Precarga {
    
public static ArrayList<Cancion> lista = new ArrayList<>();

public static ArrayList <Cancion> initBodegaCanciones(){

 //ALCOLIRYCOZ
    ArrayList <String> alcolirycoz  = new ArrayList<> (Arrays.asList("Alcolirycoz"));
    ArrayList <String> alcolirycoz_nrs  = new ArrayList<> (Arrays.asList("Alcolirycoz","NRS")); 
    ArrayList <String> alcolirycoz_LXasuma_Hdem  = new ArrayList<> (Arrays.asList("Alcolirycoz","L.Xuasma","N.Hardem")); 
 Cancion Discos_fuentes = new Cancion("Discos fuentes", 282, "rap", alcolirycoz_LXasuma_Hdem ,"https://www.youtube.com/watch?v=5QIZSNAyZMo");
 Cancion Quien_va = new Cancion("Quien va", 266, "rap", alcolirycoz_nrs ,"https://www.youtube.com/watch?v=mF_8BMwhH5A");
 Cancion Taxidermia = new Cancion("Taxidermia", 267, "rap", alcolirycoz_nrs ,"https://www.youtube.com/watch?v=1bjN0ZYIl8Q"); 
 Cancion Relujo = new Cancion("Reflujo", 208, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=TMYaLWT_zpw");
 Cancion Normal = new Cancion("Normal", 201, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=8I9p51miDQE");
 Cancion A_Mijazz = new Cancion("A Mijazz-Remix", 202, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=hSQ2sWu2qA0");
 Cancion Nada = new Cancion("N.A.D.A", 246, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=_1efjBFs0vE");
 Cancion Chango = new Cancion("Chango", 293, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=C2_WOBYxweE");
 Cancion Baldor = new Cancion("Baldor", 222, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=bw3DzkgXU1k");
 Cancion Aguanile = new Cancion("Aguianile", 206, "rap", alcolirycoz ,"https://www.youtube.com/watch?v=983zfhMym8Q");
 //HARDEM
    ArrayList <String> hardem  = new ArrayList<> (Arrays.asList("Hardem"));
 Cancion Quest = new Cancion("Quest", 322, "rap", hardem, "https://www.youtube.com/watch?v=SPoOpHie5iA");
 //KASE.O
    ArrayList <String> kaseO  = new ArrayList<> (Arrays.asList("Kase.O"));
    ArrayList <String> kaseO_Rozalen  = new ArrayList<> (Arrays.asList("Kase.O", "Rozalen"));
 Cancion viejosCiegos = new Cancion("Viejos Ciegos", 290, "rap", kaseO, "https://www.youtube.com/watch?v=SUbpqZgAQ2k");
 Cancion Amor_sin_Clausulas = new Cancion("Amor sin clausulas", 271, "rap", kaseO, "https://www.youtube.com/watch?v=HuALdv_2vXU");
 Cancion Yemen = new Cancion("Yemen", 282, "rap", kaseO, "https://acortar.link/n53E1q");
 Cancion mazasYCatapultas = new Cancion("Mazas y catapultas", 237, "rap", kaseO_Rozalen, "https://www.youtube.com/watch?v=lUo_qRUIfvo");
 //DILLOM  
    ArrayList <String> dillom  = new ArrayList<> (Arrays.asList("Dillom"));
    ArrayList <String> dillom_Saramalacara  = new ArrayList<> (Arrays.asList("Dillom", "Saramalacara"));
Cancion la_Primera = new Cancion("La Primera", 189, "rap", dillom, "https://www.youtube.com/watch?v=rd5YDHcTcEk");
Cancion bicicletaDillom = new Cancion("Bicicleta", 207, "rap", dillom, "https://www.youtube.com/watch?v=wW9rignRL_s");
Cancion rocketPowers = new Cancion("Rocket powers", 188, "rap", dillom_Saramalacara, "https://www.youtube.com/watch?v=bBLGxcAUleQ");
 //KANYE WEST [FLASHIN LIGHTS - GHOST TOWN - ]
    ArrayList <String> Kanye  = new ArrayList<> (Arrays.asList("Kanye West"));
    ArrayList <String> Kanye_Kendrick  = new ArrayList<> (Arrays.asList("Kanye West" , "Kendrick Lamar"));
Cancion flashingLights = new Cancion("Flashing Lights", 237, "rap", Kanye, "https://www.youtube.com/watch?v=ZAz3rnLGthg");
Cancion ghostTown = new Cancion("Ghost Town", 271, "rap", Kanye, "https://www.youtube.com/watch?v=qAsHVwl-MU4");
Cancion runaway = new Cancion("Runaway", 547, "rap", Kanye, "https://www.youtube.com/watch?v=EMnQwBTJnMM");
Cancion throughTheWire = new Cancion("Through the Wire", 221, "rap", Kanye, "https://www.youtube.com/watch?v=AE8y25CcE6s");
Cancion noMorePartiesInLA = new Cancion("No More Parties in LA", 374, "rap", Kanye_Kendrick, "https://www.youtube.com/watch?v=NnMuFqsmYSE");
Cancion allDay = new Cancion("All Day", 310, "rap", Kanye, "https://www.youtube.com/watch?v=mc-ccZXsIm4");
 //KENDRICK LAMAR[FEAR- ALRIGHT - WESLIE THEORY - DIE HARD - DUCKWORD - MONEYTREES]
    ArrayList <String> kendrick  = new ArrayList<> (Arrays.asList("Kendrick lamar"));
    ArrayList <String> kendrick_Jayrock  = new ArrayList<> (Arrays.asList("Kendrick Lamar" , "Jay Rock"));
    ArrayList <String> kendrick_U2  = new ArrayList<> (Arrays.asList("Kendrick Lamar" , "U2"));
    ArrayList <String> kendrick_Rihanna  = new ArrayList<> (Arrays.asList("Kendrick Lamar" , "Rihanna"));
    ArrayList <String> kendrick_Zacari  = new ArrayList<> (Arrays.asList("Kendrick Lamar" , "Zacari"));
Cancion moneyTrees = new Cancion("Money Trees", 386, "rap", kendrick_Jayrock, "https://www.youtube.com/watch?v=Iy-dJwHVX84");
Cancion alright = new Cancion("Alright", 194, "rap", kendrick, "https://www.youtube.com/watch?v=JocAXINz-YE");
Cancion wesleysTheory = new Cancion("Wesley's Theory", 287, "rap", kendrick, "https://www.youtube.com/watch?v=l9fN-8NjrvI");
Cancion forFreeInterlude = new Cancion("For Free? (Interlude)", 130, "rap", kendrick, "https://www.youtube.com/watch?v=qh4nXtTpTEE");
Cancion kingKunta = new Cancion("King Kunta", 234, "rap", kendrick, "https://www.youtube.com/watch?v=g0NVaX8DRN4");
Cancion institutionalized = new Cancion("Institutionalized", 271, "rap", kendrick, "https://www.youtube.com/watch?v=7L1POXocFIQ");
Cancion theseWalls = new Cancion("These Walls", 300, "rap", kendrick, "https://www.youtube.com/watch?v=AHNK4k3Cr24");
Cancion u = new Cancion("U", 269, "rap", kendrick, "https://www.youtube.com/watch?v=XGC4QpDIpJc");
Cancion forSaleInterlude = new Cancion("For Sale? (Interlude)", 292, "rap", kendrick, "https://www.youtube.com/watch?v=RdCepOB4BV8");
Cancion momma = new Cancion("Momma", 288, "rap", kendrick, "https://www.youtube.com/watch?v=q1AOP6NtGuc");
Cancion theBlackerTheBerry = new Cancion("The Blacker the Berry", 329, "rap", kendrick, "https://www.youtube.com/watch?v=VdPtVZDspIY");
Cancion blood = new Cancion("BLOOD.", 118, "rap", kendrick , "https://www.youtube.com/watch?v=8sXpvQaAVVE");
Cancion dna = new Cancion("DNA.", 182, "rap", kendrick, "https://www.youtube.com/watch?v=YdAKwllnnpI");
Cancion yah = new Cancion("YAH.", 162, "rap", kendrick, "https://www.youtube.com/watch?v=F1p-0tXqEVM");
Cancion element = new Cancion("ELEMENT.", 208, "rap", kendrick, "https://www.youtube.com/watch?v=yHNSQg9b2x4");
Cancion feel = new Cancion("FEEL.", 215, "rap", kendrick, "https://www.youtube.com/watch?v=0vSH3CPJcNI");
Cancion loyalty = new Cancion("LOYALTY. (feat. Rihanna)", 231, "rap", kendrick_Rihanna, "https://www.youtube.com/watch?v=I9Mh4yIYk2U");
Cancion pride = new Cancion("PRIDE.", 276, "rap", kendrick, "https://www.youtube.com/watch?v=T9V5ab9RMjg");
Cancion humble = new Cancion("HUMBLE.", 178, "rap", kendrick , "https://www.youtube.com/watch?v=fcG21W4-h3o");
Cancion lust = new Cancion("LUST.", 309, "rap", kendrick, "https://www.youtube.com/watch?v=_9FJklyewm4");
Cancion love = new Cancion("LOVE. (feat. Zacari)", 208, "rap", kendrick_Zacari, "https://www.youtube.com/watch?v=UNjxrOyW4hE");
Cancion xxx = new Cancion("XXX. (feat. U2)", 254, "rap", kendrick_U2, "https://www.youtube.com/watch?v=p-ARQ8g8ymw");
Cancion fear = new Cancion("FEAR.", 460, "rap", kendrick, "https://www.youtube.com/watch?v=4MxohEQ66Lw");
Cancion god = new Cancion("GOD.", 249, "rap", kendrick, "https://www.youtube.com/watch?v=a47dH0q3S3o");
Cancion duckworth = new Cancion("DUCKWORTH.", 249, "rap", kendrick, "https://www.youtube.com/watch?v=eIu3b6Q04Gc");

        // Se agregan las canciones creadas a la lista
        lista.addAll(Arrays.asList(
            Discos_fuentes, Quien_va, Taxidermia, Relujo, Normal, A_Mijazz, Nada, Chango,
            Baldor, Aguanile, Quest, viejosCiegos, Amor_sin_Clausulas, Yemen, mazasYCatapultas,
            la_Primera, bicicletaDillom, rocketPowers, flashingLights, ghostTown, runaway,
            throughTheWire, noMorePartiesInLA, allDay
        ));

        // Se devuelve la lista de canciones predefinidas
        return lista;
    }

    // ... (se omite la definición de otros métodos, ya que están incompletos)
}
