/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.de.lecture.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Amimi
 */
public final class Bienfaiteur {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Bienfaiteur> bienfaiteurs = new LinkedList<>();

    public static void count_Bienfaiteur_Fidels() {
        Iterator<Bienfaiteur> iterator_Fidels = bienfaiteurs.iterator();
        while (iterator_Fidels.hasNext()) {
            List<Bienfaiteur> lists;
            lists = new ArrayList<>();
            Bienfaiteur bienfaiteur = iterator_Fidels.next();
            if (bienfaiteur.isFidele()) {
                lists.add(bienfaiteur);
                System.out.println(lists);
            }
        }
    }

    private long id;
    private String fullname;
    private String email;
    private int books_count;
    private boolean fidele;

    public Bienfaiteur() {
    }

    public Bienfaiteur(long id, String fullname, String email, int books_count, boolean fidele) {
        this.fidele = false;
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.books_count = books_count;
        if (this.books_count > 3) {
            this.setFidele(this.fidele = true);
        }

    }

    public int getBooks_count() {
        return books_count;
    }

    public void setBooks_count(int books_count) {
        this.books_count = books_count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFidele() {
        return fidele;
    }

    public void setFidele(boolean fidele) {
        this.fidele = fidele;
    }

    public static void show_Actions_Bienfaiteur() {
        System.out.println("  1. POST Bienfaiteur");
        System.out.println("  2. PUT Bienfaiteur");
        System.out.println("  3. GET Bienfaiteurs Lists");
        System.out.println("  4. DELETE Bienfaiteur");
        System.out.println("  5. SEARCH Bienfaiteur");
        System.out.println("  6. GET Bienfaiteur Fidels");
        System.out.println("  7. Count Bienfaiteur ");
        System.out.println("  0. Go Back To The Main Menu");
    }

    public static void count_Bienfaiteur() {
        System.out.println(bienfaiteurs.size());
    }

    public static void search_Bienfaiteur() {
        try {
            System.out.print(" Chose Specific Object Id To make some changes: ");
            int id___ = sc.nextInt();
            Iterator<Bienfaiteur> iterator_Search = bienfaiteurs.iterator();
            while (iterator_Search.hasNext()) {
                Bienfaiteur b = iterator_Search.next();
                if (b.getId() == id___) {
                    System.out.println(b.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to Search Bienfaiteur Object" + Arrays.toString(e.getStackTrace()));
        }
    }

    public static void delete_Bienfaiteur() {
        try {
            System.out.print(" Chose Specific Object Id To make some changes: ");
            int id___ = sc.nextInt();
            Iterator<Bienfaiteur> iterator_Delete = bienfaiteurs.iterator();
            while (iterator_Delete.hasNext()) {
                Bienfaiteur b = iterator_Delete.next();
                if (b.getId() == id___) {
                    bienfaiteurs.remove(b);
                }
            }
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to Delete BienFaiteur Object" + Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println("The Bienfaiteur Has Deleted Successfully");
        }
    }

    public static void get_Bienfaiteur_Lists() {
        Iterator<Bienfaiteur> iterator = bienfaiteurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void put_Bienfaiteur() {
        try {
            System.out.print(" Chose Specific Object Id To make some changes: ");
            int id___ = sc.nextInt();

            Iterator<Bienfaiteur> iterator_Put = bienfaiteurs.iterator();
            while (iterator_Put.hasNext()) {
                Bienfaiteur b = iterator_Put.next();
                if (b.getId() == id___) {
                    int position = bienfaiteurs.indexOf(b);

                    System.out.print("Bienfaiteur id : ");
                    long id_ = sc.nextLong();

                    System.out.print("Bienfaiteur Fullname : ");
                    String fullname_ = sc.next();

                    System.out.print("Bienfaiteur E_mail : ");
                    String email_ = sc.next();

                    System.out.print("Bienfaiteur books Count : ");
                    int books_counts_ = sc.nextInt();

                    b.setId(id_);
                    b.setFullname(fullname_);
                    b.setEmail(email_);
                    b.setBooks_count(books_counts_);
                    if (books_counts_ > 3) {
                        b.setFidele(true);
                    }
                    bienfaiteurs.set(position, b);
                }
            }
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to Update Lecteur Object" + Arrays.toString(e.getStackTrace()));
        }
    }

    public static void post_Bienfaiteur() {
        try {
            System.out.println(" ========== New Bienfaiteur Process ========= :)");

            System.out.print("Bienfaiteur id : ");
            long id = sc.nextLong();

            System.out.print("Bienfaiteur Fullname : ");
            String fullname = sc.next();

            System.out.print("Bienfaiteur E_mail : ");
            String email = sc.next();

            System.out.print("Bienfaiteur books Count : ");
            int books_counts = sc.nextInt();

            Bienfaiteur bienfaiteur = new Bienfaiteur(id, fullname, email, books_counts, false);
            bienfaiteurs.add(bienfaiteur);
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to ADD BienFaiteur Object" + Arrays.toString(e.getStackTrace()));

        } finally {
            System.out.println("The 'Operation' is finished. The BienFaiteur Added Successfully");
        }

    }

    @Override
    public String toString() {
        return "Bienfaiteur{" + "id=" + id + ", fullname=" + fullname + ", email=" + email + ", fidele=" + fidele + '}';
    }

}

