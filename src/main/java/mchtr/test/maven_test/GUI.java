/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mchtr.test.maven_test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Administrator
 */

public class GUI extends JFrame {
    
    private JTabbedPane tabPane;
    private JPanel p1, p2, p3;
    private JButton b1, b2, b3;
    
    GUI()
    {
        tabPane = new JTabbedPane();
        p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        
        b1 = new JButton("Find objects on images");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                
            }
        });
        p1.add(b1, BorderLayout.SOUTH);
        tabPane.add(p1, "1st Tab");
        setLayout(new BorderLayout());
        add(tabPane);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
        //pack();
    }    
}
