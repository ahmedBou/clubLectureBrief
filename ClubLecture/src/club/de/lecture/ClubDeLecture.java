/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.de.lecture;

import club.de.lecture.Models.Bienfaiteur;
import club.de.lecture.Models.Lecteur;
import club.de.lecture.Models.Livre;
//import java.io.IOException;
//import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Amimi
 */
public class ClubDeLecture {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void show_Menu() {
        System.out.println("Menu:");
        System.out.println("  1. Livre Actions");
        System.out.println("  2. Lecteur  Actions");
        System.out.println("  3. BienFaiteur Actions");
        System.out.println("  0. Exit Program");
        System.out.println("Choose one:");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        char choice, action;
        boolean next_ = true;
//        LinkedList<Livre> livres = new LinkedList<>();
        while (next_) {
            show_Menu();
            choice = (char) sc.next().charAt(0);
            switch (choice) {
                case '1': {
                    boolean next_O = true;
                    while (next_O) {
                        Livre.show_Actions_Livre();
                        action = (char) sc.next().charAt(0);
                        switch (action) {
                            case '1':
//                                System.out.println(" ========== New Book Process ========= :)");
//                                System.out.print("Book id : ");
//                                long id = sc.nextLong();
//
//                                System.out.print("Book Title : ");
//                                String title = sc.next();
//
//                                System.out.print("Book Edition : ");
//                                String edition = sc.next();
//
//                                System.out.print("Book Date Edition : ");
//                                String date_edition = sc.next();
//
//                                LocalDate date_edition_ = LocalDate.parse(date_edition);
//                                Livre livre = new Livre(id, title, edition, date_edition_);
//                                livres.add(livre);
                                Livre.post_Book();
                                break;

                            case '2':
//                                System.out.println(" ======== PUT ========= ");
//                                System.out.print(" Chose Specific Object Id To make some changes: ");
//                                int id___ = sc.nextInt();
//                                Iterator<Livre> iterator_Put = livres.iterator();
//                                while (iterator_Put.hasNext()) {
//                                    Livre l = iterator_Put.next();
//                                    if (l.getId() == id___) {
//                                        int position = livres.indexOf(l);
//                                        System.out.print("Book id : ");
//                                        long _id = sc.nextLong();
//
//                                        System.out.print("Book Title : ");
//                                        String title_ = sc.next();
//
//                                        System.out.print("Book Edition : ");
//                                        String edition_ = sc.next();
//
//                                        System.out.print("Book Date Edition : ");
//                                        String date__edition_ = sc.next();
//
//                                        LocalDate date_edition__ = LocalDate.parse(date__edition_);
//
//                                        l.setId(_id);
//                                        l.setTitre(title_);
//                                        l.setEdition(edition_);
//                                        l.setDate_edition(date_edition__);
//
//                                        livres.set(position, l);
//                                    }
//                                }
                                Livre.put_Livre();
                                break;
                            case '3':
                                System.out.println(" ========  GET Lists ======= ");
//                                Iterator<Livre> iterator = livres.iterator();
//                                while (iterator.hasNext()) {
//                                    System.out.println(iterator.next());
//                                }
                                Livre.lists_Livres();
                                break;
                            case '4':
//                                System.out.println(" ======= DELETE ======");
//                                System.out.print(" ID : ");
//                                int id__ = sc.nextInt();
//                                Iterator<Livre> iterator_Delete = livres.iterator();
//                                while (iterator_Delete.hasNext()) {
//                                    Livre l = iterator_Delete.next();
//                                    if (l.getId() == id__) {
//                                        livres.remove(l);
//                                    }
//                                }
//                                System.out.println(" ======= End Of DELETE Operation ======");
                                Livre.delete_Livre();
                                break;

                            case '5':
//                                System.out.println(" ====== SEARCH =====");
//                                System.out.print(" ID : ");
//                                int id_ = sc.nextInt();
//                                Iterator<Livre> iterator_Search = livres.iterator();
//                                while (iterator_Search.hasNext()) {
//                                    Livre l = iterator_Search.next();
//                                    if (l.getId() == id_) {
//                                        System.out.println(l.toString());
//                                    }
//                                }
//                                System.out.println(" ===== End Of SEARCH =====");
                                Livre.search_Livre();
                                break;
                            case '0':
                                next_O = false;
                                break;

                            case '6':
//                                System.out.println(" ===== Count Objects ===== ");
//                                System.out.println("The Total Of Objects Is :" + livres.size());
//                                System.out.println(" ===== End Of Count Objects ===== ");
                                Livre.count_Livres();
                                break;

                            default:
                                System.out.println("Please Pick A Number From The Menu ");
                        }

                    }
                }
                break;

                case '2': {
                    boolean next_O = true;
                    while (next_O) {
                        Lecteur.show_Actions_Lecteur();
                        action = (char) sc.next().charAt(0);
                        switch (action) {
                            case '1':
                                Lecteur.post_Lecteur();
                                break;
                            case '2':
                                Lecteur.put_Lecteur();
                                break;
                            case '3':
                                Lecteur.get_Lecteur_Lists();
                                break;
                            case '4':
                                Lecteur.delete_Lecteur();
                                break;
                            case '5':
                                Lecteur.search_Lecteur();
                                break;
                            case '0':
                                next_O = false;
                                break;
                            case '6':
                                Lecteur.count_Lecteur_Fidels();
                                break;
                            case '7':
                                Lecteur.count_Lecteur();
                                break;
                            default:
                                System.out.println("Please Pick A Number From The Menu ");
                        }

                    }
                }
                break;

                case '3': {
                    boolean next_O = true;
                    while (next_O) {
                        Bienfaiteur.show_Actions_Bienfaiteur();
                        action = (char) sc.next().charAt(0);
                        switch (action) {
                            case '1':
                                Bienfaiteur.post_Bienfaiteur();
                                break;
                            case '2':
                                Bienfaiteur.put_Bienfaiteur();
                                break;
                            case '3':
                                Bienfaiteur.get_Bienfaiteur_Lists();
                                break;
                            case '4':
                                Bienfaiteur.delete_Bienfaiteur();
                                break;
                            case '5':
                                Bienfaiteur.search_Bienfaiteur();
                                break;
                            case '0':
                                next_O = false;
                                break;
                            case '6':
                                Bienfaiteur.count_Bienfaiteur_Fidels();
                                break;

                            case '7':
                                Bienfaiteur.count_Bienfaiteur();
                                break;
                            default:
                                System.out.println("Please Pick A Number From The Menu ");
                        }

                    }
                }
                break;
                case '0':
                    next_ = false;
                    System.out.println("Thanks For Your Trust See You Later :)");
                    break;

                default:
                    System.out.println("Please Pick A Number From The Menu ");
            }

        }

    }

}

