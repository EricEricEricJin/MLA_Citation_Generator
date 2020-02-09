/*
* MLA CITATION GENERATOR 
* By: ericericericjin
* Created: Feb.9.2020
*/
import java.util.HashMap;
import javax.swing.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Container.*;

public class citation {
    static JFrame frame;

    static JPanel type_selection;
    static JPanel info_input;
    static JPanel output_format;
    static JPanel info_output;

    // static HashMap<String, String> output_info_list;
    static String citetype;

    public static int window_x = 600;
    public static int window_y = 400;
    
    public static void main(String[] args) {
        frame = new JFrame ("Citation Tool");
        frame.setSize(window_x, window_y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        type_selection = new JPanel();
        type_selection.setBounds(0, 0, window_x, 20);
        // type_selection.setBorder(BorderFactory.createTitledBorder("Citation type"));

        info_input = new JPanel();
        info_input.setBounds(0, 20, window_x, window_y / 2 - 20);
        info_input.setBorder(BorderFactory.createTitledBorder("Information"));

        output_format = new JPanel();
        output_format.setBounds(0, window_y / 2, window_x, 20);
        // output_format.setBorder(BorderFactory.createTitledBorder("Tex or not"));

        info_output = new JPanel();
        info_output.setBounds(0, window_y / 2 + 20, window_x, window_y / 2 - 20);
        info_output.setBorder(BorderFactory.createTitledBorder("Output"));

        frame.add(type_selection);
        frame.add(info_input);
        frame.add(output_format);
        frame.add(info_output);
        
        set_info_output(info_output);
        set_type_selection(type_selection);
        set_output_format(output_format);
        frame.setVisible(true);
    }

    public static void set_info_output(JPanel panel) {
        panel.setLayout(null);
        //JLabel output = new JLabel();
        JTextField output = new JTextField();
        output.setBounds(0, 0, window_x, window_y / 2 - 20);
        panel.add(output);
    }

    public static void set_type_selection(JPanel panel) {
        panel.setLayout(null);
        JButton book = new JButton("Book");
        // JButton magazine = new JButton("Magazine");
        JButton newspaper = new JButton("Newspaper");
        JButton website = new JButton("Website");
        JButton journal = new JButton("Journal");
        book.setBounds(0, 0, (window_x / 4), 20);
        // magazine.setBounds((window_x / 4) * 1, 0, (window_x / 4), 20);
        newspaper.setBounds((window_x / 4) * 1, 0, (window_x / 4), 20);
        website.setBounds((window_x / 4) * 2, 0, (window_x / 4), 20);
        journal.setBounds((window_x / 4) * 3, 0, (window_x / 4), 20);

        panel.add(book);
        // panel.add(magazine);
        panel.add(newspaper);
        panel.add(website);
        panel.add(journal);

        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initBook();
            }
        });

        /*
            magazine.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initMagazine();
                }
            });
        */

        newspaper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initNewspaper();
            }
        });

        website.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initWebsite();
            }
        });

        journal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initJournal();
            }
        });
    }

    public static void set_output_format(JPanel panel) {
        panel.setLayout(null);
        JButton latex = new JButton("Latex");
        JButton non_latex = new JButton("Non Latex");
        latex.setBounds(0, 0, window_x / 2, 20);
        non_latex.setBounds(window_x / 2, 0, window_x / 2, 20);
        panel.add(latex);
        panel.add(non_latex);
        
        non_latex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outNon_latex();
            }
        });

        latex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outLatex();
            }
        });
    }

    public static void initBook() {
        citetype = "b";
        info_input.removeAll();

        JLabel author_name_lab = new JLabel("Author name: ");
        author_name_lab.setBounds(0, 10, 100, 20);
        JTextField author_name = new JTextField();
        author_name.setBounds(100, 10, window_x - 100, 20);
        
        JLabel book_name_lab = new JLabel("Book name: ");
        book_name_lab.setBounds(0, 30, 100, 20);
        JTextField book_name = new JTextField();
        book_name.setBounds(100, 30, window_x - 100, 20);

        JLabel pub_loc_lab = new JLabel("Publish area: ");
        pub_loc_lab.setBounds(0, 50, 100, 20);
        JTextField pub_loc = new JTextField();
        pub_loc.setBounds(100, 50, window_x - 100, 20);

        JLabel publisher_lab = new JLabel("Publisher: ");
        publisher_lab.setBounds(0, 70, 100, 20);
        JTextField publisher = new JTextField();
        publisher.setBounds(100, 70, window_x - 100, 20);

        JLabel pub_year_lab = new JLabel("Publish year: ");
        pub_year_lab.setBounds(0, 90, 100, 20);
        JTextField pub_year = new JTextField();
        pub_year.setBounds(100, 90, window_x - 100, 20);

        info_input.add(author_name_lab);
        info_input.add(author_name);

        info_input.add(book_name_lab);
        info_input.add(book_name);

        info_input.add(pub_loc_lab);
        info_input.add(pub_loc);

        info_input.add(publisher_lab);
        info_input.add(publisher);

        info_input.add(pub_year_lab);
        info_input.add(pub_year);

        info_input.repaint();
    }

    /*
    public static void initMagazine() {
    }
    */

    public static void initNewspaper() {
        System.out.println("initNewspaper");
        citetype = "n";
        info_input.removeAll();

        JLabel author_name_lab = new JLabel("Author name: ");
        author_name_lab.setBounds(0, 10, 100, 20);
        JTextField author_name = new JTextField();
        author_name.setBounds(100, 10, window_x - 100, 20);
        
        JLabel title_lab = new JLabel("Title: ");
        title_lab.setBounds(0, 30, 100, 20);
        JTextField title = new JTextField();
        title.setBounds(100, 30, window_x - 100, 20);

        JLabel np_name_lab = new JLabel("Newspaper name: ");
        np_name_lab.setBounds(0, 50, 100, 20);
        JTextField np_name = new JTextField();
        np_name.setBounds(100, 50, window_x - 100, 20);

        JLabel pub_year_lab = new JLabel("Publish date: ");
        pub_year_lab.setBounds(0, 70, 100, 20);
        JTextField pub_year = new JTextField();
        pub_year.setBounds(100, 70, window_x - 100, 20);

        JLabel section_lab = new JLabel("Section: ");
        section_lab.setBounds(0, 90, 100, 20);
        JTextField section = new JTextField();
        section.setBounds(100, 90, window_x - 100, 20);

        JLabel column_lab = new JLabel("Column: ");
        column_lab.setBounds(0, 110, 100, 20);
        JTextField column = new JTextField();
        column.setBounds(100, 110, window_x - 100, 20);

        JLabel page_lab = new JLabel("Page: ");
        page_lab.setBounds(0, 130, 100, 20);
        JTextField page = new JTextField();
        page.setBounds(100, 130, window_x - 100, 20);

        
        info_input.add(author_name_lab);
        info_input.add(author_name);

        info_input.add(title_lab);
        info_input.add(title);

        info_input.add(np_name_lab);
        info_input.add(np_name);

        info_input.add(pub_year_lab);
        info_input.add(pub_year);

        info_input.add(section_lab);
        info_input.add(section);

        info_input.add(column_lab);
        info_input.add(column);

        info_input.add(page_lab);
        info_input.add(page);

        info_input.repaint();
    }

    public static void initWebsite() {
        System.out.println("initWebsite");
        citetype = "w";
        info_input.removeAll();

        JLabel author_name_lab = new JLabel("Author name: ");
        author_name_lab.setBounds(0, 10, 100, 20);
        JTextField author_name = new JTextField();
        author_name.setBounds(100, 10, window_x - 100, 20);
        
        JLabel book_name_lab = new JLabel("Book name: ");
        book_name_lab.setBounds(0, 30, 100, 20);
        JTextField book_name = new JTextField();
        book_name.setBounds(100, 30, window_x - 100, 20);

        JLabel pub_year_lab = new JLabel("Publish year: ");
        pub_year_lab.setBounds(0, 50, 100, 20);
        JTextField pub_year = new JTextField();
        pub_year.setBounds(100, 50, window_x - 100, 20);

        JLabel ind_date_lab = new JLabel("Index date: ");
        ind_date_lab.setBounds(0, 70, 100, 20);
        JTextField ind_date = new JTextField();
        ind_date.setBounds(100, 70, window_x - 100, 20);

        JLabel url_lab = new JLabel("URL: ");
        url_lab.setBounds(0, 90, 100, 20);
        JTextField url = new JTextField();
        url.setBounds(100, 90, window_x - 100, 20);


        info_input.add(author_name_lab);
        info_input.add(author_name);

        info_input.add(book_name_lab);
        info_input.add(book_name);

        info_input.add(pub_year_lab);
        info_input.add(pub_year);

        info_input.add(ind_date_lab);
        info_input.add(ind_date);

        info_input.add(url_lab);
        info_input.add(url);

        info_input.repaint();
    }

    public static void initJournal() {
        System.out.println("initJournal");
        citetype = "j";
        info_input.removeAll();

        JLabel author_name_lab = new JLabel("Author name: ");
        author_name_lab.setBounds(0, 10, 100, 20);
        JTextField author_name = new JTextField();
        author_name.setBounds(100, 10, window_x - 100, 20);
        
        JLabel title_lab = new JLabel("Title: ");
        title_lab.setBounds(0, 30, 100, 20);
        JTextField title = new JTextField();
        title.setBounds(100, 30, window_x - 100, 20);

        JLabel mg_name_lab = new JLabel("Maganize name: ");
        mg_name_lab.setBounds(0, 50, 100, 20);
        JTextField mg_name = new JTextField();
        mg_name.setBounds(100, 50, window_x - 100, 20);

        JLabel reel_num_lab = new JLabel("Reel number: ");
        reel_num_lab.setBounds(0, 70, 100, 20);
        JTextField reel_num = new JTextField();
        reel_num.setBounds(100, 70, window_x - 100, 20);

        JLabel issue_num_lab = new JLabel("Issue number: ");
        issue_num_lab.setBounds(0, 90, 100, 20);
        JTextField issue_num = new JTextField();
        issue_num.setBounds(100, 90, window_x - 100, 20);

        JLabel pub_year_lab = new JLabel("Publish year: ");
        pub_year_lab.setBounds(0, 110, 100, 20);
        JTextField pub_year = new JTextField();
        pub_year.setBounds(100, 110, window_x - 100, 20);

        JLabel page_lab = new JLabel("Page: ");
        page_lab.setBounds(0, 130, 100, 20);
        JTextField page = new JTextField();
        page.setBounds(100, 130, window_x - 100, 20);

        
        info_input.add(author_name_lab);
        info_input.add(author_name);

        info_input.add(title_lab);
        info_input.add(title);

        info_input.add(mg_name_lab);
        info_input.add(mg_name);

        info_input.add(reel_num_lab);
        info_input.add(reel_num);

        info_input.add(issue_num_lab);
        info_input.add(issue_num);

        info_input.add(pub_year_lab);
        info_input.add(pub_year);

        info_input.add(page_lab);
        info_input.add(page);

        info_input.repaint();

    }

    public static void outNon_latex() {
        System.out.println("outNon_latex");
        HashMap<String, String> data = getVal();
        System.out.println(data);

        String str = "";

        if (citetype == "b") {
            // Book
            str = (data.get("Author name: ") + 
                ". " + data.get("Book name: ") + 
                ". " + data.get("Publish area: ") + 
                ": " + data.get("Publisher: ") + 
                ", " + data.get("Publish year: ") + 
                ".");

        } else if (citetype == "w") {
            // Website
            str = (data.get("Author name: ") + 
                ". " + data.get("Book name: ") + 
                data.get("Publish year: ") + 
                ". " + data.get("Index date: ") + 
                " " + 
                data.get("URL: ") + 
                ".");

        } else if (citetype == "n") {
            // Newspaper
            str = (data.get("Author name: ") + 
                ". " + 
                data.get("Title: ") + 
                ". " + 
                data.get("Newspaper name: ") + 
                " " + data.get("Publish date: ") +  
                ", " + 
                "Section " + 
                data.get("Section: ") + 
                ", Column " + 
                data.get("Column: ") + 
                ", Page " + 
                data.get("Page: ") + 
                "."
                );
        } else if (citetype == "j") {
            // journy
            str = (data.get("Author name: ") + 
                ". " + 
                data.get("Title: ") + 
                ". " + 
                data.get("Maganize name: ") + 
                " " + 
                data.get("Reel number: ") + 
                ". " + 
                data.get("Issue number: ") + 
                "(" + 
                data.get("Publish year: ") + 
                "): " + 
                data.get("Page: ") + 
                "."
                );
        }

        JTextField output = (JTextField)info_output.getComponent(0);
        output.setText(str);
        info_output.repaint();
    }

    public static void outLatex() {
        System.out.println("outLatex");
        HashMap<String, String> data = getVal();
        System.out.println(data);

        String str = "";

        if (citetype == "b") {
            // Book
            str = (data.get("Author name: ") + 
                ". " + data.get("Book name: ") + 
                ". " + data.get("Publish area: ") + 
                ": " + data.get("Publisher: ") + 
                ", " + data.get("Publish year: ") + 
                ".");

        } else if (citetype == "w") {
            // Website
            str = (data.get("Author name: ") + 
                ". " + data.get("Book name: ") + 
                data.get("Publish year: ") + 
                ". " + data.get("Index date: ") + 
                " " + 
                data.get("URL: ") + 
                ".");

        } else if (citetype == "n") {
            // Newspaper
            str = (data.get("Author name: ") + 
                ". " + 
                data.get("Title: ") + 
                ". " + 
                data.get("Newspaper name: ") + 
                " " + data.get("Publish date: ") +  
                ", " + 
                "Section " + 
                data.get("Section: ") + 
                ", Column " + 
                data.get("Column: ") + 
                ", Page " + 
                data.get("Page: ") + 
                "."
                );
        } else if (citetype == "j") {
            // journy
            str = (data.get("Author name: ") + 
                ". " + 
                data.get("Title: ") + 
                ". " + 
                data.get("Maganize name: ") + 
                " " + 
                data.get("Reel number: ") + 
                ". " + 
                data.get("Issue number: ") + 
                "(" + 
                data.get("Publish year: ") + 
                "): " + 
                data.get("Page: ") + 
                "."
                );
        }

        String str_1 = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i + 1));
            String examed_char = str.substring(i, i + 1);
            if (examed_char.equals("\\") || examed_char.equals("%") || examed_char.equals("_")) {
                str_1 += "\\";
            }
            str_1 += str.charAt(i);
        }

        JTextField output = (JTextField)info_output.getComponent(0);
        output.setText(str_1);
        info_output.repaint();
    }

    public static HashMap<String, String> getVal() {
        HashMap<String, String> data = new  HashMap<String, String>();

        for (int i = 0; i < (info_input.getComponentCount()) / 2; i++) {
            JLabel key = (JLabel) info_input.getComponent(i * 2);
            JTextField val = (JTextField) info_input.getComponent(i * 2 + 1);
            data.put(key.getText(), val.getText());
        }
        return data;
    }
}
