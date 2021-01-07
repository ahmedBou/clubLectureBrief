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
public final class Lecteur {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Lecteur> lecteurs = new LinkedList<>();

    public static void count_Lecteur_Fidels() {
        Iterator<Lecteur> iterator_Fidels = lecteurs.iterator();
        while (iterator_Fidels.hasNext()) {
            List<Lecteur> lists;
            lists = new ArrayList<>();
            Lecteur lecteur = iterator_Fidels.next();
            if (lecteur.isFidele()) {
                lists.add(lecteur);
                System.out.println(lists);
            }
        }
    }

    private long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private int books_count;
    private boolean fidele;

    public Lecteur() {
    }

    public Lecteur(long id, String firstname, String lastname, String phone, String email, int books_count, boolean fidele) {
        this.fidele = false;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.books_count = books_count;
        if (this.books_count > 4) {
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public static void show_Actions_Lecteur() {
        System.out.println("  1. POST Lecteur");
        System.out.println("  2. PUT Lecteur");
        System.out.println("  3. GET Lecteurs Lists");
        System.out.println("  4. DELETE Lecteur");
        System.out.println("  5. SEARCH Lecteur");
        System.out.println("  6. GET Lecteur Fidels");
        System.out.println("  7. Count Lecteur ");
        System.out.println("  0. Go Back To The Main Menu");
    }

    public static void post_Lecteur() {
        try {
            System.out.println(" ========== New Lecteur Process ========= :)");

            System.out.print("Lecteur id : ");
            long id = sc.nextLong();

            System.out.print("Lecteur Firstname : ");
            String firstname = sc.next();

            System.out.print("Lecteur Lastname : ");
            String lastname = sc.next();

            System.out.print("Lecteur Phone : ");
            String phone = sc.next();

            System.out.print("Lecteur E_mail : ");
            String email = sc.next();

            System.out.print("Lecteur books Count : ");
            int lecteur_counts = sc.nextInt();

            Lecteur lecteur = new Lecteur(id, firstname, lastname, phone, email, lecteur_counts, false);
            lecteurs.add(lecteur);
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to add new Lecteur Object" + Arrays.toString(e.getStackTrace()));
        }

    }

    public static void put_Lecteur() {
        try {
            System.out.print(" Chose Specific Object Id To make some changes: ");
            int id___ = sc.nextInt();

            Iterator<Lecteur> iterator_Put = lecteurs.iterator();
            while (iterator_Put.hasNext()) {
                Lecteur l = iterator_Put.next();
                if (l.getId() == id___) {
                    int position = lecteurs.indexOf(l);
                    System.out.print("Lecteur id : ");
                    long id_ = sc.nextLong();

                    System.out.print("Lecteur Firstname : ");
                    String firstname_ = sc.next();

                    System.out.print("Lecteur Lastname : ");
                    String lastname_ = sc.next();

                    System.out.print("Lecteur Phone : ");
                    String phone_ = sc.next();

                    System.out.print("Lecteur E_mail : ");
                    String email_ = sc.next();

                    System.out.print("Lecteur books Count : ");
                    int lecteur_counts_ = sc.nextInt();

                    l.setId(id_);
                    l.setFirstname(firstname_);
                    l.setLastname(lastname_);
                    l.setPhone(phone_);
                    l.setEmail(email_);
                    l.setBooks_count(lecteur_counts_);
                    if (lecteur_counts_ > 4) {
                        l.setFidele(true);
                    }
                    lecteurs.set(position, l);
                }
            }
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to Update Lecteur Object" + Arrays.toString(e.getStackTrace()));
        }

    }

    public static void get_Lecteur_Lists() {
        Iterator<Lecteur> iterator = lecteurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void delete_Lecteur() {
        try {
            System.out.print(" Chose Specific Object Id To make some changes: ");
            int id___ = sc.nextInt();
            Iterator<Lecteur> iterator_Delete = lecteurs.iterator();
            while (iterator_Delete.hasNext()) {
                Lecteur l = iterator_Delete.next();
                if (l.getId() == id___) {
                    lecteurs.remove(l);
                }
            }
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to Delete Lecteur Object" + Arrays.toString(e.getStackTrace()));
        }
    }

    public static void search_Lecteur() {
        try {
            System.out.print(" Chose Specific Object Id To make some changes: ");
            int id___ = sc.nextInt();
            Iterator<Lecteur> iterator_Search = lecteurs.iterator();
            while (iterator_Search.hasNext()) {
                Lecteur l = iterator_Search.next();
                if (l.getId() == id___) {
                    System.out.println(l.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Oop's Something wrong when we trying to Delete Lecteur Object" + Arrays.toString(e.getStackTrace()));
        }
    }

    public static void count_Lecteur() {
        System.out.println("The Total Of Objects Is :" + lecteurs.size());
    }

    @Override
    public String toString() {
        return "Lecteur{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + ", books_count=" + books_count + ", fidele=" + fidele + '}';
    }

}


