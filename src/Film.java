/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
* @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class daftar film
 */
public class Film {
    public String[] filmName = {"Venom", "Small Foot", "Crazy Rich Asian", "Asih"};
    public String[] filmGenre = {"Action, Horor , Scifi", "Animation", "Comedy", "Horror"};
    public double[] filmRating = {8.5, 9.0, 7.8, 6.0};
    public int[] filmDuration = {120, 96, 119, 100};

    public void nowPlaying() {
        for(int i = 0; i < filmName.length; i++) {
            System.out.println("Judul Film : " + filmName[i]);
            System.out.println("Gendre Film : " + filmGenre[i]);
            System.out.println("Rating Film : " + filmRating[i]);
            System.out.println("Duration Film : " + filmDuration[i] + " Menit");
            System.out.println();
        }
    }
}
