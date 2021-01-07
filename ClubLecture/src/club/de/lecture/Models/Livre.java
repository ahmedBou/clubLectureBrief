/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.de.lecture.Models;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Amimi
 */
public class Livre {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Livre> livres = new LinkedList<>();

    private long id;
    private String titre;
    private String edition;
    private LocalDate date_edition;

    public Livre() {
    }

    public Livre(long id, String titre, String edition, LocalDate date_edition) {
        this.id = id;
        this.titre = titre;
        this.edition = edition;
        this.date_edition = date_edition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public LocalDate getDate_edition() {
        return date_edition;
    }

    public void setDate_edition(LocalDate date_edition) {
        this.date_edition = date_edition;
    }

    public static void show_Actions_Livre() {
        System.out.println("  1. POST Livre");
        System.out.println("  2. PUT Livre");
        System.out.println("  3. GET Livres Lists");
        System.out.println("  4. DELETE Livre");
        System.out.println("  5. SEARCH Livre");
        System.out.println("  6. Count Livres");
        System.out.println("  0. Go Back To The Main Menu");

    }

    public static void post_Book() {
        System.out.println(" ========== New Book Process ========= :)");
        System.out.print("Book id : ");
        long id = sc.nextLong();

        System.out.print("Book Title : ");
        String title = sc.next();

        System.out.print("Book Edition : ");
        String edition = sc.next();

        System.out.print("Book Date Edition : ");
        String date_edition = sc.next();

        LocalDate date_edition_ = LocalDate.parse(date_edition);
        Livre livre = new Livre(id, title, edition, date_edition_);
        livres.add(livre);
    }

    public static void lists_Livres() {
        Iterator<Livre> iterator = livres.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void put_Livre() {
        System.out.println(" ======== PUT ========= ");
        System.out.print(" Chose Specific Object Id To make some changes: ");
        int id___ = sc.nextInt();
        Iterator<Livre> iterator_Put = livres.iterator();
        while (iterator_Put.hasNext()) {
            Livre l = iterator_Put.next();
            if (l.getId() == id___) {
                int position = livres.indexOf(l);
                System.out.print("Book id : ");
                long _id = sc.nextLong();

                System.out.print("Book Title : ");
                String title_ = sc.next();

                System.out.print("Book Edition : ");
                String edition_ = sc.next();

                System.out.print("Book Date Edition : ");
                String date__edition_ = sc.next();

                LocalDate date_edition__ = LocalDate.parse(date__edition_);

                l.setId(_id);
                l.setTitre(title_);
                l.setEdition(edition_);
                l.setDate_edition(date_edition__);

                livres.set(position, l);
            }
        }
    }

    public static void delete_Livre() {
        System.out.println(" ======= DELETE ======");
        System.out.print(" ID : ");
        int id__ = sc.nextInt();
        Iterator<Livre> iterator_Delete = livres.iterator();
        while (iterator_Delete.hasNext()) {
            Livre l = iterator_Delete.next();
            if (l.getId() == id__) {
                livres.remove(l);
            }
        }
        System.out.println(" ======= End Of DELETE Operation ======");
    }

    public static void search_Livre() {
        System.out.println(" ====== SEARCH =====");
        System.out.print(" ID : ");
        int id_ = sc.nextInt();
        Iterator<Livre> iterator_Search = livres.iterator();
        while (iterator_Search.hasNext()) {
            Livre l = iterator_Search.next();
            if (l.getId() == id_) {
                System.out.println(l.toString());
            }
        }
        System.out.println(" ===== End Of SEARCH =====");
    }

    public static void count_Livres() {
        System.out.println(" ===== Count Objects ===== ");
        System.out.println("The Total Of Objects Is :" + livres.size());
        System.out.println(" ===== End Of Count Objects ===== ");
    }

    @Override
    public String toString() {
        return "Livre{" + "id=" + id + ", titre=" + titre + ", edition=" + edition + ", date_edition=" + date_edition + '}';
    }

}


